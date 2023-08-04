/*<!--index.jsp!-->
<s:url var="LINKX" value="zzaction.jsp" /> <!-- colocando a extensão .jsp faz com que valores não chegem nulos!-->
<s:a href="%{LINKX}">Registration </s:a>

<!--zzaction.jsp!-->
<s:form action="zb">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:password key="submit" name="submit"/>
	<s:password key="reset" name="reset"/>
</s:form>

<!--zb!-->

<s:property value="username"/>
<s:property value="password"/>*/

public class ZZAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//ggas
	
	public void validate {
		
		if("".equals(getUsername())) {
			addFieldError("username","username.required");
		}
		
		if("".equals(getPassword())) {
			addFieldError("password","password.required");
		}
		
		if("".equals(getCp())) {
			addFieldError("cp","confirmPassword.required");
		}
		
		if(getUsername().equals(getPassword())) {
		
		}
		else`{
			addFieldError("cp","cpassword.notmatch");
		}			
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
	
}