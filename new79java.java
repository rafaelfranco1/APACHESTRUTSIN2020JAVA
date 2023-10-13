//olhar struts2-dojo
<!--index.jsp!-->


<!--styles.css!-->

<table> {
	border:dotted;
}

<!--Header!-->
	<table border="1" width="500" height="350">
		<tr><td>Curso de Struts 2</td></tr>
	</table>

<!--Footer!-->

<action name="doubleSelect" class="br.com.projeto.action.DoubleSelectAction"/>
	<result name="none">doubleSelect.jsp</result>
</action>

<action name="inputDoubleSelect" class="br.com.projeto.action.DoubleSelectAction"/>
	<result name="success">resultDoubleSelect.jsp</result>
</action>

<!--index.jsp!-->

<s:url var="LINKX" value="doubleSelect"/>
<s:a href="%{LINKX}">Double Select </s:a>

<!--double select!--> 
<title>Double Select </title>


<!--resultDoubleSelect!-->
<title>Resultado do Double Select</title>

public class DoubleSelectAction extends ActionSupport {
	
	
	
	
	
	
	
	
	
	
	
	
	public String display {
		return NONE;
	}
	
	public String execute throws Exception 
	{
		System.out.println("Executou Double Select");
		return "success";
	}
}