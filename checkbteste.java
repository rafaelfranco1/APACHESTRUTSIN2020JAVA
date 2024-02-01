<!--xml!-->

<action name="checkBoxInput" class="br.com.projeto.action.CheckBoxAction" method="display"/>
	<result name="none">checkbox.jsp </result>
</action>

<action name="checkboxResult" class="br.com.projeto.action.CheckBoxAction">
	<result name="success">resultCheckBox.jsp</action>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="checkboxInput"/>
<s:a href="%{LINKX}">CheckBox </s:a>

<!--checkbox.jsp!-->

<s:form action="checkboxResult">
	<s:checkbox name="checkb" fieldValue="true" label="ThatCheckbox :"/>
</s:form>

<!--resultCheckbox!-->

<s:property value="checkb"/>

public class CheckboxAction extends ActionSupport {
	
	private boolean checkb;
	
	//ggas
	
	
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
}