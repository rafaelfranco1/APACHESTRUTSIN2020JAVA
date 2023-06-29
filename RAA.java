package br.com.projeto.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RAAction extends ActionSupport{
	
		
		private String username;
		private String password;
		private String confirmPassword;
		
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
		public String getConfirmPassword() {
			return confirmPassword;
		}
		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}
		
	
		public void validate() {
			if("".equals(getUsername())) {
				addFieldError("username",getText("username.required"));
			}
			if("".equals(getPassword())){
				addFieldError("password",getText("password.required"));
			}
			if("".equals(getConfirmPassword())){
				addFieldError("confirmPassword",getText("confirmPassword.required"));
			}
			
			
		}
		
	
		
		
		public String display() {
			return "NONE";
		}
		
		public String execute() throws Exception {
			return "success";
		}


}
