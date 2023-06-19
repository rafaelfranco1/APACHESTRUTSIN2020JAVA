public class LAction extends ActionSupport {
	
	private List<String> Engine;
	private List youSearch;
	private List youMonth;
	
	//ggas
	
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
	
	
	{