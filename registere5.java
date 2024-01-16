<!--xml!-->

<action name="registerInput" class="br.com.projeto.com.RegistrationAction" method="display">
	<result name="none">RegistrationInput</result>
</action>

<action name="registerOutput" class="br.com.projeto.action.RegistrationAction">
	<result name="success">RegistrationOutput</result>
</action>

<!--index.jsp!-->

<s:url var="LINK" value="registerInput"/>
<s:a href="{%LINKX}">RegistrationInput</s:a>

<!--registerInput!-->

<s:form action="registerOutput">

	<s:textfield key="username"/>
	<s:password key="username"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--registerOutput!-->

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
		if(getCp()!=null && getPassword != null) {
			if(getCp().equals(getPassword())) {
			
			}
			else {
				addFieldError("cp","password.notmatch");
			}
		}
		
	}
	
	public String display() {
		return "none";
	}
	
	public String execute() throws Exception {
		return "success";
	}
}