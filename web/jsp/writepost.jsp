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
        <div class="uk-card uk-card-default uk-card-body uk-width-2-3@m uk-align-center">
            <h3 class="uk-card-title uk-text-center">编辑帖子</h3>
            <form class="uk-form-stacked">

                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-title">帖名</label>
                    <div class="uk-form-controls">
                        <input class="uk-input" id="form-stacked-title" type="text" name="Title" >
                    </div>
                </div>

                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-text">帖子内容</label>
                    <div class="uk-form-controls">
                        <textarea class="uk-textarea" rows="5" id="form-stacked-text" name="content" placeholder="Textarea"></textarea>
                    </div>
                </div>

                <div class="uk-margin">
                    <label class="uk-form-label" for="form-stacked-select">板块</label>
                    <div class="uk-form-controls">
                        <select class="uk-select" id="form-stacked-select" name="block">
                            <option >文学</option>
                            <option >理学</option>
                            <option >工学</option>
                            <option >医学</option>
                            <option >农学</option>
                            <option >军事学</option>
                            <option >管理学</option>
                            <option >艺术学</option>
                            <option >哲学</option>
                        </select>
                    </div>
                </div>

                <div class="uk-margin">
                    <div class="uk-form-controls">
                        <input class="uk-input uk-button uk-button-primary"  type="submit">
                    </div>

                </div>
            </form>
        </div>
    </div>
</body>
</html>

<%@ include file="footer.jsp" %>
