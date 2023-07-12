<!--index.jsp!-->

<s:url var="LINKX" value="maaction.jsp"/>
<s:a href="%{LINKX}">RegAction</s: a> 

<!--maaction!-->

<s:form action="mad">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--mad!-->

<s:property value="username"/>
<br>
<s:property value="password"/>

public class MAAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//ggas
	
	if("".equals(getUsername())) {
		addFieldError("username","username.required");
	}
	
	if("".equals(getPassword())) {
		addFieldError("password","password.required");
	}
	if("".equals(getCp())){
		addFieldError("cp","confirmPassword.required");
	}
	
	if(getPassword().equals(getCp())) {
		
	}
	
	else {
		addFieldError("cp","password.notmatch");
	}
	
	public String execute() throws Exception {
		return "success";
	}
}