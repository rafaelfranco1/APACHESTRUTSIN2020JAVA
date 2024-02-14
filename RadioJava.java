public class Language {
	
	private String languageCode;
	private String languageDisplay;
	
	public Language(String languageCode , String languageDisplay) {
		
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
		languages.add(new Language ("BR","Brasil");
		languages.add(new Language ("US","Estados Unidos");
		languages.add(new Language ("ES","Espanha");
		languages.add(new Language ("UK","Reino Unido");
		
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(NOTBIN);
		
	}
	
	public String getDefaultLanguage() {
		return "BR";
	}
	
	public String getDefaultGender() {
		return "NOTBIN";
	}
	
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
		
	}
  	
}