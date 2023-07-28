<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Animal List</title>
</head>
<body>
    <h1>Animal List</h1>
    <table>
        <tr>
            <th>COMMON_CODE_ID</th>
            <th>NAME</th>
            <!-- Add other columns here as needed -->
        </tr>
        <c:forEach items="${animals}" var="animal">
            <tr>
                <td>${animal.COMMON_CODE_ID}</td>
                <td>${animal.NAME}</td>
                <!-- Display other columns here as needed -->
            </tr>
        </c:forEach>
    </table>
</body>
</html>