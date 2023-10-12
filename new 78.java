<!--xml!-->

<action name="radioButton" class="br.com.projeto.action.RadioButton"/ method="display">
	<result name="none">radioButton.jsp</result>
</action>

<action name="inputRadioButton" class="br.com.projeto.action.RadioButton">
	<result name="success">resultRadioButton.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="radioButton"/>
<s:a href="%LINKX">Radio Button </s:a>

<!--radioButton.jsp!--> 

<s:radio list="languages" name="youLanguage" label="Languages: " listkey="languageCode" listValue="languageDisplay"/>
<s:radio list="genders" name="youGender" label="Genders :"/>
<s:radio list="#{'1 - Yes':'1 - Yes','2 - No':'2 - No'}"

<!--resultRadioButton!-->

<s:property value="youLanguage"/>
<br>
<s:property value="youGender"/>
<br>
<s:property value="youAnswer"/>

package br.com.projeto.model;
public class Language {

	private String languageCode;
	private String languageDisplay;
	
	public Language(String languageCode , String languageDisplay) {
		languageCode = this.languageCode;
		languageDisplay = this.languageDisplay;
	}

}	

public class RadioButton extends ActionSupport {
	
	private List<String> genders;
	private List<Language> languages;
	
	private String youGender;
	private String youAnswer;
	private String youLanguage;
	private static final String MALE = "Masculino";
	private static final String FEMALE = "Feminino";
	private static final String NOTBIN = "NOTBIN";
	
	public RadioButton() {
	
	genders = new ArrayList<String>();
	genders.add(MALE);
	genders.add(FEMALE);
	genders.add(NOTBIN);
	
	languages = new ArrayList<Language>();
	language.add("US","Estados Unidos");
	language.add("BR","Brasil");
	language.add("CL","Chile");
	language.add("CN","China");
	}
	public String display() {
		return NONE;
	}
	
	
	public String execute throws Exception {
		return "success";
	}
}