<!--index.jsp!-->
<s:url var="%LINKX" value="textareaaction"/>
<s:a href="%{LINKX"}">TextAreaAction</s:a>

<!--textareaaction!-->

<s:form action="textarearesult">
	<s:textarea name="address" cols="30" rows="30"/>
</s:form>

<!--textarearesult!-->

<s:property value="address"/>

public class TextAreaAction extends ActionSupport {
	
		public String address;
	
		
	
	
		public String display() {
			return "NONE";
		}
	
		public String execute() throws Exception {
			return "success";
		}
	
}