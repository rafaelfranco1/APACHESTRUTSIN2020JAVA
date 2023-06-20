<!-- Qum.Jsp !-->

<s:form action="qdois">

	<s:select list="Engine" HeaderKey="-1" HeaderValue="Select Search" label="Escolha o site" name="youSearch"
	value="Engine"/> <!--VALUE é sempre o Array List, Name é sempre a String!-->

	<s:select list="#{'1 - Janeiro' : '1' , '2 - Fevereiro' : '2' , '3 - Março' : '3'}" HeaderKey="-1"
	HeaderValue="Select Search" label="Escolha o mês" name="youSearch" value="2" />
	
	<s:submit key="submit" name="submit">
</s:form>


<!-- Qdois.jsp!-->
<s:property value="youSearch">
<br>
<s:property value="youMonth">

<!--Index JSP!-->
<li>
<s:url var="LINK12" action="qum">
	<a value="LINK12"> Entrar no Select</a> 
</li>