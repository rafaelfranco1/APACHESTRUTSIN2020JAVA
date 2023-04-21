
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="includes/EnvironmentSetup.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="styles/styles.css" />
<title>template</title>
</head>
<body>
	<h1>Título</h1>
	<br>
	<hr>
	<br>
	<s:form action="selectAction">
	<h2><s:select list="Engine" label="Digite sua busca" HeaderKey="-1" 
	HeaderValue="Select search" name="youSearch"
	value="Engine" /></h2>
	<h2><s:select list="#{'1':'Jan','2':'Feb','3':'Marc' }" label="Selecione o mês" HeaderKey="-1" 
	HeaderValue="Select Month" name="youMonth"
	value="2" /></h2>
	</s:form>
	<h2></h2>
</body>
</html>