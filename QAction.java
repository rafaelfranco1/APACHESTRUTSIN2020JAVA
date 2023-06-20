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
	
	public String execute() throw Exception {
		
		return "success";
	}
}