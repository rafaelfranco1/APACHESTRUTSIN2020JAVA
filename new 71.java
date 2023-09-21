<action name="selectAction" class="br.com.projeto.action.SelectAction">
	<result name="none">selectAction.jsp </result>
</action>

<action name="resultSelect" class="br.com.projeto.action.SelectAction">
	<result name="success">resultSelect.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="selectAction"/>
<s:a href="%{LINKX}">selectAction</s>

<!--selectAction!-->
<s:form action="resultSelect">
	<s:select list="Engine" Headerkey="-1" HeaderValue="youSearch" name="youSearch" value="Engine"/>
	<s:select list="{'1 - Janeiro':'1 - Janeiro','2 - Fevereiro':'2 - Fevereiro','3 - Março':'3 '}#"
	Headerkey="-1" name="youSearch" value="2"/>
</s:form>

public class SelectAction extends ActionSupport {

	private List<String>Engine;
	private String youSearch;
	private String youMonth;
	
	//ggas
	
	public getDefaultSearch() {
		return "www.google.com.br";
	}


	public SelectAction() {
			
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com");
		Engine.add("www.java.com");
		Engine.add("www.apachestruts.com");
		Engine.add("www.youtube.com.br");
	
	}

	public String display() {
		return NONE;
	}
	

	public String execute() throws Exception {
		return "success";
	}

}	