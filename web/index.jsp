<%--
  Created by IntelliJ IDEA.
  User: lightwingng
  Date: 2018/7/7
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Username CheckDemo</title>
    <link rel="stylesheet" href="static/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/css/main.css">
    <script src="static/js/jquery-1.11.3.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>
    <script type=text/javascript src="static/js/main.js"></script>
</head>
<body>
<div>
    <h3>Username Check Demo</h3>
    <table class="table">
        <tr>
            <td>User Name</td>
            <td>
                <input type="text" name="name" id="name" onblur="checkUserName()"
                       class="InputField">
            </td>
            <td>
                <span id="span01"></span>
            </td>
        </tr>
        <tr>
            <td>Password</td>
            <td>
                <input type="password" name="password" class="InputField">
            </td>
            <td></td>
        </tr>
        <tr>
            <td>Confirm Password</td>
            <td>
                <input type="password" name="repassword" class="InputField">
            </td>
            <td></td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <input type="email" name="email" class="InputField">
            </td>
            <td></td>
        </tr>
        <tr>
            <td>Information</td>
            <td>
                <input type="text" name="info" class="InputField">
            </td>
            <td></td>
        </tr>
        <tr align="center">
            <td colspan="3">
                <input type="submit" value="Sign Up >" class="SignUp">
            </td>
        </tr>
    </table>
</div>
</body>
</html>
