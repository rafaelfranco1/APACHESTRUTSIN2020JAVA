<!--xml!-->

<action name="inputRadioButton" class="br.com.projeto.action.RadioButtonAction">
	<result name="none">radioButton.jsp</result>
</action>

<action name="resultRadioButton" class="br.com.projeto.action.RadioButtonAction">
	<result name="success">resultRadioButton</result>
</action>

<!--index.xml!-->

<s:url var="LINKX" value="inputRadioButton"/>
<s:a href="{LINKX}">Radio Button </s:a>

<!--radioButton!-->
<s:form action="resultRadioButton">
	<s:radio list="languages" name="youLanguage" value="getDefaultLanguageValue" HeaderKey="languageCode" 
	HeaderValue="languageDisplay" label="Languages :"/>
	<s:radio list="genders" name="youGender" value="getDefaultGenderValue" label="Genders :"/>
	<s:radio list="#{'1' : 'Yes' , '2' : 'No'}" name="youAnswer" value="2" label="Answer :"/>
</s:form>

<!--resultRadioButton!-->

<s:property value="youLanguage"/>
<s:property value="youGender"/>
<s:property value="youAnswer"/>

<!--classe Languages!-->

public class Language {
	
	private String languageCode;
	private String languageDisplay;
	
	public Language(languageCode, languageDisplay) {
		
		this.languageCode = languageCode;
		this.languageDisplay = languageDisplay;
	}
	
	
}

public class RadioButtonAction extends ActionSupport {
	
	private List<Language> languages;
	private List<String> genders;
	private String youLanguage;
	private String youGender;
	private String youAnswer;
	
	
	private static final String MALE = "Masculino";
	private static final String FEMALE = "Feminino";
	private static final String NOTBIN = "NAOBINARIO";
	//ggas
	
	public RadioButtonAction() {
		
		languages = new ArrayList<Language>();
		languages.add(new Language ("BR","Brasil"));
		languages.add(new Language ("ES","Espanha"));
		languages.add(new Language("CN","China"));
		languages.add(new Language("US","UnitedStates"));
		
		genders = new ArrayList<genders>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(NOTBIN);
		
	}
	
	public String getDefaultLanguageValue() {
		return "BR";
	}
	
	public String getDefalutGenderValue() {
		return "NOTBIN";
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
}