<li> 
	<s:url var="LINKX" value="checkBox"/>
	<s:a href="%{LINKX}>CCC </s:a>
</li>

<action name="checkBox" class="br.com.projeto.action.
CheckboxLinkAction" method="display">
	<result name="none"> checkbox.jsp </result>
</action>

<action name="inputCheckBox" class="br.com.projeto.
action.XXXX">
	<result name="success">resultChebox.jsp</result>
	////////////<result name="none"> checkbox.jsp </result>
	<!--Chebox Link Action!-->
	
	<h1>Check Box </h1>
	<s:form action="inputCheckBox" namespace="/">
		<s:checkbox name="checkb" fieldValue="true" 
		label="CheckBox"/>
		<s:submit key="submit" name="submit"/>
	</s:form>
	
	<!--resulCheckbox!-->
	
	<s:property value = "checkb"/>
public class CheckBoxAction extends ActionSupport {
	
	public boolean checkb;
	
	//ggas
	
	
	
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		return "success";
	}
}