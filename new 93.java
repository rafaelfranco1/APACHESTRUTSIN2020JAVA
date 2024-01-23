<!--xml!-->

<action name="inputSelect" class="br.com.projeto.java.SelectAction" method="display">
	<result name="none">selectInput.jsp</result>
</action>

<action name="resultSelect" class="br.com.projeto.java.SelectAction">
	<result name="success">selectResult.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="selectInput"/>
<s:a href var="%{LINKX}">Select Action </s:a>

<!--selectAction!-->
<s:form action="resultSelect">
	<s:select list="Engine" value="Engine" name="youSearch" Headerkey="-1" HeaderValue="Select Search"/>
	<s:select list="#{'1-jan' : '1-jan' , '2-fev" : '2-fev}" name="youMonth" value="2" HeaderKey="-1"
	HeaderValue="SelectMonth"/>
</s:form>

<!--selectResult!-->

<s:property value="youSearch"/>
<s:property value="youMonth"/>

public class SelectAction extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	//ggas
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public SelectAction() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.java.com");
		Engine.add("www.youtube.com");
		
		
		
		
		
	}
	
	
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		return "success";
	}
}