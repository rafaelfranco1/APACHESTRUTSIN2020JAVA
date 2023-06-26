/*

<!--Index . JSP!-->

<s:url var="LINK14" value="taum"/>
<a href="%{LINKt14}">TextAreaTest</a>

<!--Taum JSP--!>
No global properties colocar adress=Endereco
<s:form action="tadois">
	<s:textarea label="Adress:" name="adress" col="30" rows="30"/>
	<s:submit name="submit" key="submit">
</s:form>

<!--Tadois JSP--!>

<s:property value="adress"/> */

public class TA extends ActionSupport {
	
	
	private String adress;
	
	//gggas
	
	
	public String display() {
		return NONE;
	}
	public String execute() {
		
		return "success";
	}
	
}
