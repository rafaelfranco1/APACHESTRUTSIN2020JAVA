<action name="radioButton" class="br.com.projeto.action.RadioButtonAction" method="display">
	<result name="none"> radioButton.jsp </result>
</action>

<action name="inputRadioButton" class="br.com.projeto.action.RadioButtonAction">
	<result name="success">resultRadioButton.jsp </result>
</action>

//radioButton backend controller

package br.com.projeto.action;

public class RadioButtonAction extends ActionSupport {
	
	private List<String> answer;
	private String<Language> languages; // language list do tipo languages
	private List<String> genders; // genders array list do tipo String 
	
	public RadioButtonAction() {
		
		answer = new ArrayList<String>();
		answer.add("Yes");
		answer.add("No");
		genders = new ArrayList<String>();
		genders.add("Masculino");
		genders.add("Feminino");
		genders.add("Não Binário");
	}
	
	
	
	public String display () {
		return NONE;
	}
	
	public String execute throws Exception() {
		System.out.println("Executou Radio Button");
		return "success";
	}
	
}

//radioButton.jsp
<title>Radio Button </title>
<h1> Radio Button </h1>
<s:form action="inputRadioButton">
	<s:radio label ="" name="answer" value="answe" list="answer"/>
	<s:radio name="
	<s:submit name="submit" key="submit"/>
</s:form>

//resultRadioButton
<title>Result Radio Button </title>
<h1> Result Radio Button </h1>
<h2> 
<s:property value="youGender"/>
<s:property value="youLanguage"/>
<s:property value="youAnswer"/> </h2>

//Language.java

package br.com.projeto.model;

public class Language {
	
	private String LanguageCode;
	private String LanguageDisplay;
	
	//ggas
	
	private Language(String LanguageCode , String LanguageDisplay) {
		
		LanguageCode = this.LanguageCode;
		LanguagueDisplay = this.LanguageDisplay;
		
	}
}
