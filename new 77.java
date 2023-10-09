<!--textareaaction!-->

<s:textarea name="textarea" value="textarea" cols="10" rows="10"/>

<!--resulttextarea!-->

<s:property value="textarea"/>

public class TextAreaAction extends ActionSupport {
	
	
	
	
	
	private String textarea;
	
	//ggas
	
	
	
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
}