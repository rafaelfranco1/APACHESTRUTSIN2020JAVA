<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>template</title>
<link rel="stylesheet" href="styles/styles.css">
</head>
<body>
	<jsp:include page="includes/Header.jsp"/>
	<h1>titulo</h1>
	<br>
	<hr>
	<s:form action="yb">
		<s:select list="Engine" Headerkey="-1" HeaderValue="you Search" name="youSearch" value="Engine"/>
		
		<s:select list="#{'1 - Janeiro'  : '1 - Janeiro' , '2 - Fevereiro' : '2 - Fevereiro' , '3 - Mar�o' : '3 - Mar�o' }" Headerkey="-1" HeaderValue="you Month"
		name="youMonth" value="2"/>
	
		<s:submit key="submit" name="subit"/>
	</s:form>
	<br>
	
	<jsp:include page="includes/Footer.jsp"/>
</body>
</html>