<!--xml!-->

<action name="inputSelect" class="br.com.projeto.action.SelectAction" method="display">
	<result name="none">select.jsp </result>
</action>

<action name="resultSelect" class="br.com.projeto.action.SelectAction">
	<result name="success">resultSelect</result>
</action>

<!--index !-->

<s:url var="LINKX" value="inputSelect"/>
<s:a href="{LINKX}">Select Tag Struts2</s:a>

<!--inputSelect!-->

<s:form action="resultSelect">
	<s:select list="Engine" name="youSearch" value="getDefaultSearch" Headerkey="-1" HeaderValue="Select Search"
	label="Busca :"/>
	<s:select list="{'1-janeiro':'1-janeiro' , '2-fevereiro':'2-fevereiro','3-março':'3-março'}"
	name="youMonth" value="2" Headerkey="-1" HeaderValue="Select Month" label="Mês :"/>
	<s:submit key="submit"/>
</s:form>

<!--resultSelect!-->

<s:property value="youSearch"/>
<s:property value="youMonth"/>

public class SelectAction extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	public SelectAction() {
		Engine = new ArrayList<String>() ;
		Engine.add("www.google.com.br");
		Engine.add("www.youtube.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.microsoft.com");
		Engine.add("www.tubetelevison.com");
		
	}
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	private String display() {
		return NONE;
	}
	private String execute() throws Exception {
		return "success";
	}
}