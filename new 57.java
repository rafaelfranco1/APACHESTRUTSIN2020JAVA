<!--index.jsp!-->
<s:url var="LINKX" value="shaka"/>
<s:a href="%{LINKX}> Registration </s:a>

<!--shaka!-->

<s:form action="result">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--result!-->

<s:property value="username"/>
<s:property value="password"/>

public class RegAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//ggas
	
	public void validate {
		if("".equals(getUsername())) {
			addFieldError("username",getText("username.required");
		}
		if("".equals(getPassword()){
			addFieldError("password",getText("password.required");
		}
		if("".equals(getCp()){
			addFieldError("cp",getText(getText("confirmPassword.required");
		}
		
		if(getUsername().equals(getUsername())) {
			
		}
		
		else {
			
			addFieldError("cp",getText("password.notmatch");
		}
	}
	public String execute () throws Exception {
		return "success";
	}
	
}