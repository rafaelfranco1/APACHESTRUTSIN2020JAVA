package br.com.projeto.action;


import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class RegistrationAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("Executou Registration");
		
		return "success";
	}
	
}

