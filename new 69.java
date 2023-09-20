<action name="radioButton" class="br.com.projeto.action.RadioButton" method="display">
	<result name="none">radioButton.jsp</result>
</action>

<action name="inputRadioButton" class="br.com.projeto.action.RadioButton">
	<result name="success">resultRadioButton </result>
</action>

//br.com.projeto.model
public class Language () {
	
	private String LanguageCode;
	private String LanguageDisplay;
	
	public Language(String LanguageCode, String LanguageDisplay) {
		
		LanguageCode = this.LanguageCode;
		LanguageDisplay = this.LanguageDisplay;
	}
	
}

public class RadioButton() extends ActionSupport {
	
	private List<String> gender;
	private List<Languages> language;
	private List<String> answer;
	
	public RadioButton() {
	
	gender = new ArrayList<String>();
	gender.add("Masculino");
	gender.add("Feminino");
	gender.add("Não binário");
	answer = new ArrayList<String>();
	answer.add("Yes");
	answer.add("No");
	}
	public String display() {
		return NONE;
	}
	
	public String execute () throws Exception {
		return "success";
	}
	
	
	
}