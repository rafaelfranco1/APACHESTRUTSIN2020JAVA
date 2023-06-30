package br.com.projeto.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RAAction extends ActionSupport{
	
		private String cp;
		private String username;
		private String password;
		
		
		
	
	
		public String getCp() {
			return cp;
		}
		public void setCp(String cp) {
			this.cp = cp;
		}
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
		
		
	
		public void validate() {
			if("".equals(getUsername())) {
				addFieldError("username",getText("username.required"));
			}
			
			if("".equals(getPassword())){
				addFieldError("password",getText("password.required"));
			}
			
			if("".equals(getCp())) {
				addFieldError("cp",getText("cpassword.required"));
			}
			
			//if (getPassword() != null && getCp() != null && !getPassword().equals(getCp())) {
			  //  addFieldError("cp", getText("cpassword.notmatch"));
			//}
			if (getPassword()!=null && getCp()!=null) {
				if (getPassword().equals(getCp())) {
					
				}
				else {
					addFieldError("cp", getText("cpassword.notmatch"));
				}
			}
			
		}
		
	
		
		public String display() {
			return "NONE";
		}
		
		public String execute() throws Exception {
			return "success";
		}


}
