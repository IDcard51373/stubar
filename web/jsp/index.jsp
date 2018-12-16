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

        <div class="uk-position-relative uk-visible-toggle " uk-slideshow>

            <ul class="uk-slideshow-items">
                <li>
                    <img data-src="../imgs/bg1.jpg" width="1200" height="800" alt=""  uk-img="target: !ul > :last-child, !* +*">
                </li>
                <li>
                    <img data-src="../imgs/bg2.jpg" width="1200" height="800" alt=""  uk-img="target: !* -*, !* +*">
                </li>
                <li>
                    <img data-src="../imgs/bg3.jpg" width="1200" height="800" alt=""  uk-img="target: !* -*, !ul > :first-child">
                </li>
            </ul>

            <a class="uk-position-center-left uk-position-small uk-hidden-hover" href="#" uk-slidenav-previous uk-slideshow-item="previous"></a>
            <a class="uk-position-center-right uk-position-small uk-hidden-hover" href="#" uk-slidenav-next uk-slideshow-item="next"></a>

        </div>


</body>
</html>

<%@ include file="footer.jsp" %>
