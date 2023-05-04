package br.com.projeto.action;

import com.opensymphony.xwork2.Action;

public class ContatosAction implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("Executou contatos");
		return "success";
	}

}
