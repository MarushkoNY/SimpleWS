<%-- 
    Document   : index
    Created on : 14.12.2017, 9:53:58
    Author     : Nikolay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="Serv">
            Store date and ip address of request: <button type="submit">Store</button>
        </form>
        <br><hr>
        <form method="get" action="Serv">
            Get last request's date and ip <button type="submit">Get</button>
        </form>
    </body>
</html>
