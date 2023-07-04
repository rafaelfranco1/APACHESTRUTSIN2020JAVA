/*

<!--Index-->

<s:url var="LINKX" value="jaum"/>
<a href="LINKX">Select Action</a>

<!--Jaum!-->

<s:form action="jadois">

<h2><s:select list="Engine" HeaderKey="-1" HeaderValue="Select Search" label="Escolha o site"
name="youSearch" value="Engine"/></h2>

<h2><s:select list="#{'1 - Janeiro' : '1 - Janeiro','2 - Fevereiro' : '2 - Fevereiro',
'3 - Março' : '3 - Março'}", HeaderKey="-1" HeaderValue="Select Month" label="Escolha o mês" 
name="youMonth" value="2"/></h2>

</s: form>
<!--Jadois!-->

<s:property value="youSearch"/>
<br>
<s:property value="youMonth"/>*/

public class JACtion extends ActionSupport {
	
	private List<String> Engine;
	private String youMonth;
	private String youSearch;
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public JACtion() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.udemy.com");
		Engine.add("www.youtube.com");
		Engine.add("www.java.com");
		
		
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
}

