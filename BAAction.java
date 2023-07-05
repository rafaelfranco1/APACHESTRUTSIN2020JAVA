/*<!--Index.jsp!-->
<s:url var="{LINKX}" value="baum"/> <!--seria Taum a primeira página do TextArea . TA significa 
text area . Logo como já existe TaUM (TextaREA UM) agora é BAUM (Bext Area um)-->
<a href="%{LINKX}">TextArea</a>

<!--baum-->

<s:form action = "badois">
	<s:textarea name="address" cols="30" rows="30"/> <!--adress deve existir no Properties!-->
 	<s:submit key="submit" name="submit"/>
</s:form>

<!--badois-->

<s:property value="address"/>*/

public class BAAction extends ActionSupport {
	
	public String address;
	
	//ggas
	
	public String execute() throws Exception {
		return "success";
	}
	
	public String display () {
		return NONE;
}

