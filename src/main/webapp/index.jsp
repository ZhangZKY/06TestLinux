<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Title</title>

        <%--自动获取并设置基地址--%>
        <%
            String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
        %>
        <base href="<%=basePath%>" />

    </head>

    <body>
        <h2>功能汇总</h2>
            <ol>
                <li><h3>查询功能：</h3>
                    <ul>
                        <li><a href="selectAllStudent.jsp">查询学生信息</a></li>
                        <li><a href="static/jsp/insertStudent.jsp">注册学生信息</a></li>
                    </ul>
                </li>
            </ol>
    </body>
</html>





