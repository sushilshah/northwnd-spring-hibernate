<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <title>Update category</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    Update category
    <form name="category" method="post" action="<c:out value='${category.id}' />" enctype="multipart/form-data">
		<div>Name:<input type="text" name="name" value="<c:out value='${category.name}' />" /></div>
		<div>Description:<input type="text" name="description" value="<c:out value='${category.description}' />" /></div>
    	<div>File:&nbsp;<input type="file" name="picture" /></div> 
    	<input id="submit" type="submit" />
    </form>
  </body>
</html>
