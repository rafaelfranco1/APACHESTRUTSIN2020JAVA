<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Radio Button</title>
<link rel="stylesheet" href="styles/styles.css">
</head>
<body>
	<h1>Radio Button</h1>
	<br>
	<hr>
	<br>
	<h2>
	<s:form action="inputRadioButton" namespace="/">
		<s:radio label="Gender" name="youGender" list="genders" value="defaultGenderValue" />
		<s:radio label="Language" name="youLanguage" list="languages" value="defaultLanguageValue" listKey="languageCode" listValue="languageDisplay"/>
		<s:radio label="Answer" name="youAnswer" list="#{'1' : 'yes','2' : 'no'}" value="2" />
		<s:submit key="submit" nae="submit" />
	</s:form>
	</h2>
</body>
</html>