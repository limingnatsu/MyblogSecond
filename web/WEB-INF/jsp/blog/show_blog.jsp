<%@ page import="java.util.List" %>
<%@ page import="com.blog.model.Blog" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
Created by IntelliJ IDEA.
User: nervliming
Date: 2017/1/9
Time: 22:40
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <title>Title</title>

</head>

<script>

    function deleteAlert() {
        alert("删除成功即将返回主页");
        deleteForm.submit();

    }
</script>
<body>
<a href="/index.jsp">返回主页</a>
<a href="/Blog/Jump_Write_Blog_Page">写博客</a>
<form action="/Blog/Delete_Blog" method="deleteBlog" name="deleteForm">
    <table><tr>
        <th>
            <input type="text" name="blog.id">输入文章名或者编号
        </th>
        <td>
            <input type="button" value="删除" onclick="deleteAlert()">
        </td>
    </tr>
    </table>
</form>
<s:iterator value="blogs" >
<table><tr>
  <h4 style="background-color:bisque"> 编号: <s:property value="id" ></s:property></h4></tr>
   <tr> <h5 style="background-color: #F55522">标题---<s:property value="title"></s:property></h5></tr>
    <tr> <h6 style="background-color: #9c0f4a"> <s:property value="content"></s:property></h6></tr>
</table>
</s:iterator>

<s:debug></s:debug>
</body>

</html>