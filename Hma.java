
/*<!--index.jsp!-->

	<s:url var="LINKX" value="hma"/>
	<s:a href="%{LINKX}">TextArea </a>
<!--hma!-->

<s:form action="hmad"/>;
	
	<s:textarea name="address" col="30" rows="30"/> <!--address é econtrado no global property!-->
	<s:submit key="submit" name="submit"/>
</s:form>

<!--hma!-->

<s:property value="address"/>*/

public class HMA extends ActionSupport {
	
	private String address;
	
	//gggas
	
	public String display() {
		return "NONE";
	}
	public String execute () throws Exception {
		return "success";
	
	}
	
	
	
	
}

