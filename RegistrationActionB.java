<!--xml!-->

<action name="registerInput" value="br.com.projeto.action.RegistrationAction" method="display">
	<result name="none">registrationInput.jsp </result>
</action>

<action name="registerOutput" value="br.com.projeto.action.RegistrationResult">
	<result name="success">registrationOutput.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="registerInput"/>
<s:a href="{LINKX}>RegistrationAction </s:a>

<!--registrationInput!-->
<s:form action="registerOutput">
	<s:textfield key="username"/> <!--pode ser encontrado nos properties!-->
	<s:password key="password"/>
	<s:password key=cp"/>
	<s:password key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--registrationOutput!-->

<s:textfield value="username"/>
<s:password value="password"/>

public class RegistrationAction extends ActionSupport {
	
	private String username;
	private String passsword;
	private String cp;
	
	//ggas
	public void validate() {
	if(getUsername().equals("")) {
		addFieldError("username",getText("username.required"));
	}
	
	if(getPassword().equals("")) {
		addFieldError("password",getText("password.required"));
	}
	
	if(getCp().equals("")) {
		addFieldError("cp",getText("cpassword.required"));
	}
	
	if(getCp !=null && getPassword !=null ) {
		if(getCp().equals(getPassword())) {
			
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