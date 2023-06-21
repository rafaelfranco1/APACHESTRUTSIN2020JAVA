public class RACtion extends ActionSupport {
	
	private List<String> Engine ;
	private String youSearch;
	private String youMonth;
	
	//ggas
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public Engine() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.twitter.com");
		Engine.add("www.youtube.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.java.com");
		Engine.add("www.microsoft.com");
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return"success";
	}
}