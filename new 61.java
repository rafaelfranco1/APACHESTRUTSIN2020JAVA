<!--index.jsp!-->
<s:url var="LINKX" value="registeraction"/>
<s:a href="%{LINKX}">Registration</s:a>

<!--registrationaction!-->

<s:form action="registrationresult">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
</s:form>

<!--registrationresult!-->

<s:property value="username"/>
<s:property value="password"/>

public class RegistrationAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//ggass
	
	public void validate() {
	
	if("".equals(getUsername)) {
		addFieldError("cp",getText("username.required");
	}
	
	if("".equals(getPassword)) {
		addFieldError("password",getText("password.required"));
	}
	if("".equals(getCp)) {
		addFieldError("cp",getText("confirmPassword.required");
	}
	public string execute() throws Exception {
		return "success";
	}
	
	if(getUsername.equals(getCp)) {
		
	}
	
	else {
		addFieldError("cp","password.notmatch");
	}
	
	}
}