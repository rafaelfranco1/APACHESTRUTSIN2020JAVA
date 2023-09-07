package br.com.projeto.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class Y extends ActionSupport{
	
	private boolean checkb;
	
	
	
	
	
	
	public boolean isCheckb() {
		return checkb;
	}

	public void setCheckb(boolean checkb) {
		this.checkb = checkb;
	}

	public String display() {
		
		return NONE;
	}
	
	public String execute() throws Exception{
		return "success";
	}

}
