<!--index.jsp!-->

<s:url var="LINKX" value="checkboxaction"/>
<s:a href="%{LINKX}">CheckBox </s:a>

<!--checkboxaction!-->
<s:form action="cheboxresult">
	<s:checkbox label="Checkbox" name="checkb" fieldValue="true"/>
	<s:submit key="submit" name="submit"/>
</s:form>

<!--cheboxresult!-->

<s:property value="checkb"/>

public class CheckBoxAction {
	
	private boolean checkb;
	
	//gggas
	
	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
	
}
