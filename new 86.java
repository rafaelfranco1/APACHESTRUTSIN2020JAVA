<!--xml!-->

<action name="selectAction" class="br.com.projeto.action.Select" method="display">
	<result name="none">select.jsp</action>
<action>

<action name="resultSelect" class="br.com.projeto.action.Select">
	<result name="success">resultSelect.jsp</action>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="selectAction"/>
<s:a href="%{LINKX}">Select</s:a>

<!--select.jsp!-->

<s:form action="resulSelect">
	<s:select list="Engine" name="youSearch" value="getDefaultSearch" Headerkey="-1" 
	HeaderValue="you Search" label="Select Search"/>
	<s:select list="#{'1 - Janeiro' : '1 - Janeiro' , '2 - Fevereiro' : '2 - Fevereiro' , 
	'3 - Março' : '3 - Março'}" name="youMonth" value="2" HeaderKey="-1" HeaderValue="you Month"
	label="Select Month"/>
</s:form>

<!--resultSelect!-->

<s:property value="youSearch"/>
<br>
<s:property value="youMonth"/>

public class Select extends ActionSupport {
	
	private list <String> Engine;
	
	private String youSearch;
	private String youMonth;
	
	//ggas
	
	public Select() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.java.com");
		Engine.add("www.youtube.com.br");
		Engine.add("www.intel.com");
		
	}

	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute()  throws Exception {
		return "success";
	}
}