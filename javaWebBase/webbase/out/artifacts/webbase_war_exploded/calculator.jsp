<%--
  Created by IntelliJ IDEA.
  User: wk
  Date: 2017/10/3
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.exa.*" %>
<jsp:useBean id="calculator"  scope="request" class="com.exa.Calculator">

    <jsp:setProperty name="calculator" property="*"/>

</jsp:useBean>



<html>
<head>
    <title>计算器</title>
</head>
<body>
<%
    String CalculateResult;

    try {
        calculator.calculate();

        CalculateResult =calculator.getFirst()+calculator.getOperator()+calculator.getSecond()+"="+calculator.getResult();
    } catch (Exception e) {
        e.printStackTrace();
        CalculateResult = e.getMessage();
    }
%>
<form method="get" action="calculator.jsp">
    <table width="75%" border="1" bordercolor = "#aaaaaa">
        <tr bgcolor="#000000">
           <td colspan="2">计数器</td>
        </tr>

        <tr >
            <td >计算结果</td>
            <td>
                <<input type="text" name="CalculateResult" value=<%= CalculateResult%>>
            </td>
        </tr>

        <tr>
            <td>first</td>
            <td>
                <input type="text" name ="first">
            </td>
        </tr>

        <tr>
            <td>operator</td>
            <td>
                <select name = "operator">
                        <option value="+">+</option>
                        <option value="-">-</option>
                        <option value="*">*</option>
                        <option value="/">/</option>
                </select>
            </td>
        </tr>

        <tr>
            <td>second</td>
            <td>
                <input type="text" name ="second">
            </td>
        </tr>

        <tr>
            <td colspan="2" bgcolor="#eeeeee">
                <input type="submit" value="计算">
            </td>

        </tr>
    </table>

</form>



</body>
</html>
