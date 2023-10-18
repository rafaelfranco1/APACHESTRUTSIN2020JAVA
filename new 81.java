<!--xml!-->
<action name="selectAction" class="br.com.projeto.action.SelectAction" method="none"/>
	<result name="none">selectAction.jsp</result>
<action>

<action name="resultSelect" class="br.com.projeto.action.SelectAction"/>
	<result name="success">resultSelect.jsp</result>
</action>
<!--index.jsp!-->

<s:url var="LINKX" value="selectAction"/>
<s:a href="%{LINKX}">Select </s:a>

<!--selectAction!-->

<s:form action="resultSelect">
	<s:select list="Engine" name="youSearch" HeaderKey="-1" HeaderValue="youSearch" 
	value="getDefaultSearch" label="Select Site: "/>
	<s:select list="#{'1 - Janeiro' : '1 - Janeiro' , '2 - Fevereiro' : '2 - Fevereiro', '3 - Março' : '3- Março'}"
	name="youMonth" Headerkey="-1" HeaderValue="2" label = "Select Month" />
</s:form>

<!--resultSelect!-->

<s:property value="youSearch"/>
<br>
<s:property value="youMonth"/>

public class SelectAction extends ActionSupport {
	
	private List<String> Engine;
	
	private String youSearch;
	private String youMonth;
	
	//generate getters and setter
	
	public SelectAtion() {
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com");
		Engine.add("www.youtube.com.br");
		Engine.add("www.java.com");
		Engine.add("www.w3c.com");
	
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