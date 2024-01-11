<!--index.jsp!-->

<action name="registerInput" class="br.com.projeto.action.RegistrationAction" method="display"/>
	<result name="none">registrationInput.jsp </result>
</action>

<action name="registerOutput" class="br.com.projeto.action.RegistrationOutput"/>
	<result name="success">registrationOutput.jps</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="registerInput"/>
<s:a href="{%LINKX}">registrationInput</s:a>

<!--registerInput!-->

<s:form action="registerOutput">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
</s:form>

<!-- registeroutput!-->

<s:property value="username"/>
<s:property value="password"/>

public class RegistrationAction extends ActionSupport {
	
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
			addFieldError("cp","cpassword.required");
		}
		if(getPassword()!=null && getCp() !=null) {
			if(getUsername().equals(getCp()) {
				
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