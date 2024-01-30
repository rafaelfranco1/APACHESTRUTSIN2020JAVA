<!--xml!-->

<action name="checkboxInput" class="br.projeto.action.CheckBoxAction" method="display">
	<result name="none">checkbox.jsp</resutlt>
</action>

<action name="checkboxResult" class="br.com.projeto.action.CheckBoxAction">
	<result name="success">resultCheckbox.jsp</result>
</action> 

<!--index.jsp!-->

<s:url var="LINKX" value="checkbox.jsp"/>
<s:a href="%{LINKX}">checkbox.jsp</s:a>

<!--checkbox.jsp!-->

<s:form action="resultCheckbox.jsp"/>
	<s:checkbox name="checkb" fieldValue="true" label="Chebox: "/>
</s:form>

<!--resultCheckbox!-->

<s:property value="checkb"/>

public class CheckBoxAction extends ActionSupport {
	
	private boolean checkb;
	
	//ggas
	
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
	
}