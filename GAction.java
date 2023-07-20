/*<!--Index JSP!-->
<s:url var="LINKY" value="gum"/>
<s:a href="%{LINKY}> Final Select </s:a>

<!--gum!--> 
<s:form action="gd">
	<s:select list="Engine" Headerkey="-1" HeaderValue="youSearch" name="youSearch" value="Engine"/>
	<s:select list="#{'1 - Janeiro' : '1 - Janeiro' , '2 - Fevereiro' : '2 - Fevereiro' , '3 - Março' - '3 - Março'}" , 
	Headerkey="-1" HeaderValue="youMonth" name="youMonth" value="2"/>
</s:form>

<!--gd-->

<s:property value="youSearch"/>
<br>
<s:property value="youMonth"/>*/

public class GAction extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	//ggas
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public GAction {
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.java.com");
		Engine.add("www.facebook.com.br");
		Engine.add("www.udemy.com");
		Engine.add("www.youtube.com.br");
	}
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
}