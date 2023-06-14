public class Jars {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	
	}
	
	public Jars() {
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.ask.com.br");
		Engine.add("www.youtube.com.br");
		Engine.add("www.yahoo.com.br");
	
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute () throws Exception {
		
		return "success";
	}
}

/* JSP aonde vai ser utilizado o ArrayList de String:

<s:form action="asd">
<h2><s:select list="Engine" label="Digite sua busca: " 
HeaderKey="-1" HeaderValue="Select search" 
name="youSearch" value="Engine"/></h2>
<h2><s:select list="#{'1' - 'Jan', '2' - 'Fev', '3' - 'Mar'} label = "Escolha o mês" Headerkey="-1"
HeaderValue="Select Month" name="youMonth" value="2"/></h2>
</s:form> */

