package br.com.projeto.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class WAction extends ActionSupport{
	
	
	private String youMonth;
	private String youSearch;
	private List <String> Engine ;
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

	private String youMonth;
	private String youSearch;
	
	
	public WAction () {
		 Engine = new ArrayList<String>();
		 Engine.add("www.google.com.br");
		 Engine.add("www.facebook.com.br");
		 Engine.add("www.ask.com.br");
		 Engine.add("www.java.com.br");
		 Engine.add("www.yahoo.com.br");
	}
	
	public String getDefaultSearch () {
		return "www.google.com.br";
	}
	public String display() {
		return NONE;
	}
	
	public String execute () throws Exception {
		return "success";
	}
}
