<!--xml!-->

<action name="textArea" class="br.com.projeto.action.TextArea"/>
	<result name="none">textArea.jsp</result> 
</action>

<action name="resultTextArea" class="br.com.projeto.action.TextArea"/>
	<result name="success">resultTextArea.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="textArea"/>
<s:a href="%{LINKX}">Text Area</s:a>

<!--textArea!-->
<s:form action="resultTextArea">
	<s:textarea name="address" label="Endereço" cols="30" rows="30"/>
</s:form>

<!--resultTextArea!-->

<s:property value="address"/>

public class TextArea extends ActionSupport {
	
	private String address;
	
	//ggas
	
	
	
	
	public String display() {
		return "none";
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
	
}