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
    <div class="uk-section-muted uk-padding-large uk-grid-match">
        <div class="uk-text-center" uk-grid>


            <div class="uk-width-1-4@m">
                <div class="uk-card uk-card-default uk-card-body">
                    <button class="uk-button uk-button-default uk-width-1-1 uk-margin-small-bottom">理学</button>
                    <button class="uk-button uk-button-primary uk-width-1-1 uk-margin-small-bottom">工学</button>
                    <button class="uk-button uk-button-default uk-width-1-1 uk-margin-small-bottom">文学</button>
                    <button class="uk-button uk-button-default uk-width-1-1 uk-margin-small-bottom">历史学</button>
                    <button class="uk-button uk-button-default uk-width-1-1 uk-margin-small-bottom">农学</button>
                    <button class="uk-button uk-button-default uk-width-1-1 uk-margin-small-bottom">医学</button>
                    <button class="uk-button uk-button-default uk-width-1-1 uk-margin-small-bottom">军事学</button>
                    <button class="uk-button uk-button-default uk-width-1-1 uk-margin-small-bottom">管理学</button>
                    <button class="uk-button uk-button-default uk-width-1-1 uk-margin-small-bottom">艺术学</button>
                    <button class="uk-button uk-button-default uk-width-1-1">哲学板块</button>

                </div>
            </div>

            <div class="uk-width-3-4@m">
                <div class="uk-card uk-card-default uk-card-body">
                    <article class="uk-article">

                        <h1 class="uk-article-title"><a class="uk-link-reset" href="">Heading</a></h1>

                        <p class="uk-article-meta">Written by <a href="#">Super User</a> on 12 April 2012. Posted in <a href="#">Blog</a></p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>

                        <div class="uk-grid-small uk-child-width-auto" uk-grid>
                            <div>
                                <a class="uk-button uk-button-text" href="#">所属板块</a>
                            </div>
                            <div>
                                <a class="uk-button uk-button-text" type="button" uk-toggle="target: #modal-example">评论</a>
                            </div>
                        </div>

                        <!-- This is the modal -->
                        <div id="modal-example" uk-modal>
                            <div class="uk-modal-dialog uk-modal-body">
                                <form class="uk-form-stacked">
                                    <div class="uk-margin">
                                        <div class="uk-modal-title">
                                            评论
                                        </div>
                                    </div>

                                    <div class="uk-margin">
                                        <label class="uk-form-label" for="form-stacked-text">内容</label>
                                        <div class="uk-form-controls">
                                            <textarea class="uk-textarea" rows="5" id="form-stacked-text" placeholder="Textarea" name="content"></textarea>
                                        </div>
                                        <p class="uk-text-right">
                                            <button class="uk-button uk-button-default uk-modal-close" type="button">取消</button>
                                            <input class="uk-button uk-button-primary" type="submit">
                                        </p>
                                    </div>
                                </form>


                            </div>
                        </div>

                    </article>
                </div>
                <hr class="uk-divider-icon">
                <ul class="uk-comment-list">
                    <div class="uk-width-3-4@m">
                        <div class="uk-card uk-card-default uk-card-body">
                            <li>
                                <article class="uk-comment uk-visible-toggle">
                                    <header class="uk-comment-header uk-position-relative">
                                        <div class="uk-grid-medium uk-flex-middle" uk-grid>
                                            <div class="uk-width-auto">
                                                <img class="uk-comment-avatar" src="../imgs/shot.jpg" width="80" height="80" alt="">
                                            </div>
                                            <div class="uk-width-expand">
                                                <h4 class="uk-comment-title uk-margin-remove"><a class="uk-link-reset" href="#">Author</a></h4>
                                                <p class="uk-comment-meta uk-margin-remove-top"><a class="uk-link-reset" href="#">12 days ago</a></p>
                                            </div>
                                        </div>
                                        <div class="uk-position-top-right uk-position-small uk-hidden-hover"><a class="uk-link-muted" href="#">Reply</a></div>
                                    </header>
                                    <div class="uk-comment-body">
                                        <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.</p>
                                    </div>
                                </article>

                            </li>
                        </div>
                    </div>
                </ul>

            </div>

        </div>
    </div>
</body>
</html>

<%@ include file="footer.jsp" %>
