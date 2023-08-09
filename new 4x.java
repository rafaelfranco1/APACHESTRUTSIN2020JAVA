/*
<!--index.jsp!--> 
<s:url var="LINKX" value="raction"/>
<s:a href="%{LINKX}"> Select tag </s:a>

<!--raction!-->

<s:form action="rbaction">
	<s:select list="Engine" HeaderKey="-1" HeaderValue="youSearch" name="youSearch" value="Engine"/>
	<s:select list="#{'1 - Janeiro' : '1 - Janeiro','2 - Fevereiro' : '2 - Fevereiro',
	'3 - Março' : '3 - Março'}" HeaderKey="-1" HeaderValue="youMonth" name="youMonth" value="2"/>
</s:form>

<!--rb!--> 

<s:property value="youSearch"/>
<br>
<s:property value="youMonth"/>*/

public class RAction extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	//ggas
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public RAction() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.java.com");
		Engine.add("www.youtube.com.br");
		Engine.add("www.asdf.com");
	}
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
	
}