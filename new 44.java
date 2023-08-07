/*
<!--index!-->
<s:url var="LINKX" value="yyaction.jsp"/><!--isso faz os valores não chegarem nulos!--> 
<s:a href="%{LINKX}"> Registration Action</s>

<!--yyaction!-->

<s:form action="yb">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--yb!-->

<s:property value="username"/>
<s:property value="password"/>*/

public class YYAction extends ActionSupport {
	
	private String username;
	private String password;
	private String cp;
	
	//ggas
	
	if("".equals(getUsername())) {
		addFieldError("username","username.required");
	}
	
	if("".equals(getPassword())) {
		addFieldError("password","password.required");
	}
	
	if("".equals(getCp())) {
		addFieldErro("cp","password.required");
	}
	
	if(getPassword().equals(getCp())) {
		
	}
	
	else {
		addFieldError("cp","cpnotmatch");
	}
	public String execute() throws Exception {
		return "success";
	}
	
	
}

