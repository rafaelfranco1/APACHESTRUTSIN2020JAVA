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
	<h1>Resultado Checkbox</h1>
		<s:property value="checkb"/>
	<br>
	<hr>
	<br>
	
	<jsp:include page="includes/Footer.jsp"/>
</body>
</html>