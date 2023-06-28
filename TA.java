/*
<!-- index JSP!-->
<s:url var="LINKX" value="tum"/>
<a href={%LINKX}>SelectAction</a>

<!-- tum!-->

<s:form action="tdois">
	<s:url list="Engine" label="Escolha o site" HeaderKey="-1" HeaderValue="Select Search" 
	name="youMonth" value="Engine"/>

	<s:url list="#{'1 - Janeiro' : '1 - Janeiro','2 - Fevereiro':'2 - Fevereiro','3 - Março' : '3 - Março'}"
	label="Escolha o mês" Headerkey="-1' HeaderValue="Select Month" name="youMonth" value="2"/}
</s: form>

<!-- tdois!-->

<s:property value="youMonth"/>
<br>
<s:property value="youSearch"/>
<hr>*/

public class TAction extends ActionSupport {
	
	private List<String> Engine;
	private String youMonth;
	private String youSearch;
	
	//ggas generate getters and setters
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public TAction() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.youtube.com.br");
		Engine.add("www.udemy.com.br");
		Engine.add("www.java.com");
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
}

