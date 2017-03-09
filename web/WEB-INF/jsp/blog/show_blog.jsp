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
    <script src="http://how2j.cn/study/js/jquery/2.0.0/jquery.min.js"></script>
    <link href="http://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="http://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
</head>
<style>
    #num{
        font-size: 12px;
        color: #9c0f4a;
    }
    #title{
        font-size: 20px;
        color: black;
    }
    #content{
        font-size:16px;
        color: #829696;
        font-family: Arial;
    }
    div{
         width:1000px; height:100px;
        text-align:center;
        margin:0 auto;
    }

</style>
<script>

    function deleteAlert() {

            alert("删除成功即将返回主页");
            deleteForm.submit();

    }
</script>
<body>
<span id="right" class="pull-right"><button class="btn btn-info"><a href="/index.jsp">返回主页</a></button>
<button class="btn btn-info"><a href="/Blog/Jump_Write_Blog_Page">写博客</a></button></span>

<form action="/Blog/Delete_Blog" method="deleteBlog" name="deleteForm">
    <table><tr>
        <th>
            <input type="text" name="id">输入文章名或者编号
        </th>
        <td>
            <button class="btn btn-danger" name="title" onclick="deleteAlert()">删除</button>
        </td>
    </tr>
    </table>
</form>
<s:iterator value="blogs" >
<table class="table table-hover">
  <div> <span id="num" style="text-align:center!important;">编号:<s:property value="id" ></s:property></span><br>
      <span id="title" style="text-align:center!important;"><s:property value="title"></s:property></span><br>
   <p> <span id="content" style="text-align:center!important;"><s:property value="content"></s:property></span></p> </div><br>
</table>
</s:iterator>

<s:debug></s:debug>
</body>

</html>