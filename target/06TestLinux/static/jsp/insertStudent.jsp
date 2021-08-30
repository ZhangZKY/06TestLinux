<%--
  Created by IntelliJ IDEA.
  User: Zhangzky
  Date: 2021/8/30
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>

        <%
            String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
        %>
        <base href="<%=basePath%>" />

    </head>
    <body>
        <form action="insertStudent" method="post">
            <table align="center">
                <tr align="center">
                    <td>姓名:</td>
                    <td>
                        <input type="text" name="name" id="name" />
                    </td>
                </tr>
                <tr align="center">
                    <td>邮箱:</td>
                    <td>
                        <input type="text" name="email" id="email" />
                    </td>
                </tr>
                <tr align="center">
                    <td>密码:</td>
                    <td>
                        <input type="password" name="password" id="password" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="right">
                        <input type="submit" value="注册" id="submit" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
