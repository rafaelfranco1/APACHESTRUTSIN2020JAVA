<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Result Radio Button</title>
<link rel="stylesheet" href="styles/styles.css">
</head>
<body>
<jsp:include page="includes/Header.jsp"/>
	<h1>Result Radio Button</h1>
	<br>
	<hr>
	<br>
	<h2>Genero: <s:property value="youGender"/></h2>
	<h2>Língua: <s:property value="youLanguage"/></h2>
	<h2>Resposta: <s:property value="youAnswer"/></h2>
<jsp:include page="includes/Header.jsp"/>
</body>
</html>