<%--
  Created by IntelliJ IDEA.
  User: Bill Lee
  Date: 2018/12/11
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ include file="header.jsp" %>
<html>
<head>
    <title>学习论坛</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="../css/uikit.css">
    <link rel="stylesheet" type="text/css" href="../css/uikit-rtl.css">
    <script type="text/javascript" src="../js/uikit.js"></script>
    <script type="text/javascript" src="../js/uikit-icons.js"></script>
</head>
<body>
    <div class="uk-section-muted uk-padding-large">
        <div class="uk-card uk-card-default uk-card-body uk-width-1-2@m uk-align-center">
        <img src="../imgs/shot.jpg" class="uk-width-1-3 uk-align-center" >

            <form class="uk-form uk-from-horizontal uk-margin">


            <div class="uk-margin">
                <label class="uk-form-label" for="form-horizontal-text">用户名</label>
                <div class="uk-form-controls">
                    <input class="uk-input" id="form-horizontal-text" type="text" name="username" placeholder="输入用户名">
                </div>

            </div>

            <div class="uk-margin">
                <label class="uk-form-label" for="form-horizontal-password">密码</label>
                <div class="">
                    <input class="uk-input " id="form-horizontal-password" type="password" name="password" placeholder="密码应包含数字与字母，且长度大于16位">
                </div>
            </div>

            <div class="uk-margin">
                <div class="">
                    <input class="uk-input uk-button uk-button-primary" id="form-stacked-text" type="submit">
                </div>

            </div>


        </form>


         </div>
    </div>
</body>
</html>

<%@ include file="footer.jsp" %>
