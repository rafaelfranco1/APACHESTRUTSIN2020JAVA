//Aula 21 Começo das parte Select 

public class preencherddl {
	
	private List<String> Engine ;
	private String youMonth;
	private String youSearch;
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public preencherddl() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.youtube.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.google.com.br");
		Engine.add("www.pudim.com.br");
		Engine.add("www.java.com.br");
	}
	
	public String method() {
		return NONE;
	}
	
	public String execute throws Exception () {
		return "success";
	}
	
	
}