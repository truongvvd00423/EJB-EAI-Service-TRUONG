<%-- 
    Document   : index
    Created on : Nov 5, 2018, 11:31:28 AM
    Author     : ueda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginServlet" method="post">
            user name: <input type="text" name="username"/><br>
            password:: <input type="password" name="password"/><br>
            <input type="submit" value="Login"/>&nbsp;
            <input type="reset" value="Reset"/>
        </form>
    </body>
</html>
