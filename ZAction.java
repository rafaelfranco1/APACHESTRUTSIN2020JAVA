public class ZAction extends ActionSupport {
	
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	public String getDefaultSearch() {
		
		return "www.google.com.br";
	}
	
	public ZAction() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.youtube.com.br");
		Engine.add("www.instagram.com");
		Engine.add("www.java.com");
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		
		System.out.println("Executou ZAction");
		return "success";
	}
	
	
}