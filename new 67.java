<!--index.jsp!-->

<s:url var="LINKX" value="registeraction.jsp"/>
<s:a href="%LINKX"> Registration </s:a>

<!--registeraction !-->

<s:form action="registerResult">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
</s:form>

<!--registerResult!-->

<s:property value="username"/>
<br>
<s:propery value="password"/>

public class RegistrationAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//ggas
	
	public void validate() {
	
	if("".equals(getUsername())){
		addFieldError("username",getText("username.required");
	}
	if("".equals(getPassword()) {
		addFieldError("password",getText("username.required"));
	}
	if("".equals(getCp()) {
		addFieldError("cp",getText("cp.required"));
	}
	if(getCp.equals(getPassword)) {
		
	}
	else {
		addFieldError("cp",getText("password.notmatch"));
	}
	
	
	public String execute() throws Exception {
		return "success";
	}
	
	}
	
}