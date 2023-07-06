/*
<!--INDEX.JSP!-->

<s:url var="LINKX" value="faum"/>
<a href=%{LINKX}>Selecttag </a>

<!--faum!-->
<s:form action="fdois">
	<s:select list="Engine" HeaderKey="-1" HeaderValue="Select Search" name="youSearch"
	value="Engine"/>
	<s:select list="#{'1- Janeiro' : '1- Janeiro','2- Fevereiro' : '2 - Fevereiro','3 - Março' - '3 -  Março'}"
	="-1" HeaderValue="Select Month"  name="youMonth" value="2"/>
</s:form>

<!--fadois!-->

<s:property value="youMonth"/>
<br>
<s:property value="youSearch"/>*/

public class FAction extends ActionSupport {

	public String getDefaultSearch() {
		return "www.google.com.br";
	}
	
	public 
	
	
	public String display() {
		return NONE;
	}
	
	
	
	public String execute () throws Exception  {
		
		return "success";
	}
	
	
}

