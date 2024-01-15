<!--xml !-->

<action name="registerInput" action="br.com.projeto.action.RegistrationAction" method="display">
	<result name="none">registerInput.jsp</result>
</action>

<action name="registerOutput" action="br.com.projeto.action.RegistrationOutput">
	<result name="success">registerOutput.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="registerInput"/>
<s:a href="{%LINKX}>registerInput</s:a>

<!--registerInput!-->

<s:form action="registerOutput">
	<s:textfield value="username"/>
	<s:password value="password"/>
	<s:password value="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--registerOutput!-->

<s:property value="username"/>
<s:property value="password"/>

public class RegistrationAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//ggas
	
	public void validate() {
		
		if(getUsername().equals("")) {
			addFieldError("username","username.required");
		}
		if(getPassword().equals("")) {
			addFieldError("password","password.required");
		}
		if(getCp().equals("")) {
			addFieldError("cp","cp.required");
		}
		if(getCp!=null && getPassword!=null) {
			if(getCp().equals(getPassword())) {
				
			}
			else {
				addFieldError("cp","cpassword.notmatch");
			}
		}
	}
	
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		return "success";
	}
}