package br.com.projeto.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class QAction extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	//ggas
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public QAction() {
		Engine = new ArrayList<String>();
		Engine.add("www.youtube.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.instagram.com.br");
		Engine.add("www.twitter.com.br");
		Engine.add("www.java.com");
	}
	
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		
		return "success";
	}

	public List<String> getEngine() {
		return Engine;
	}

	public void setEngine(List<String> engine) {
		Engine = engine;
	}

	public String getYouSearch() {
		return youSearch;
	}

	public void setYouSearch(String youSearch) {
		this.youSearch = youSearch;
	}

	public String getYouMonth() {
		return youMonth;
	}

	public void setYouMonth(String youMonth) {
		this.youMonth = youMonth;
	}
}
