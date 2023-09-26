<action name="selectAction" class="br.com.projeto.action.SelectAction" method="display">
	<result name="none">selectaction.jsp </result>
</action>

<action name="resultSelect" class="br.com.projeto.action.SelectResult">
	<result name="success">resultselect.jsp</result>
</action>

<!--index.jsp!-->
<s:url var="LINKX" value="selectAction"/>
<s:a href="%{LINKX}"> </s:a>


<!--selectaction.jsp!-->
<s:form action="resultSelect">
	<s:select list="Engine" Headerkey="-1" HeaderValue="youSearch" name="youSearch" value="Engine"/>
	<s:select list="#{'1 - Janeiro' : '1 - Janeiro' , '2 - Fevereiro' : '2 - Fevereiro' , '3 - Março' - '3 - Março'}"
Headerkey="1" HeaderValue="youMonth" name="youMonth" value="2"/>
</s:form>

<!--resultSelect!-->

<s:property value="youSearch"/>
<br>
<s:property value="youMonth"/>

public class SelectAction extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	//ggas
	
	public String getDefaultSearch () {
		return "www.google.com.br";
	}
	
	public class SelectAction() {
		
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.x.com");
		Engine.add("www.java.com");
		Engine.add("www.youtubem.com.br");
		
		
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute throws Exception {
		return "success";
	}
}