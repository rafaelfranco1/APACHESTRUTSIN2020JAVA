package br.com.projeto.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LAction extends ActionSupport{
	
		
		private List<String> Engine;
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


		private String youSearch;
		private String youMonth;
		
		
		
		public String defaultSearch() {
			return "www.google.com.br";
		}
		
		public LAction() {
			
			Engine = new ArrayList<String>();
			Engine.add("www.google.com.br");
			Engine.add("www.facebook.com.br");
			Engine.add("www.java.com");
			Engine.add("www.youtube.com.br");
			Engine.add("www.ask.com.br");
		}
		
		
		public String display() {
			
			return NONE;
		}
		
		
		public String execute () throws Exception {
			return "success" 
		}
		
		
		
}
