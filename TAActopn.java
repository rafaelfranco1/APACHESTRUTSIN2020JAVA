/*
<!--JSP!-->

<s:url var="LINKX" value="taaum.jsp"/> <!--isso faz que não vá variáveis nulas!-->
<a href="%{LINKX}">Register2</a>

<!--taa.jsp!-->
<s:form action="taaum">
	<s:textfield name="username"/>
	<s:password name="password"/>
	<s:password name="cp"/>
	<s:submit name="submit" key="submit"/>
</s:form> <!-- Os names são encontrados no global properties. O nome cp é de confirmPassword em uma forma abreviada!-->

<!--tadois!-->
<s:property value="username"/>
<s:property value="password"/>*/

public class TAAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//gggas generate getters and setter;
	
	if("".equals(getUsername())) {
		addFieldError("username",getText("username.required"); //encontrado o password.required no global properties.;
	}
	
	if("".equals(getPassword())) {
		addFieldError("password",getText("password.required"); //encontrado o password.required no global properties.;
	}
	
	if("".equals(getCp())) {
		addFieldError("cp",getText("confirmPassword.required"); //encontrado o password.required no global properties.;
	}
	
	if(getPassword.equals(getCp())) {
		
	}
	else {
		addFieldError("cp",getText("password.notmatch");
	}
	
	public String execute() throws Exception
		return success;
	}
	
}

