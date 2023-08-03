/*<!--index.jsp!-->
<s:url var="LINKX" value="ga"/>
<s:a href="%{LINKX}>Select Action </a>

<!--ga!--> <!-- Variavel engine é feita no back end!-->
<s:form action="gb">
	<s:select list="Engine" Headerkey="-1" HeaderValue="youSearch" name="youSearch" value="Engine"/>
	<s:select list= "#{'1 - Janeiro':'1 - Janeiro' , '2 - Fevereiro':'2 - Fevereiro' , '3 - Março':'3 - Março'}" 
	Headerkey="-1" HeaderValue="youMonth" name="youMonth" value="2" />
	
</s:form>

<!--gb!-->
<s:property value="youMonth"/>
<br>
<s:property value="youSearch"/>
*/

public class GAction extends ActionSupport {
	
	private List<String> Engine;
	private String youSearch;
	private String youMonth;
	
	//ggas
	
	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public GAction() {
		Engine = new ArrayList<String>();
		Engine.add("www.google.com.br");
		Engine.add("www.facebook.com.br");
		Engine.add("www.twitter.com.br");
		Engine.add("www.youtube.com.br");
		Engine.add("www.java.com");
		
	}
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
}
