<!--inde.xjps!-->

<s:url var="LINKX" value="checkboxaction"/>
<s:a href="%{LINKX}>Check Box Action  </s:a>

<!--checkboxaction !-->
<s:form action="checkboxresult">
	<s:checkbox label="CheckBox" name="checkb" value="checkb"/>
</s:form>

<!--checkboxresult!-->

<s:property value="checkb"/>

public class CheckBoxAction extends ActionSupport {
	
	private boolean checkb;
	
	
	//genarate ggas
	
	
	
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		return "success";
	}
}