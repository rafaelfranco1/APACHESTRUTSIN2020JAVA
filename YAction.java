package br.com.projeto.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class YAction extends ActionSupport{
	
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
	
	public String getDeafaultSearch() {
		return "www.google.com.br";
	}
	
	public YAction() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.youtube.com.br");
	}
	
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		
		return "success";
	}
}
