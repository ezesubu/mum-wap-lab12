<%--
  Created by IntelliJ IDEA.
  User: ezesubu
  Date: 7/11/18
  Time: 7:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
  </head>
  <body>
  <c:if test="${true}">
    <span style="color:red;"> ${error}</span>
  </c:if>
    <form action="/login">
    <label for="username">Username</label> <input type="text" id="username" name="username"><br /><br />
    <label for="password">Password:</label> <input type="password" id="password" name="password"><br /><br />
    <button type = "submit">Login</button>
      <br>
    <input type="checkbox" name="rememberme" value="rememberme" id="rememberme">
      <label for="rememberme">Rememberme</label>
  </form>
  <%--<cd:customDateTime/>--%>
</html>
