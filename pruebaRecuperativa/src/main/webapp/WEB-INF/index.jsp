<%--
  Created by IntelliJ IDEA.
  User: Francisco Cid
  Date: 08-07-2022
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Inicio</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
<h1>Hola</h1>
<h2>
    <div>
        <%--@elvariable id="paciente" type="java"--%>
        <form:form action="/paciente/registrar" method="post" modelAttribute="paciente">
            <form:label path="rut" class="form-label">Rut:</form:label>
            <form:input type="text" class="form-control" path="rut"/>
            <br>
            <form:label path="nombre" class="form-label">Nombre:</form:label>
            <form:input type="text" class="form-control" path="nombre"/>
            <br>
            <form:label path="fecha_nacimiento" class="form-label">Fecha de nacimiento:</form:label>
            <form:input type="date" class="form-control" path="fecha_nacimiento"/>
            <br>
            <input type="submit" value="Registrar">
            <br>
            <button type="submit" class="btn btn-outline-primary">Registrar</button>
    </div>
    </form:form>
</h2>
</body>
</html>
