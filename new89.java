<!--xml!-->

<action name="selectAction" class="br.com.projeto.action.SelectAction" method="display">
	<result name="none">selectAction.jsp</result>
</action>

<action name="resultSelect" class="br.com.projeto.action.SelectAction">
	<result name="success">resultSelect.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="selectAction"/>
<s:a href="%{LINKX}">Select Tag </s:a>

<!--selectAction!-->
<s:form action="resultSelect">
	<s:select list="Engine" value="getDefaultSearch" HeaderKey="-1" HeaderValue="you Search" 
	name="youSearch"/>
	<s:select list="#{'1 - Janeiro' : '1 - Janeiro', '2 - Fevereiro' : '2- Fevereiro' , 
	'3 - Março' : '3 - Março'} value="2" HeaderKey="-1" HeaderValue="you Month" name="youMonth"/>
</s:form>

public class SelecAction extends ActionSupport {
	
	public List<String> Engine;
	
	public String youSearch;
	public String youMonth;
	
	public SelectAction {
		
		Engine = new ArrayList<String>();
		Engine.add("www.youtube.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.chackanfromsega.com");
		Engine.add("www.shaka.com");
		Engine.add("www.asd.com");
	}
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
}