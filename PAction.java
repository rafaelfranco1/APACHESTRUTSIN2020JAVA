/*
<!--index.jsp!--> 
<s:url var="LINK15" value="paum"/>
<a href="%{LINK15}">ArrayList</a>

<!--paum--!>

<s:form action="padois">
	
	<s:select list="Engine" Headerkey="-1" HeaderValue="Select Search" name="youMonth" value="Engine"/>
	<s:select list="#{'1 - Janero' : '1-Janeiro' , '2 - Fevereiro' : '2 - Fevereiro' , '3 - Março' : '3 - Março'}"
	HeaderKey="-1" HeaderValue="Select Month' name="youSearch" value="2"/>
	<s:submit name="submit" value="submit"/>
</s form>

<!--padois!-->

<s:property value="youSearch"/>
<s:property value="youMonth"/>*/

public class PAction extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	//ggas
	
	public String getDefaultSearch() {
		
		return "www.google.com.br";
	}
	
	public PAction() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.ask.com.br");
		Engine.add("www.youtube.com.br");
		Engine.add("www.java.com");
		
	}
	
	
	
	public String display() {
		return NONE;
	}
	
	public String execute () {
		
		return "sucess";
	}
	
	
	
}

