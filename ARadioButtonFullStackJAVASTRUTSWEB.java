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
		
		languages = new ArrayList<Language>();
		languages.add("US","United States");
		languages.add("ES","Espanha");
		languages.add("BR","BRASIL");
		languages.add("CN","CHINA")
		
	}
	
	public String getDefaultLanguage() {
		return "BR";
	}
	
	public String getDefaultGender() {
		return "NOTBIN";
	}
	
	public String display() {
		return "none";
	}
	
	public String execute () throws Exception {
		return "success";
	}
}
package br.com.projeto.model;
public class Language {
	private String LanguageCode;
	private String LanguageDisplay;
	
	public Language(String LanguageCode ,String LanguageDisplay) {
		this.LanguageCode = LanguageCode;
		this.LanguageDisplay = LanguageDisplay;
	}
	
	
}

<!--xml!-->

<action name="radiobutton" class="br.com.projeto.action.RadioButton">
	<result name="none">radiobutton.jsp </action>
</action>

<action name="resultRadioButoon" class="br.com.projeto.action.RadioButton">
	<result name="success">resultRadioButton.jsp </action>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="radiobutton"/>
<s:a href="%{LINKX}">Radio Button </s:a>

<!--radiobutton.jsp!-->

<s:form action="resultRadioButton">

	<s:radio list = "languages"
	name="youLanguage" value="getDefaultLanguage" label="Language" listKey="LanguageCode" listValue="LanguageDisplay/>
	<s:radio name="youGender" value="getDefaultGender" label="Gender" list="genders">
	<s:radio list="#{'1 - yes' : '1 - yes' , '2 - no' : '2 - no'}"

</s:form>

<!--resultRadioButton!-->

<s:property value="youGender"/>
<br>
<s:property value="youAnswer"/>
<br>
<s:property value="youLanguage"/>
