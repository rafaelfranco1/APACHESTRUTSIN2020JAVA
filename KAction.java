/*

<!-- index!-->
<s:url var="LINKX" value="kaum"/>
<a href="%{LINKX}">Select</a>

<!--kaum!-->

<s:form action="kadois">
<s:select list="Engine" label="Escolha o site" HeaderKey="-1" HeaderValue="Select Search"
name="youSearch" value="Engine"/>

<s:select list="#{'1 - Janeiro':'1 - Janeiro','2 - Fevereiro':'2 - Fevereiro','3 - Março':'3 - Março'}"
label="Escolha o site" HeaderKey="-1" HeaderValue="Select Month" name="youMonth" value="2"/>
</s: form>

<s:submit key="submit" name="submit"/>
<!--kadois-->

<s:property value= "youSearch"/>
<br>
<s:property value= "youMonth"/>

----------------*/ 

public class KACtion extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	public String getDefaultSearch() {
		
		return "www.google.com.br";
		
	}
	
	public KACtion() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.udemy.com");
		Engine.add("www.chatgpt.com");
		Engine.add("www.java.com");
	}
	
	public String display() {
		
		return NONE;
	}
	
	public String execute() throws Exception {
		
		return "success";
		
		
	}
	
	
}

