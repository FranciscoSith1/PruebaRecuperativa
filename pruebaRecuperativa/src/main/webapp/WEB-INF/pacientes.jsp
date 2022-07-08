<%--
  Created by IntelliJ IDEA.
  User: Francisco Cid
  Date: 08-07-2022
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <!-- formulñario de busqueda -->
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Rut</th>
            <th scope="col">Nombre</th>
            <th scope="col">Fecha de Nacimiento</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="paciente" items="${pacientesRegistrados}">
            <tr>
                <th scope="row">${paciente.id}</th>
                <td>${paciente.rut}</td>
                <td>${paciente.nombre}</td>
                <td>${auto.fechaNacimiento}</td>
                <td><a class="btn btn-warning" href="/auto/editar/${auto.id}" role="button">Editar</a></td>
                <td><a class="btn btn-danger" href="/auto/eliminar/${auto.id}" role="button">Eliminar</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <c:if test="${msgAuto != null}">
        <c:out value="${msgAuto}"></c:out>
    </c:if>
</div>
</body>
</html>
