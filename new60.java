<!--INDEX.JSP!-->
<s:url var="LINKX" value="selectaction"/>
<s:a href="%LINKX">Select Action</s:a>

<!--selectaction!-->
<s:form action="selectresult">
	<s:select list="Engine" HeaderKey="-1" HeaderValue="you Search" name="youSearch" value="Engine"/>
	<s:select list="#{'1 - Janeiro','1 - Janeiro':'2 - Fevereiro','2 - Fevereiro':'3 - Março','3 - Março'}"
	Headerkey="-1" Header Value="youMonth" name="youMonth" value="youMonth"/>
</s:form>

<!--selectresult!-->

<s:property value="youSearch"/>
<br>
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
		Engine.add("www.youtube.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.asd.com.br");
		Engine.add("www.java.com");
		Engine.add("www.lixas.com");
		
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
}