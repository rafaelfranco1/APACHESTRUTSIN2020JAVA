package br.com.projeto.action;


import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class BTagAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("executou");
		return "success";
	}

}
