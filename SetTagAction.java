package br.com.projeto.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SetTagAction extends ActionSupport{
	
	
	private String msg;
	
	
	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

	@Override
	public String execute() throws Exception {
		System.out.println("Executou tag de link A");
		return "success";
	}
}
