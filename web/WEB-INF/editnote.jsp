<%-- 
    Document   : editnote
    Created on : Oct 5, 2021, 9:50:04 PM
    Author     : 851649
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        
        <h2>Edit Note</h2>
        
        <form method="POST">
        <label>Title:</label>
        <input type="text" name="edit_title" value = "${note.title}">
        <label>Contents:</label>
        <input type ="textarea" name = "edit_content" value="${note.content}">
        <input type ="submit" value="Save changes">
        </form>
        
        <p> <a href="note">View</a></p>
    </body>
</html>
