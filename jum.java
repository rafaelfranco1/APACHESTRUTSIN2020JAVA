/*
<!--index.jsp!-->

<s:url var="LINKX" value="jum"/>
<a href="%{%LINKX}">Select Action</a>

<!--jum!-->
<s:form action="jdois">
	<s:select list="Engine" HeaderKey="-1" HeaderValue="Select Search" name="youSearch" value="Engine"/>
	<s:select list="#{'1 - Janeiro':'1 - Janeiro' ,'2 - Fevereiro':'2 - Fevereiro','3 - Março':'3 - Março'}"
	Headerkey="-1" HeaderValue="Select Month" name="youMonth' value="2"/>
</s:form>

<!--jdois"-->

<s:property value="youSearch"/>
<br>
<s:property value="youMonth"/>*/

public class Jum extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	//ggas
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public Jum() {
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.youtube.com.br");
		Engine.add("www.udemy.com.br");
		Engine.add("www.java.com");
	}
	
	
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		
		return "success";
		
	}
}

