<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: JZH
  Date: 2019/5/13
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2 style="color: green" >用户主页</h2>

    <form action="/user/query">
        点击倒叙显示用户列表<input type="submit" value="确定">
    </form>

    <%--使用JSTL中的forEach 循环来遍历List--%>
    <table width="300px" align="center" border="1" cellspacing="0">
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>密码</td>
            <td>创建时间 </td>
        </tr>

        <c:forEach items="${userInfoList}" var="userInfo" >
            <tr>
                <td><c:out value="${userInfo.id}"/></td>
                <td><c:out value="${userInfo.name}"/></td>
                <td><c:out value="${userInfo.age}"/></td>
                <td><c:out value="${userInfo.password}"/></td>
                <td><c:out value="${userInfo.creaDate}"/></td>
            </tr>
        </c:forEach>

    </table>


    <hr style="color: deeppink">
    <h1 style="color: green">根据用户输入的姓名进行查询</h1>

    <form action="/user/DynamicQueryUser">
        请输入姓名进行查询：<input type="text" name="userName"> <input type="submit" value="查询">
    </form>



    <hr style="color: blue">
    <h1 style="color: green">统计男女用户个数并展示</h1>


    <form action="/user/StatisticalSex">
        点击进行查看男女用户人数：<input type="submit" value="查询">
    </form>

    <table width="300px" align="center" border="1" cellspacing="0">

        <tr>
            <td>男性用户人数</td>
            <td>女性用户人数</td>
        </tr>


        <c:forEach items="${countList}" var="Count">

            <tr>
                <td><c:out value="${Count.maleUsers}"/></td>
                <td><c:out value="${Count.femaleUsers}"/></td>
            </tr>

        </c:forEach>

    </table>














</body>
</html>
