<!--xml!-->

<action name="checkboxInput" class="br.com.projeto.action.CheckboxAction" method="display"/>
	<result name="none">checkbox.jsp</result>
</action>

<action name="resultCheckBox" class="br.com.projeto.action.CheckboxAction"/>
	<result name="success">resultCheckbox.jsp </result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="checkboxInput"/>
<s:a href="%{LINKX}">Check box  </s:a>

<!--checkboxInput.jsp!-->

<s:form action="resultCheckBox">
	<s:checkbox name="checkb" label="Thats a CheckBox"/>


</s:form>

<!--resultCheckbox!-->

<s:property value="checkb"/>

public class CheboxActiox extends ActionSupport {
	
	public boolean checkb;
	
	//ggaas
	
	
	public String display() {
		return "none";
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
}