<!--index.jsp!-->
<s:url var="LINKX" value="textareainput"/>
<s:a href="%LINKX">Text Area </a>

<!--textareainput!-->
<s:form action="textareaoutput">
	<s:textarea name="address" cols="10" rows="10"/>
<s:/form>

<!--textareaoutput!-->

<s:property value="address"/>

public class TextAreaAction extends ActionSupport {
	
	private String address;
	
	//ggas
	
	public String display() {
		return "NONE";
	}
	public String execute() {
		return "success";
	}
	
	
	
}