package Package_Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 功能：注册
 *
 * 接收JSON数据
 * User_name：用户名
 * Password：密码
 * Nickname：昵称
 * Major：专业
 * Birthday：生日
 * Gender：性别（男/女）
 *
 * 返回注册结果(JSON)
 * Result：成功=0，否则失败
 */


public class Servlet_Register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String User_name = request.getParameter("User_name");
        String Password = request.getParameter("Password");
        String Nickname = request.getParameter("Nickname");
        String Major = request.getParameter("Major");
        String Birthday = request.getParameter("Birthday");

        int result = 0;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
