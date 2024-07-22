/*
<!-- index.jsp !-->
<s:url var="LINK15" value="yaum">
<a href="%{LINK15}">tEXT_AREA</a>

<!-- yaum.jsp!!-->
<s:form action="yadois">
	<s:textarea  name="address" cols="30" rows="30"/>
	<s:submit name="submit" key="submit">
</form>
<!-- Criar address nas java properties!-->

<!--yadois!-->
<h2><s:propertie value="address"></h2>

<!--REGRAS DE NEGOCIO YA.JAVA--!>*/

public class YA extends ActionSupport {
	
	private String address;
	
	//gggas
	
	public String display() {
		return NONE;
	}
	
	public String execute () throws Exception {
		
		return "success";
	}
}

