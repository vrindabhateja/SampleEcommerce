<%-- 
    Document   : addcategory
    Created on : 5 Mar, 2019, 7:00:50 PM
    Author     : vrind
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <c:import url="header.jsp"/>
        
    </head>
    <body>
        <h1 style="text-align: center;"> Add Category </h1>
        
        <br>
        
        <form action="AddCategoryToDB" method="post" style="text-align: center; margin: auto; width: 80%;">
            
            <input class="form-control" placeholder="Enter Category Name" name="name">
            <br>
            <textarea class="form-control" placeholder="Enter Category Description" name="description"></textarea>
            <br>
            <button class="btn btn-success">Add</button>
        </form>
        
    </body>
</html>
