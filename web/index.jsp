<%--
  Created by IntelliJ IDEA.
  User: nervliming
  Date: 2016/12/22
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
  <meta charset="UTF-8">
  <title>相逢于幽暗森林</title>
  <meta name="keywords" content="个人博客" />
  <meta name="description" content="" />
  <link rel="stylesheet" href="css/index.css"/>
  <link rel="stylesheet" href="css/style.css"/>
  <script type="text/javascript" src="js/jquery1.42.min.js"></script>
  <script type="text/javascript" src="js/jquery.SuperSlide.2.1.1.js"></script>
  <!--[if lt IE 9]>
  <script src="js/html5.js"></script>
  <![endif]-->
  </head>
<body>
<style>
  #nav{

  }
</style>
<!--header start-->
<div id="header">
  <h1>幽暗森林</h1>
  <p>如果再也不见 祝你 早安 晚安 午安~</p>
</div>
<!--header end-->
<!--nav-->
<div id="nav">
  <ul>
    <li><a href="index.jsp">首页</a></li>
    <li><a href="about.html">关于我</a></li>
    <li><a href="shuo.html">暂留天气</a></li>
    <li><a href="/Blog/Show_Blog">个人日记</a></li>
    <li><a href="xc.html">相册展示</a></li>
    <li><a href="learn.html">暂留接口</a></li>
    <li><a href="guestbook.html">留言板</a></li>
    <div class="clear"></div>
  </ul>
</div>
<!--nav end-->
<!--content start-->
<div id="content">
  <!--left-->
  <div class="left" id="c_left">
    <div class="s_tuijian">
      <h2>文章<span>推荐</span></h2>
    </div>
    <div class="content_text">
      <!--wz-->
  </div>
  <!--left end-->
  <!--right-->
  <div class="right" id="c_right">
    <div class="s_about">
      <h2>关于博主</h2>
      <img src="images/photo/mushishi.jpg" width="230" height="230" alt="博主"/>
      <p>博主：夏影</p>
      <p>职业：Java开发</p>
      <p>简介：</p>
      <p>
        <a href="#" title="联系博主"><span class="left b_1"></span></a><a href="#" title="加入QQ群，一起学习！"><span class="left b_2"></span></a>
      <div class="clear"></div>
      </p>
    </div>
    <!--栏目分类-->
    <div class="lanmubox">
      <div class="hd">
        <ul><li>精心推荐</li><li>最新文章</li><li class="hd_3">随机文章</li></ul>
      </div>
      <div class="bd">
        <ul>
          <li><a href="#" title="网站项目实战开发（-）">网站项目实战开发（-）</a></li>
          <li><a href="#" title="关于响应式布局">关于响应式布局</a></li>
          <li><a href="#" title="如何创建个人博客网站">如何创建个人博客网站</a></li>
          <li><a href="#" title="网站项目实战开发（二）">网站项目实战开发（二）</a></li>
          <li><a href="#" title="为什么新站前期排名老是浮动？(转)">为什么新站前期排名老是浮动？(转)</a></li>
        </ul>
        <ul>
          <li><a href="#" title="网站项目实战开发（-）">网站项目实战开发（-）</a></li>
          <li><a href="#" title="关于响应式布局">关于响应式布局</a></li>
          <li><a href="#" title="如何创建个人博客网站">如何创建个人博客网站</a></li>
          <li><a href="#" title="网站项目实战开发（二）">网站项目实战开发（二）</a></li>
          <li><a href="#" title="为什么新站前期排名老是浮动？(转)">为什么新站前期排名老是浮动？(转)</a></li>
        </ul>
        <ul>
          <li><a href="#" title="网站项目实战开发（-）">网站项目实战开发（-）</a></li>
          <li><a href="#" title="关于响应式布局">关于响应式布局</a></li>
          <li><a href="#" title="如何创建个人博客网站">如何创建个人博客网站</a></li>
          <li><a href="#" title="网站项目实战开发（二）">网站项目实战开发（二）</a></li>
          <li><a href="#" title="为什么新站前期排名老是浮动？(转)">为什么新站前期排名老是浮动？(转)</a></li>
        </ul>


      </div>
    </div>
    <!--end-->
    <div class="link">
      <h2>友情链接</h2>
      <p><a href="http://www.acfun.tv">天下漫友是一家</a></p>
    </div>
  </div>
  <!--right end-->
  <div class="clear"></div>
</div>
<!--content end-->
<!--footer start-->
<div id="footer">
  <p>Design by:<a href="http://www.nervliming.com" target="_blank">夏影</a> 2016-12-13</p>
</div>
<!--footer end-->
<script type="text/javascript">jQuery(".lanmubox").slide({easing:"easeOutBounce",delayTime:400});</script>
<script  type="text/javascript" src="js/nav.js"></script>
</body>
</html>
