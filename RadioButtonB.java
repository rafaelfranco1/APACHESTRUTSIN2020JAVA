<!--xml!-->

<action name="radioButton" class="br.com.projeto.action.RadioButton" method="display"/> 
	<result name="none">radioButton.jsp</result>
</action>

<action name="inputRadioButton" class="br.com.projeto.action.RadioButton"/>
	<result name="success">resultRadioButton </result>
</action>

<!--index !-->

<s:url var="LINKX" value="radioButton"/>
<s:a href="%{LINKX}">Radio Button</s:a>

<!--radioButton.jsp!-->//chockpoint possível erro
<s:form action="inputRadioButton">
	<s:radio name="youLanguage" list="languages" listKey="languageCode" listValue="languageDisplay" label="Languages :"
	value="getDefaultLanguage"/>
	<s:radio name="youGender" list="genders" value="getDefaultGender" label="Genders :"/>
	<s:radio list="#{'1 - Yes' : '1 - Yes' , '2 - No' - '2 - No'}" name="youAnswer" value="2" label="Answer: "/>
	<s:submit key="submit" name="submit"/>
</s:form>

<!--inputRadioButton!-->

<s:property value="youLanguage"/>
<br>
<s:property value="youGender"/>
<br>
<s:property value="youAnswer"/>

--------------------<!--end front!-->

public class Language {//chockpoint possível erro
	
	private String languageCode;
	private String languageDisplay;
	
	public Language(String languageCode , String languageDisplay) {
		
		this.languageCode = languageCode;
		this.languageDisplay = languageDisplay;
	}
	
}

public class RadioButton extends ActionSupport {
	
	private List<String> genders;
	private List<Language> languages;
	
	private String youAnswer;
	private String youLanguage;
	private String youGender;
	
	private static final String MALE="Masculino";
	private static final String FEMALE="Feminino";
	private static final String NOTBIN="NaoBinario";
	
	//ggas

	public RadioButton() {
		
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(NOTBIN);
		
		languages = new ArrayList<Languages>();//chockpoint possível erro
		languages.add(new Languague("BR","BRASIL"));
		languages.add(new Languague("ES","Espanha"));
		languages.add(new Languague("RU","Russia"));
		languages.add(new Languages("CL","Chile"));
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
	
	public String execute() throws Exception {
		return "success";
	}
	
}