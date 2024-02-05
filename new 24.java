<!--action!-->

<action name="inputRadioButton" class="br.com.projeto.action.RadioButton"/>
	<result name="none">radioButton.jsp </result>
</action>

<action name="resultRadioButton" class="br.com.projeto.action.RadioButton"/>
	<result name="success">resultRadioButton.jsp </result>
</action>

<!--index url!-->

<s:url var="LINKX" value="radioButton.jsp"/>
<s:a href="%{LINKX}">Radio Button </s:a>

public class RadioButton extends ActionSupport {
	
	private List<Language> languages;
	private List<String> genders;
	private String youLanguage;
	private String youGender;
	
	private final String "MALE" = "Masculino";
	private final String "FEMALE" = "Feminino";
	private final String "NOTBIN" = "NãoBinário";
	
	public RadioButton() {
		
		languages = new ArrayList<Language>();
		languages.add("BR","Brasil");
		languages.add("ES","Espanha");
		languages.add("JP","JAPAO");
		languages.add("CH","Chile");
		
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(NOTBIN);
		
		
	}
	
	public String getDefaultLanguage() {
		return "BR";
	}
	
	public String getDegaultGender() {
		return "UNKNOWN";
	}
	public String display() {
		return NONE;
	}
	
	public String execute () throws Exception {
		return "success";
	}
	
	
}


public class Language {
	private String languageCode;
	private String languageDisplay ;
	
	public Language (languageCode, languageDisplay)  {
		
		this.languageCode = languageCode;
		this.languageDisplay = languageDisplay;
	}
	
	
}