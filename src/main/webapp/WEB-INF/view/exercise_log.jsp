<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Exercise Tracker</title>
</head>
<body>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption>
                <h2>Logger</h2>
            </caption>
            <tr>
                <th>Title</th>
                <th>Deadline</th>
            </tr>
            <c:forEach var="exercise" items="${exerciseData.exercises}">
                <td>
                    <c:out value="${exercise.id}"/>
                    <c:out value="${exercise.setRepModel.getSets()}"/>
                </td>
            </c:forEach>
        </table>
    </div>
</body>
</html>