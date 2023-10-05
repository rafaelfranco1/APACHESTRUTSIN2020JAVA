<!--xml!--> 

<action name="registration" class="br.com.projeto.action.RegistrationAction">
	<result name="success">registration.jsp</action>
<action>

<!--index.jsp!-->

<s:url var="LINKX" value="registration"/>
<s:a href="%{LINKX}">registration.jsp</s:a>

<!--registration.jsp!-->

<s:form action="registrationResult">

	<s:textfield key="name"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
</s:form>

<!--registrationResult.jsp!-->

<s:property value="username"/>
<s:property value="password"/>

public class RegistrationAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//ggas
	
	public String validate() {
		
		if("".equals(getUsername())) {
			addFieldError("username",getText("username.required"));
		}
		if("".equals(getPassword())) {
			addFieldError("password",getText("password.required"));
		}
		if("".equals(getCp())){
			addFieldError("cp",getText,"cp.required"));
		}
		
		if(getPassword.equals(getCp())){
			
		}
		
		else {
			addFieldError("cp",getText("password.notmatch"));
		}
	}
	
	
	
	
	
	public String execute() throws Exception {
		return "success";
	}
	
}
