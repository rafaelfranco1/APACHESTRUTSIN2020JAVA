<!--index.jsp!-->

<s:url var="LINKX" value="maaction.jsp"/>
<s:a href="%{LINKX}">RegAction</s: a> 

<!--maaction!-->

<s:form action="mad">
	<s:textfield key="username"/>
	<s:password key="password"/>
	<s:password key="cp"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--mad!-->

<!--properties!-->
	username = Nome do Usuario
	submit = Enviar
	password = Senha
	cp = Confirme a senha
	address = Endereco
	reset = Limpar

	username.required = O nome do usuario deve ser preenchido
	password.required = A senha do usuario deve ser preenchida
	cpassword.required = Confirme a  senha do usuario deve ser preenchida
	cpassword.notmatch = As senhas são diferentes

<s:property value="username"/>
<br>
<s:property value="password"/>

package br.com.projeto.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class MAAction extends ActionSupport{
	
	private String username;
	private String password;
	private String cp;
	
	
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getCp() {
		return cp;
	}



	public void setCp(String cp) {
		this.cp = cp;
	}
	
	public void validate() {
	
	if("".equals(getUsername())) {
		addFieldError("username",getText("username.required"));
		
	}
	
	if("".equals(getPassword())) {
		
		addFieldError("password",getText("password.required"));
	}
	
	if("".equals(getCp())) {
		addFieldError("cp",getText("cpassword.required"));
	}
		
	}

	public String execute() throws Exception {
		return "success";
		
	}
	

}
