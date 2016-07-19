<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>User</title>
</head>
<body>

<h2>Enter User information</h2>
<form:form method="post" action="addUser">
    <table>

        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="lastName">Last name</form:label></td>
            <td><form:input path="lastName" /></td>
        </tr>
        <tr>
            <td><form:label path="age">age</form:label></td>
            <td><form:input path="age" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
