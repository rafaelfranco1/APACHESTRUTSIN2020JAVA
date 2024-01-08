<!--action.jsp!-->
<action name="registrationInput" class="br.com.projeto.action.RegistrationAction">
	<result name="none"> registrationInput.jsp</result>
</action>

<action name="registrationResult" class="br.com.projeto.action.RegistrationAction">
	<result name="success">registrationResult.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="registrationInput"/>
<s:a href="{%LINK"> </s:a>

<!--registrationInput!-->

<s:form action="registrationResult">
	<s:texfiled key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:password key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

public class Registration extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//ggas
	
	public void validate() {
		
		if(getUsername().equals("")) {
			addFieldError("username","username.required");
		}
		
		if(getPassword().equals("")) {
			addFieldError("password","password.required");
		}
		if(getCp().equals("")) {
			addFieldError("cp","cp.required"); //choke point
		}
		
		if(getCp()!=null && getPassword !=null) {
			if(getCp().equals(getPassword())) {
				
			}
			else {
				addFieldError("cp","cp.notmatch");
			}
			
		}
		
		
		
	}
	
	
	public String display() {
		return NONE;
	}
	
	public String execute throws Exception {
		return "success";
	}
	
}