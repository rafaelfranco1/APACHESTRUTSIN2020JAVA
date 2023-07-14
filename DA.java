/*<!--JSP!--> 
<s:url var="LINKX" value="da"/>
<s:a href="%{LINKX}"> LINKX</a>

<!--da-->

<s:form action="dd"/>
	<s:select list="Engine" Headerkey="-1" HeaderValue="youSearch" name="youSearch" value="Engine"/> 
	<s:select list="#{'1 - Janeiro':'1 - Janeiro' ,'2 - Fevereiro':'2 - Fevereiro', '3 - Março':'3 - Março'}" Headerkey="-1"
	HeaderValue="youMonth" name="youMonth" value="2"/>
</s: form>

<!--dd-->

<s:property value="youMonth"/>
<br>
<s:property value="youSearch"/>*/ 

public class DA extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	//ggas
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public DA {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.youtube.com.br");
		Engine.add("www.udemy.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.java.com");
	}
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
}

