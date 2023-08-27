<!--index.jsp!-->
<s:url var="LINKX" value="textareaaction"/>
<s:a href="%LINKX">Text Area </s:a>

<!--textareaaction!-->
<s:form action="textarearesult"/>
	<s:textarea name="address" col="10" rows="10"/>
</s:form>

<!--textarearesult!-->

<s:property value="address"/>

public class TextAreaAction extends ActionSupport {
	
	private String address;
	
	//ggas
	
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		return "success";
	}
}