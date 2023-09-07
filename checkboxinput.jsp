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
	<h1>CheckBox</h1>
	<br>
	<s:form action="checkboxresult">
		<s:checkbox  name="checkb" value="checkb" fieldValue="true"  label="Checkbox"/>
		
		<s:submit key="submit" name="submit"/>
	</s:form>
	<hr>
	
	<br>
	
	<jsp:include page="includes/Footer.jsp"/>
</body>
</html>