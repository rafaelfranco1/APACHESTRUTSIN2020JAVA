<!--xml!-->

<action name="radioButton" class="br.com.projeto.action.RadioButton" method="display"/>
	<result name="none">radioButton.jsp </result>
</action>

<action name="inputRadioButton" class="br.com.projeto.action.RadioButton"/>
	<result name="success">resultRadioButton.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="radioButton"/>
<s:a href="%{LINKX}">radioButton </s>

<!--radioButton!-->
<s:form action="inputRadioButton">
	<s:radio list="languages" name="youLanguage" label="Languages: " value="DefaultLanguageValue" listKey="languageCode"
	listValue="languageDisplay"/>
	<s:radio list="genders" name="youGender" label="Genders :" value="DefaultGenderValue"/>
	<s:radio list="#{'1 - yes':'1 - yes','2 - no':'2 -no'}" label="Genders" name="youGender" value="2"/>
	<s:submit key="submit" name="submit"/>
</s:form>

<!--resultRadioButton!-->

<s:property value="youLanguage"/>
<br>
<s:property value="youGender"/>
<br>
<s:property value="youAnswer"/>

public class Language {
	
	private String languageCode;
	private String languageDisplay;
	
	public Language (String languageCode , String languageDisplay) {
		this.languageCode = languageCode;
		this.languageDisplay = languageDisplay;
	}
	
}

public class RadioButton extends ActionSupport {
	
	private List<Language> languages;
	private List<String> genders;
	
	private String youGender;
	private String youAnswer;
	private String youLanguage;
	
	private final String MALE="Masculino";
	private final String FEMALE="Feminino";
	private final String NOTBIN="NãoBinário";
	
	//ggas
	
	public RadioButton() {
		
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(NOTBIN);
		
		languages = new ArrayList<Language>();
		languages.add = (new Language ("BR","BRASIL");
		languages.add = (new Language ("US","Estados Unidos");
		languages.add = (new Language ("ES","Espanha");
		languages.add = (new Language ("RU","Russia");
	}
	
	
	public String display() {
		return NONE;
	}
	
	public String execute () throws Exception {
		return "success";
	}
}