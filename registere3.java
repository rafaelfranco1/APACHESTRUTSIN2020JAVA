<!--xml!-->
<action name="registerInput" class="br.com.projeto.action.RegistrationAction" method="display">
	<result name="none">RegisterInput.jsp</result>
</action>

<action name="registerOutput" class="br.com.projeto.action.RegistrationAction">
	<result name="success">RegistrationOutput.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="registerInput"/>
<s:a href="{%LINKX}">Registration</s:a>

<!--RegisterInput!-->

<s:form action="registerOutput">

	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--RegisterOutput!-->

<s:property value="username"/>
<s:property value="password"/>

public class RegistrationAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	public void validate() { 
	
	if(getUsername().equals("") {
		addFieldError("username",getText("username.required"));
	}
	
	if(getPassword().equals("") {
		addFieldError("password",getText("password.required"));
	}
	
	if(getCp().equals("") {
		addFieldError("cp",getText("cpassword.required"));
	}
	
	if(getCp()!=null && getPassword ()!=null) {
		if(getCp().equals(getPassword()) {
			
		}
		
		else {
			addFieldError("cp","password.notmatch");
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