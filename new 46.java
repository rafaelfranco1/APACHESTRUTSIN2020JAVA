/*
<!--index.jsp!-->

<s:url var="LINKX" value="taxaction"/>
<s:a href="%{LINKX}"> Text Area Action</s>

<!--taxaction!-->
<s:form action="txactionresult"/> <!--vai colocar o que foi digitado no backend na String address para a página txactionresult!-->
	<s:textarea name="address" cols="30" rows="30"/> <!--a label já está definida no name="address" nos properties!-->
	<s:submit name="submit" key="submit"/>
</s:form>

<!--txactionresult!-->

<s:proprety value="address"/>*/ 

public class TAXAction extends ActionSupport {
	
	private String address;
	
	//ggas
	
	public String display() {
		return "NONE";
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
}


