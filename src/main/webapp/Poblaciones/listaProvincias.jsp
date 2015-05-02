<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <jsp:include page="/head.jsp" />
    </head>
    <body class="container">
        <jsp:include page="/top.jsp" />
        <h2>Lista de provincias almacenadas</h2>
        <p>pulse sobre el nombre de la provincia para ver las poblaciones</p>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Nº Poblaciones</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${listaProvincias.provincias}" var="provincia">
                <tr>
                    <td>${provincia.nombre}</td>
                    <td>${provincia.poblaciones}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <jsp:include page="/bot.jsp" />
    </body>
</html>
