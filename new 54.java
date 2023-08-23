<!--index.jsp!-->
<s:url var="LINKX" value="selectaction"/>
<s:a href="%LINKX">Select Action </a>

<!--selectaction!-->

<s:form action="selectresult">
	<s:select list="Engine" HeaderKey="-1" HeaderValue="you Search" name="youSearch" value="Engine"/>
	<s:select list="#{'1 - Janeiro':'1 - Janeiro','2 - Fevereiro':'2 - Fevereiro','3 - Março':'3 - Março'}
	HeaderKey="-1" HeaderValue="you Month" name="youMonth" value="2"/>

</s:form>

<!--selectresult!-->

<s:form action="selectresult">
	<s:property value="youMonth"/>
	<br>
	<s:property value="youSearch"/>
</s:form>

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
		Engine.add("www.youtube.com.br");
		Engine.add("www.twitter.com");
		Engine.add("www.java.com");
	}
	
	public String display() {
		return "NONE";
	}
	
   public String execute() throws Exception {
	   return "success";
   }
	
}