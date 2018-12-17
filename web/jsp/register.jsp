

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

<%
    String path = request.getContextPath();
    // 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是http://localhost:8080/MyApp/）:
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<html>
<head>
    <title>学习论坛</title>
    <base href=" <%=basePath%>">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="../css/uikit.css">
    <link rel="stylesheet" type="text/css" href="../css/uikit-rtl.css">
    <script type="text/javascript" src="../js/uikit.js"></script>
    <script type="text/javascript" src="../js/uikit-icons.js"></script>

</head>
<body>
    <div class="uk-section-muted uk-padding-large">
        <div class="uk-card uk-card-default uk-card-body uk-width-2-3@m uk-align-center">
            <h3 class="uk-card-title uk-text-center">注册</h3>
            <form class="uk-form-stacked" action="/UserServlet" method="post">

                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-user">用户名</label>
                    <div class="uk-form-controls">
                        <input class="uk-input" id="form-stacked-user" name="User_name" type="text" placeholder="用户名">
                    </div>
                </div>

                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-nick">昵称</label>
                    <div class="uk-form-controls">
                        <input class="uk-input" id="form-stacked-nick" name="Nickname" type="text" placeholder="昵称">
                    </div>
                </div>

                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-pass">密码</label>
                    <div class="uk-form-controls">
                        <input class="uk-input " id="form-stacked-pass" type="password" name="Password" placeholder="密码应包含数字与字母，且长度大于16位">
                    </div>
                </div>

                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-major">专业</label>
                    <div class="uk-form-controls">
                        <input class="uk-input" id="form-stacked-major" name="Major" type="text" placeholder="专业">
                    </div>
                </div>

                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-birth">生日</label>
                    <div class="uk-form-controls">
                        <input class="uk-input" id="form-stacked-birth" name="Birthday" type="text" placeholder="生日">
                    </div>
                </div>


                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-select">性别</label>
                    <div class="uk-form-controls">
                        <select class="uk-select" id="form-stacked-select" name="Gender">
                            <option>男</option>
                            <option>女</option>
                        </select>
                    </div>
                </div>

                <div class="uk-margin">
                    <div class="uk-form-controls">
                        <input class="uk-input uk-button uk-button-primary" id="form-stacked-text" type="submit">
                    </div>

                </div>


            </form>

        </div>
    </div>
</body>
</html>

<%@ include file="footer.jsp" %>
