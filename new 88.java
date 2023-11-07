<!--xml!-->

<action name="textAreaAction" class="br.com.projeto.action.TextAreaAction" method="none">
	<result name="none">textArea.jsp</result>
</action>

<action name="resultTextArea" class="br.com.projeto.action.TextAreaAction">
	<result name="success">resultTextArea.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="textAreaAction"/>
<s:a href="%{LINKX}">Text Area</s:a>

<!--textArea.jsp!-->
<s:submit action="resultTextArea">
	<s:textarea name="address" cols="30" rows="30"/>
</s:submit>

<!--resultTextArea!-->

<s:property value="address"/>

public class TextAreaAction extends ActionSupport {
	
	private String address;
	
	//ggas
	
	
	public String execute() throws Exception {
		return "success";
		
	
	
	public String display() {
		return NONE;
	}
	
	
	
}