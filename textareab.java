<!--action xml!-->

<action name="inputTextArea" class="br.com.projeto.action.TextAreaAction">
	<result name="none">textArea.jsp </result>
</action>

<action name="resultTextArea" class="br.com.projeto.action.TextAreaAction">
	<result name="success">resultTextArea.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="textArea.jsp"/>
<s:a href var="{%LINKX}"> Text Area Action Link </s:a>

<!--textArea.jsp!-->

<s:form action="resultTextArea.jsp">
	<s:textarea name="address" cols="30" rows="10" label="Digite o endereço"/>
</s:form>

<!--resultTextArea.jsp!-->

<s:property value="address"/>

public class TextAreaAction extends ActionSupport {
	
	private String address;
	
	//ggass
	
	
	
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		return "success";
	}
}	