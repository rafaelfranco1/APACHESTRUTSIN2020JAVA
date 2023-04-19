package br.com.projeto.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TesteAction extends ActionSupport{

	private List<String> Engine;
	private String youMonth;
	private String youSearch;
	
	public List<String> getEngine() {
		return Engine;
	}

	public void setEngine(List<String> engine) {
		Engine = engine;
	}

	public String getYouMonth() {
		return youMonth;
	}

	public void setYouMonth(String youMonth) {
		this.youMonth = youMonth;
	}

	public String getYouSearch() {
		return youSearch;
	}

	public void setYouSearch(String youSearch) {
		this.youSearch = youSearch;
	}
	
	public void metodo() {
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.yahoo.com.br");
		Engine.add("www.ask.com.br");
		Engine.add("www.facebook.com");
		Engine.add("www.java.com.br");
	}

	public String execute() throws Exception {
		System.out.println("executou");
		return "success";
	}
}
