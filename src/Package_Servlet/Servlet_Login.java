package Package_Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 功能：登陆
 * 登陆成功后加载主页面，显示5条最近更新的帖子（标题、内容）（默认数据库中帖子数量>5条）
 *
 * 接收数据
 * User_name：用户名
 * Password：密码
 *
 * 返回JSON数据
 * Result：为0则登陆成功，其余的为失败。
 */

public class Servlet_Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}