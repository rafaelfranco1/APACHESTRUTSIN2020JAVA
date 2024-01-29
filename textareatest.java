<!--xml!-->

<action name="inputTextArea" class="br.com.projeto.action.TextAreaAction" method="display">
	<result name="none">textArea.jsp</result>
</action>

<action name="resultTextArea" class="br.com.projeto.action.TextAreaAction">
	<result name="success">resultTextArea</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="textArea.jsp">
<s:a href="{LINKX}">Text Area</s:a> 

<!--textArea.jsp!-->

<s:form action="resultTextArea">
	<s:textarea label="Endereço: " name="address" cols="30" rows="30"/>
</s:form>

<!--resultTextArea!-->

<s:property value="address">

public class TextAreaAction extends ActionSupport {
	
	private String address;
	
	//ggas
	
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
}