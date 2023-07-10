/*
<!--index.jsp!-->

<s:url var="LINKX" value="paaum.jsp"/> isso faz não retornar strings nulas 
<a href="LINKX"></a>

<!--paaum!-->

<s:form action="paadois">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--paddois-->

<s:property value="username"/>
<br>
<s:property value="password/">
*/

public class PAAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//gggas
	public void validate() {
	if("".equals(getUsername())){
		addFieldError("username",getText("username.required"));
	}
	
	if("".equals(getPassword())) {
		addFieldError("password",getText("password.required"));
	}
	if("".equals(getCp())){
		addFieldError("cp",getText("cp.required"));
	}
	
	if(getPassword.equals(getCp())) {
		
	}
	else {
		addFieldError("passwordnotmatch",getText("password.notmatch"));
	}
	
	}
}