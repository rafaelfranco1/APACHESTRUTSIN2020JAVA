<action name="checkBoxAction" class="br.com.projeto.action.cheboxAction" method="display">
	<result name="none">cheboxaction.jsp</result>
</action>

<action name="resultCheckBox" class="br.com.projeto.action.cheboxAction">
	<result name="success">resultChebox.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="cheboxAction"/>
<s:a href="%LINKX">CheboxStruts2Java</s:a>

<!--cheBoxAction!-->
<s:form action="resultChebox">
	<s:checkbox name="checkb" value="chekb" fieldValue="true" label="Chebox"/>
</s:form>

<!--resultChebox!-->

<s:property value="checkb"/>

public class checkboxAction extends ActionSupport {
	
	private boolean checkb;
	
	//ggas
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		
	}
}