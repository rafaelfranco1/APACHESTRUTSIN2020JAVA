<!--xml!-->
<action name="registration" class="br.com.projeto.action.RegistrationAction">
	<result name="success">registerResult.jsp</result>
</action>

<!--index!-->
<s:url var="LINKX" value="register.jsp"/>
<s:a href="%{LINKX}"/>

<!--register.jsp!-->

<s:form action="registration">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--registerResult.jsp!-->

<s:property value="username"/>
<s:property value="password"/>


public class RegistrationAction extends ActionSupport {
	
	private String username ;
	private String password ;
	private String cp;
	
	//generate ggas ;
	
	public void validate() {
		
		if("".equals(getUsername())) {
			addFieldError("username","username.required");
		}
		
		if("".equals(getPassword())) {
			addFieldError("password","password.required");
		}
		
		if("".equals(getCp())) {
			addFieldError("cp","cpassword.required");
		}
		
		if(getUsername().equals(getCp)) {
			
		}
		
		else {
			addFieldError("cp","password.notmatch");
		}
	}
	
	public String execute () throws Exception {
		return "success";
	}
	
}
