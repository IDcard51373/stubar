package Package_Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 功能：获取某个帖子的信息
 *
 * 接收数据
 * Post_id：帖子的id
 *
 * 返回数据
 * Tittle：帖子的标题
 * Post_Content：帖子的内容
 * Time_Create：帖子发布的时间
 * Major：帖子所属的专业
 * Post_Nickname：发帖者的昵称
 * Comment_Content：评论的内容
 * Comment_Nickname：评论者的昵称
 */

public class Servlet_LoadPost extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
