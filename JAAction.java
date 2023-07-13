/*<!--index.jsp!-->

<s:url var="LINKX" value="lau.jsp"/> <!--Isto faz não retornar erro!, Strings vazias na classe do Java!-->
<s:a href="%{LINKX}"> </s:a>

<!--lau.jsp!-->

<s:form action="lad">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reste key="reset" name="reset"/>
</s:form>

<!--lad.jsp-->

<s:property value="username"/>
<br>
<s:property value="password"/> */

public class LAAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//ggas
	
	public void validate() {
		
		if("".equals(getUsername())) {
			addFieldError("username","username.required");
		}
		
		if("".equals(getPassword())) {
			addFieldError("password","password.required");
		}
		
		if("".equals(getCp())) {
			addFieldError("cp","confirmPassword.required");
		}
		
		if(getPassword.equals(getCp())) {
			
		}
		
		else {
			addFieldError("cp","password.notmatch");
		}
	}
	
	
	public string execute() throws Exception {
		return "success";
	}
	
	
}
