<%-- 
    Document   : viewnote
    Created on : Oct 5, 2021, 9:28:17 PM
    Author     : 851649
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        
        <h2>View Note</h2>
        
        <p>Title: ${note.title}</p>
        <p>Contents:</p>
        <p>${note.content}</p>
        <p> <a href="note?edit">Edit</a></p>
    </body>
</html>
