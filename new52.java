<!--index.jsp!-->

<s:url var="LINKX" value="registrationaction.jsp"/>
<s:a href="%LINKX">Registration Action </s:a>

<!--RegistrationAction!-->

<s:form action="registrationresult">

	<s:textfield key="username"/>
	<s:textfield key="password"/>
	<s:textfield key="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--RegistrationResult!-->

<s:property value="username"/>
<br>
<s:property value="password"/>

public class RegistrationAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//genarate getters and setter
	
	if("".equals(getUsername())){
		addFieldError("username","username.requerid");
	}
	if("".equals(getPassword())){
		addFieldError("password","password.requerid");
	}
	if("".equals(getCp())) {
		addFieldError("cp","password.requerid");
	}
	if(getUsername().equals(getCp())){
		
	}
	else {
		addFieldError("cp","password.notmatch");
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
}