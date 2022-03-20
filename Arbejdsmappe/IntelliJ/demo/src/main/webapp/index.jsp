<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Velkommen til din huskeseddel!" %>
</h1>
<br/>
<%--<a href="https://dr.dk">klik her for at se de seneste nyheder</a>--%>

<br>
<br>
<br>

<form action="hello-servlet">
    <label for="fname">Skriv dit navn:</label><br>
    <input type="text" id="fname" name="fname" value="Pernille"><br>
    <input type="submit" value="Submit">
</form>


</body>
</html>