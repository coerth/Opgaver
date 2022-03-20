<%--
  Created by IntelliJ IDEA.
  User: Morten
  Date: 20/03/2022
  Time: 17.29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Huskesedlen</title>
</head>
<body>

<%--<h1> hvis du kan læse det her så er du bare herre swagg ${requestScope.navn}</h1>

din session id er ${requestScope.id}--%>

<h1>her kan du oprettet emner på huskesedlen</h1>
<br>
<br>
<br>

<form action="ServletTilfoejEmne">
    <label for="emne">Her kan du oprette emner:</label><br>
    <input type="text" id="emne" name="emne" value="Ølbong"><br>
    <input type="submit" value="Submit">
</form>

<br>


session scope
<br>
<c:forEach items="${sessionScope.huskeListe}" var="emne">

    husk ${emne}
    <br>

</c:forEach>


<br>
<br><br>

contekst scopet

<br><br>
<c:forEach items="${applicationScope.fællesListe}" var="emne">

    husk ${emne}
    <br>

</c:forEach>


</body>
</html>
