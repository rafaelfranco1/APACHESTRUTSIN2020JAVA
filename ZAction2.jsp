<s:form action="zdois">
<h2><s:select list="Engine" label="Selecione o site" HeaderKey="-1" HeaderValue="Select Search" name="youSearch" value="Engine"></h2>
<h2><s:select list="#{'1 - Janeiro' : 'Janeiro' , '2 - Fevereiro' : 'Fevereiro' , '3 - Março' : 'Março'}" label="Selecione o mês" 
HeaderKey="-1" HeaderValue="Select Search" name="youSearch" value="2"></h2>
</s:form>

<s:property value="youSearch">
<br>
<s:property value="youMonth">