<!--xml!-->

<action name="selectAction" class="br.com.projeto.java.SelectAction" method="none"/>
	<result name="none">select.jsp</result>
</action>

<action name="resultSelect" class="br.com.projeto.java.SelectAction">
	<result name="success">resultSelect</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="selectAction"/>
<s:a href="%LINKX">SelectAction </s:a>

<!--selectAction!-->

<s:form action="resultSelect">

	<s:select list="Engine" name="youSearch" value="getDefaultSearch" HeaderKey="-1" HeaderValue="you Search"/>
	<s:select list="#{'1 - Janeiro':'1 - Janeiro','2 - Fevereiro':'2 - Fevereiro','3 - Março':'3 - Março'}" 
	name="youMonth" Headerkey="-1" HeaderValue="2"/>

</s:form>

<!--SelectActionJava"!-->

public class SelectAction extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	public SelectAction() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.java.com");
		
	}
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	
	public String display() {
		return "none";
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
	
}