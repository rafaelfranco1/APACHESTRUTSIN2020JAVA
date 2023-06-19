<s:form action="ldois.jsp">
<s:select list="Engine" HeaderKey="-1" HeaderValue="Select Search" label= "Digite sua busca" 
name="youSearch" value="Engine"/>
<s:select list="#{'1 - Janeiro' - 'Janeiro' , '2 - Fevereiro' - 'Fevereiro' , '3 - Março' - 'Março' HeaderKey="-1"
HeaderValue="Select Month" label="Select the Month" name="youMonth" value="2"/>
<s:submit key="submit" value="submit">
</s form>

<s:property value="youMonth">
<br>
<s:property value="youSearch">

