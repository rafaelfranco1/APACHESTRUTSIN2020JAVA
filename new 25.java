<!--xml!-->

<action name="inputRadioButton" class="br.com.projeto.java.RadioButton" method="display">
	<result name="none">radioButton.jsp</result>
</action>

<action name="resultRadioButton" class="br.com.projeto.java.RadioButton">
	<result name="success">resultRadioButton.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="inputRadioButton">
<s:a href="{%LINKX}>Radio Button </s:a>

public class Language {
	
	private String languageCode;
	private String languageDisplay;
	
	public Language (languageCode , languageDisplay) {
		
		this.languageCode = languageCode;
		this.languageDisplay = languageDisplay;
	}
	
	
}

public class RadioButton extends ActionSupport {
	
	private List<String> genders;
	private List<Language> languages;
	private String youGender;
	private String youLanguage;
	private String youAnswer;
	
	private static final String MALE = "Masculino";
	private static final String FEMALE = "Feminino";
	private static final String NOTBIN = "NãoBinário";
	
	public RadioButton() {
		
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(NOTBIN);
		
		languages = new ArrayList<String>().
		languages.add("BR","Brasil");
		languages.add("ES","Espanha");
		languages.add("CH","Chile");
		languages.add("X","X");
		
	}
	
	public String getDefaultGender() {
		return "NOTBIN";
	}
	
	public String getDefaultLanguage() {
		return "BR";
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
	
}