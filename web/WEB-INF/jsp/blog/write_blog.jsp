<%--
  Created by IntelliJ IDEA.
  User: nervliming
  Date: 2016/12/22
  Time: 1:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
写博客的页面 写完之后返回到Blog页面  再往后加入一个文本编辑器
<form name="Blog" method="post" action="/Blog/Blog_Action.action">
    <table align="1" width="100" bgcolor="aqua" border="100">
        <tr>
            <td>
                标题
            </td>
            <td>
                <input type="text" name="title">
            </td>
        </tr>
        <tr>
            <td>
                内容
            </td>
            <td>
                <input type="textarea" name="content" rows="30" cols="200">
            </td>
        </tr>

    </table>
    <tr>
        <td>
            <input type="submit">
        </td>
        <td>
            <input type="reset">
        </td>
    </tr>
</form>
</body>
</html>
