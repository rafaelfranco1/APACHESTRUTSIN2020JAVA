public class RadioButtonAction extends ActionSupport {
	
	private List<String> genders;
	private List<Language> language;
	
	private String youGender;
	private String youAnswer;
	private String youLanguage;
	
	private static final String MALE = "Masculino";
	private static final String FEMALE = "Feminino";
	private static final String UNKNOWN = "NãoBinário";
	
	public RadioButtonAction() {
		
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(UNKNOWN);
	
		language = new ArrayList<Language>();
		language.add("US","Estados Unidos");
		language.add("BR","Brasil");
		language.add("CH","CHILE");
		language.add("PY","Paraguai");
	}
	public String getDefaultGender() {
		return UNKNOWN;
	}
	
	public String getDefaultLanguage() {
		return "BR";
	}
	
	public String getDefaultAnswer() {
		return "NO";
	}
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
}

public class Language () {
	
	private String languageCode;
	private String languageDisplay;
	
	public Language(String languageCode , String languageDisplay) {
		languageCode = this.LanguageCode;
		languageDisplay = this.LanguageDisplay;
	}
}

<action name="radioButton" class="br.com.projeto.action.RadioButton">
	<result name="none">radioButton.jsp </result>
</action>

<action name="inputRadioButton" class="br.com.projeto.action.RadioButton">
	<result name="success">resultRadioButton.jsp </result>
</action>
