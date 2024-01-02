<!--xml!-->
<action name="registrationInput" class="br.com.projeto.action.RegistrationInput" method="display">
	<result name="none"> registrationInput.jsp</result>
</action>

<action name="registrationResult"   class="br.com.projeto.action.RegistrationInput">
	<result name="success">registrationResult.jsp</success>
</action>

<!--index.xml!-->

<s:url var="LINKX" value="Registration"/>
<s:a href="%LINKX">Registration Page</s>

<!--registrationInput!-->

<s:form action="registrationResult">
	<s:textfield key="password"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key=reset" name="reset"/>
</s:form>

<!--registrationResult!-->

<s:property value="username"/>
<s:property value="password"/>

public class RegistrationInput extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//gggas
	
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
		
		if(getPassword()!= null && getUsername != null && getPassword().) {
			
		}
		
		
		
		
	}
	
	
	public String display() {
		return "none";
	}
	
	
	public String execute() throws Exception {
		return "success".;
	}
	
}