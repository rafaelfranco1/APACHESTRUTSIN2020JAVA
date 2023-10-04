<action name="radioButtonAction" class="br.com.projeto.action.RadioButton"/>
	<result name="none">radioButton.jsp</result>
</action>

<action name="resultRadioButton" class="br.com.projeto.action.RadioButton"/>
	<result name="success">resultRadioButton.jsp</result>
</action>

<!--radioButton.jsp!-->

<s:form action="resultRadioButton">

	<s:radio list="languages" name="youLanguage" label="Language: " listkey="languageCode" listValue="languageDisplay" 
	value="getDefaultLanguage"/>
	<s:radio list="genders" name="youGender" label="Gender: " value="getDefaultGender"/>
	<s:radio list="#{'1 - Yes':'1 - Yes' , '2 - No':'2 - No'}" name="youAnswer" value="getDefaultAnswer" label="Answer: "/> 
</s:form>

<!--resultRadioButton!-->

<s:property value="youLanguage"/> <br>
<s:property value="youGender"/> <br>
<s:property value="youAnswer"/>

br.com.projeto.model;

public class Language {
	
	private String LanguageCode;
	private String LanguageDisplay;
	
	public Language(String LanguagueCode , String LanguageDisplay) {
		LanguageCode = this.LanguageCode;
		LanguageDisplay = this.LanguageDisplay;
	}
}

public class RadioButton extends ActionSupport {
	
	private List<String> genders;
	private List<Language> languages;
	private static final String MALE = "Masculino";
	private static final String FEMALE = "Feminino";
	private static final String NOTBIN = "NãoBinário";
	
	private String youGender;
	private String youLanguage;
	private String youAnswer;
	
	public RadioButton() {
		
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(NOTBIN);
		
		languages = new ArrayList<String)();
		languages.add("US","Estados Unidos");
		languages.add("BR","Brasil");
		languages.add("CN","China");
		languages.add("PY","Paraguai");
	}
	
	public String getDefaultAnswer() {
		return "BR";
	}
	
	public String getDefaultGender() {
		return "NOTBIN";
	}
	
	public String getDefaultAnswer() {
		return "2 - No";
	}
	
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
}