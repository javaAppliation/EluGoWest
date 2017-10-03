<%--
  Created by IntelliJ IDEA.
  User: wk
  Date: 2017/10/3
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.exa.*" %>
<jsp:useBean id="userinfo" class="com.exa.UserInfo" scope="page">
    <jsp:setProperty name="userinfo" property="*"></jsp:setProperty>
</jsp:useBean>
<jsp:useBean id="addUser" class="com.exa.AddUser">
    <%
        addUser.setUserInfo(userinfo);
        addUser.regist();
    %>
</jsp:useBean>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
