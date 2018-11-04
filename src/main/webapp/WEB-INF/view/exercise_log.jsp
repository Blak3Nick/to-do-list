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
            <c:forEach var="exercise" exercises="${exerciseData.exercises}">
                <tr>
                    <td><c:out value="${exercise.id}"/></td>
                    <td><c:out value="${exercise.deadline}"/></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>