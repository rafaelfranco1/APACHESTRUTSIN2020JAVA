/*
<!--index!-->

<s:url var="LINKX" value="raum"/>
<a href="%{LINKX}">Registration</a>

<!-- raum!-->
<s:form action="
	<s:textfield name="username"/>
	<s:password name="password"/>
	<s:password name="confirmPassword"/>
 	<s:reset name="reset" key="reset"/>
	<s:submit name="submit" key="submit"/>

<!--radois-->

<s:property value="name"/>
<s:property value="password"/>*/

public class RAAction extends ActionSupport{
	
	private String name;
	private String password;
	private String confirmpassword;
	
	//gggas generate getters and setters;
	
	if("".equals(getUsername)) {
		addFieldError("username","Usuário não pode ser em branco");
	}
	
	if("".equals(getPassword)) {
		addFieldError("password","Senha não pode ser em branco");
	}
	
	if("".equals(confirmpassword)) {
		addFieldError("confirmpassword","Confirmar senha não pode ser em branco");
	}
	if(getPassword().equals(getConfirmPassword))) {
	//nada é feito aqui
	}

	else {
		addFieldError("confirmpassword",getText("Senhas diferentes");

	}
	
	
	
	public String display () {
		return NONE;
	}
	
	public String execute () throws Exception {
		
		return "success";
	}
	
}
