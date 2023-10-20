<!--xml!-->
<action name="radioButton" class="br.com.projeto.action.RadioButton"/>
	<result name="none">radioButton.jsp</result>
</action>

<action name="inputRadioButton" class="br.com.projeto.action.RadioButton"/>
	<result name="success">resultRadioButton.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="radioButton"/>
<s:a href="%{LINKX}">radioButton.jsp</s:a>

<!--radioButton.jsp!-->

<s:form action="resultRadioButton">
	<s:radio list="languages" listKey="languageCode" listValue="languageDisplay" name="youLanguage" 
	value="getDefaultLanguage" label="Languages :"/>
	<s:radio list="genders" name="youGender" value="getDefaultGender" label="Genders :"/>
	<s:radio list="#{'1 - Yes' : '1 - Yes' , '2 - No' : '2- No'}" name="youAnswer" value="2" label="Answer :"/>
</s:form>

<!--inputRadioButton!-->

<s:property value="youLanguage"/>
<br>
<s:property value="youGender"/>
<br>
<s:property value="youAnswer"/>

public class Language {
	
	private String LanguageCode;
	private String LanguageDisplay;
	
	public Language(String LanguageCode ; String LanguageDisplay) {
		this.LanguageCode = LanguageCode;
		this.LanguageDisplay = LanguageDisplay;
	}
}

public class RadioButton extends ActionSupport {
	
	private List<Language> languages;
	private List<String> genders;
	
	private String youLanguage;
	private String youAnswer;
	private String youGender;
	
	private final String MALE="Masculino";
	private final String FEMALE="Feminino";
	private final String NOTBIN="NaoBinario";
	
	//ggas
	
	public RadioButton() {
		languages = new ArrayList<Language>();
		languages.add(new Language ("US","Estados Unidos");
		languages.add(new Language ("BR","Brasil");
		languages.add(new Language ("RU","Russia");
		languages.add(new Language ("CL","Chile");
		
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(NOTBIN);
	}
	
	public String getDefaultGender() {
		return NOTBIN;
	}
	
	public String getDefaultLanguage() {
		return "BR";
	}
	
	
	public String display() {
		return NONE;
	}
	
	public String execute () throws Exception {
		return "success";
	}
	
	
}