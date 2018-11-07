<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="academy.learnprogramming.util.Mappings" %>

<html>
<head>
    <title>View Item</title>
</head>
<body>
    <div align="center">
        <table>
            <tr>
                <td><label>ID</label></td>
                <td>
                    <c:out value="${todoItem.id}"/>
                </td>
            </tr>
            <tr>
                <td><label>Title</label></td>
                <c:out value="${todoItem.title}"/>
            </tr>
            <tr>
                <td><label>Deadline</label></td>
                <c:out value="${todoItem.deadline}"/>
            </tr>
            <tr>
                <td><label>Details</label></td>
                <c:out value="${todoItem.details}"/>
            </tr>
        </table>
    </div>
</body>
</html>