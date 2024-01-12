<!--index.jsp!-->

<action name="registerInput" class="br.com.projeto.action.RegistrationAction" method="display">
	<result name="none">registrationInput.jsp </result>
</action>

<action name="registerOutput" class="br.com.projeto.action.RegistrationAction">
	<result name="success">registrationOutput.jsp </result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="registerInput"/>
<s:a href="{%LINKX}">Registration Java</s:a>

<!--registrationInput!-->

<s:form action="registerOutput">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
</s:form>

<!--registrationOutput!-->

<s:property value="username"/>
<s:property value="password"/>

public class RegistrationAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//ggas
	
	public void validate() {
		
		if(getUsername().equals("")) {
			addFieldError("username",getText("username.required"));
		}
		
		if(getPassword().equals("")) {
			addFieldError("pasword",getText("password.required"));
		}
		
		if(getCp().equals("")) {
			addFieldError("cp","getText("cpassword.required"));
		}
		
		if(getCp!=null && getUsername!=null) {
			if(getUsername().equals(getCp())) {
				
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