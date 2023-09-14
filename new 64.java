<!--index.jsp!-->
<s:url var="LINKX" value="textarea"/>
<s:a href="%{LINKX}">Text Area Action </s:a>

<!--textarea!-->
<s:form action="resultTextarea">
	<s:textarea name="address" cols="10" rows="10"/>
</s:form>

<!--resultTextarea!-->

<s:property value="address"/>

public class TextAreaAction extends ActionSupport {
	
	private String address;
	
	//ggas
	
	public String execute () throws Exception {
		return "success";
	}
	
	public String display() {
		return "www.google.com.br";
	}
	
}