<!--index.jsp!-->

<action name="inputTextArea" class="br.com.projeto.action.TextArea" method="display">
	<result name="none">textArea.jsp</result>
</action>

<action name="resultTextArea" class="br.com.projeto.action.TextArea">
	<result name="success">resultTextArea.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="inputTextArea"/>
<s:a href="{%LINKX}">Text Area</s:a>

<!--textArea!-->

<s:form action="resultTextArea">
	<s:textarea name="address" key="address" cols="30" value="30"/>
	<s:submit key="submit"/>
</s:form>

public class TextArea extends ActionSupport {
	
	private String address;
	
	//ggass
	
	
	public String display() {
		return "none";
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
}

