<!--JSP!-->

<s:url var="LINX" value="aau"/>
<s:a href="%{LINKX}"> Select </s>

<!--aau!-->
<s:form action = "aad"/>
	<s:select list="Engine" Headerkey="-1" HeaderValue="Select Search" name="youSearch" value="Engine"/>
	<s:select list="#{'1 - Janeiro':'1 - Janeiro' , '2 - Fevereiro':'2 - Fevereiro' , '3 - Março':'3 - Março'}" 
	Headerkey="-1" HeaderValue="youMonth" name="youMonth" value="2"/>
</s: form>

<!--aad-->

<h2><s:property value="youMonth"/></h2>
<br>
<h2><s:property value="youSearch"/></h2>

public class AAction extends ActionSupport {
	
	private List<String> Engine;
	private String youMonth;
	private String youSearch;
	
	//gggas
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public AAction() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.youtube.com.br");
		Engine.add("www.udemy.com.br");
		Engine.add("www.x.com.br");
		
	}
	
	public String display() {
		
		return "NONE";
	}
	
	public String execute() throws Exception {
		
		return "success";
	}
}
