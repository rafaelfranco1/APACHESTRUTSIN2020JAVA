/*
<!-- index.jsp !-->
<s:url var="LINK16" value="vaum"/>
<a href="%{LINK16}">SelectAction</a>

<!--vaum.jsp!-->


<s:form action="vadois.jsp">
	<s:select label="Selecione o site" list="Engine" Headerkey="-1" HeaderValue="Select Search"
	name="youSearch" value="Engine"/>

	<s:select label="Selecione o mês" HeaderKey="-1" HeaderValue="Select Value"
	list="#{'1 - Janeiro' : '1 - Jeneiro' , '2 - Fevereiro' : '2 - Fevereiro' , '3 - Março' : '3 - Março' ;}"
	name="youMonth" value="2"/>

<s:submit key="submit" name="submit"/>

</s:form>

<!-- vadois.jsp !-->

<s:propertie value="youMonth"/>
<br>
<s:propertie value="youSearch"/>

<!--Regra de Negócio!-->*/

public class VAction extends ActionSupport {
	
	private List<String> Engine;
	private String youMonth;
	private String youSearch;
	
	//gggas
	
	public String getDefaultSearch() {
		
		return "www.google.com.br";
	}
	
	public VAction() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.youtube.com.br");
		Engine.add("www.java.com");
		Engine.add("www.vimeo.com");
		Engine.add("www.rumble.com");
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute () throws Exception {
		return "success";
	}
}


