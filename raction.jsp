<s:form action="rdois">
	<s:select list="Engine" label="Escolha o site" HeaderKey="-1" HeaderValue="Select Search" name="youSearch" value="Engine"/>
	<s:select list="#{'1 - Janeiro':'Janeiro' , '2 - Fevereiro' : 'Fevereiro' , '3 - Março' : 'Março'}"
	label="Escolha o mês" HeaderKey="-1" , HeaderValue="Select Search" name="youSearch" value="2"/>

	
</s:form>

<s:property value="youSearch">
<br>
<s:property value="youMonth">


<li><s:url var="LINK13" action="rum">
<a value="LINK13">Select Action 3 </a>