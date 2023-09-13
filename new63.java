<!--index.jsp!-->

<s:url var="LINKX" value="selectaction"/>
<s:a href="%{LINKX}">Select Action  </s:a>

<!--selectaction!-->
<s:form action="resultSelect">
	<s:select list="Engine" Headerkey="-1" HeaderValue="youSearch" name="youSearch" value="Engine"/>
	<s:select list="#{'1 - Janeiro':'1 - Janeiro','2 - Fevereiro':'2- Fevereiro','3 - Março':'3 - Março'}"
HeaderKey="-1" HeaderValue="youMonth" name="youMonth" value="2"/>
</s:form>

<!--resultSelect!-->

<s:property value="youSearch"/>
<br>
<s:property value="youMonth"/>

public class SelectAction extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public SelectAction() {
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.twitter.com");
		Engine.add("www.celtics.com");
		Engine.add("www.lakers.com");
		Engine.add("www.java.com");
	}
	
	
	public String display() {
		return NONE;
	}
	
	public String execute () throws Exception {
		return "success";
	}
	
}