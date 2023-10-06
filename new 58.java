<!--index.jsp!-->
<s:url var="LINKX" value="shaktaraction"/>
<s:a href="%{LINKX}>  </s:a>

<!--ShaktarAction!-->

<s:form action="shaktarresult>
	<s:select list="Engine" HeaderKey="-1" HeaderValue="you Search" name="youSearch" value="Engine"/>
	<s:select list="#{'1 - Janeiro':'1 - Janeiro','2 - Fevereiro':'2 - Fevereiro','3 - Março':'3 - Março'}"
	HeaderKey="-1" HeaderValue="you Month' name="youMonth" value="2"/>
	<s:submit key="submit" name="submit"/>
	<s:reset key="reset" name="reset"/>
</s:form>

<!--shaktarresult !-->

<s:property value="youSearch"/>
<br>
<s:property value="youMonth"/>

public class ShaktarAction extends ActionSupport {
	
	private String youSearch;
	private String youMonth;
	private List<String> Engine;
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public ShaktarAction() {
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.youtube.com.br");
		Engine.add("www.asdf.com.br");
		Engine.add("www.java.com");
	}
	
	public String display() {
		return "NONE";
	
	}
	public String execute() throws Exception {
		return "success";
	}
	
	
}