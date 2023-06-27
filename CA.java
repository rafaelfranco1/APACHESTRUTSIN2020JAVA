/*
<!-- index.jsp !-->

<s:url var="LINK16" value="caum"/>
<a href="%{LINK16}"></a>

<!-- caum , obs criar address = Endereço no global properties!-->

<s:form action="cadois"> 
	<s:textarea name="address" cols="30" rows="30" label="Endereço"/>
	<s:submit key="submit" name="submit"/>
</s:form>

<!-- cadois !-->

<s:property value="address"/>*/

package br.com.projeto.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class CA extends ActionSupport {
	
	private String address;
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String display() {
		return NONE;
	}
	
	public String execute() throws Exception {
		
		return "success";
		
	}
	
	
	
	
	
	
}
