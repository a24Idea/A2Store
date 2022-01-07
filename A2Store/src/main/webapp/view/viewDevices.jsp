<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Devices for ${devices.brandName} </title> <!--   -->
</head>
<body>
<h3>List of ${devices.brandName} devices</h3> <!--  -->
<hr>
<ul>
<c:forEach var="device" items="${devices.devices}">
<li> Name: ${device.name} -> Category:${device.brand}</li><br/>
</c:forEach>

</ul> 
</body>
</html>