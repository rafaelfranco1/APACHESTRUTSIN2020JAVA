<action name="registrationResult" class="br.com.projeto.action.Registration"/>
	<result name="succes">registrationResult.jsp </result>
</action>

<!--index!-->

<s:url var="LINKX" value="registrationInput.jsp"/> <!--isso faz os valores não chegaram nulos!-->
<s:a href="%LINKX">Registration</s>

<!--registrationInput.jsp!-->

<s:form action="registrationResult">
	<s:textfield value="username"/>
	<s:password value="password"/>
	<s:password value="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--registrationResult!-->

<s:property value="username"/>
<br>
<s:property value="password"/>

public class Registartion extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//generate getters e setters
	
	public void validate() {
		
		if(getUsername.equals("")) {
			addFieldError("username","username.required");
		}
		if(getPassword.equals("")) {
			addFieldError("password","password.required");
		}
		if(getCp.equals("")) {
			addFieldError("cp","cpassword.required");
		}
		
		if(getUsername.equals(getPassword)) {
			
		}
		else {
			addFieldError("cp","cpassword.notmatch");
		
		}
	
	public String execute() throws Exception {
		return "success";
	}
	
	
}