/*<!--Index JSP!-->
<s:url var="LINKX" value="hxaction">
<s:a href="%{LINKX}">Tag TextArea</a>

<!--hxaction!-->
<s:form action="hb">
	<s:textarea name="address" cols="10" rows="10"/> <!--o address foi feito no global properties!-->
	<s:submit name="submit" key="submit"/> <!--o submit pode ser encontrado no global properties!-->
</s:form>

<!--hb!-->

<s:property value="address"/>*/

public class Hxaction extends ActionSupport {
	
	
	private String address;
	
	//ggas generate getters and setters
	
	
	public String display() {
		return "NONE";
	}
	
	
	public String execute () throws Exception {

		return "success";
	}
	
	
}

