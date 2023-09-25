public class RadioButtonAction extends ActionSupport {
	
	private List<String> gender;
	private List<Language> language;
	
	private String youGender;
	private String youLanguage;
	
	private static final MALE="Masculino";
	private static final FEMALE="Feminino";
	private static final UNKNOWN="NãoBinário";
	
	public String getDefaultGender() {
		return "UNKNOWN";
	}
	
	public String getDefaultLanguage() {
		return "BR";
	}
	
	public RadioButtonAction() {
		
		gender = new ArrayList<String>();
		gender.add(MALE);
		gender.add(FEMALE);
		gender.add(UNKNOWN);
		
		language = new ArrayList<String>();
		language.add("BR","BRASIL");
		language.add("ES","ESPANHA");
		language.add("US","Estados Unidos");
		language.add("CH","Chile");
		language.add("UK","United Kingdon");
	}
	
	
	public String display () {
		return NONE;
	}
	
	public String execute () throws Exception {
		return "success";
	}
	
}

public model Language {
	
	private String LanguageDisplay;
	private String LanguageCode;
	
	public Language (String LanguageCode , String LanguageDisplay) {
		LanguageDisplay = this.LanguageDisplay;
		LanguageCode = this.LanguageCode;
	}
	
	
	
}