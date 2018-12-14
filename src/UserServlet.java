import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static javax.print.attribute.standard.MediaSizeName.A;

/**
 * Servlet类，实现前后端交互
 *
 * "Method"变量的值，表示操作的类型
 * 1、Register：注册
 * 2、Login：登陆
 * 3、LoadMainPage：加载主页面
 * 4、LoadClassPage：加载某一板块的页面
 * 5、LoadPersonalPage：加载个人主页
 * 6、LoadPost：加载某一帖子内容
 * 7、WritePost：写帖子
 * 8、WriteComment：写评论
 *
 * 1、Register：注册
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
 *
 * 2、Login：登陆
 * 接收数据
 * User_name：用户名
 * Password：密码
 *
 * 返回JSON数据
 * Result：为0则登陆失败，否则为用户的User_id。
 * Nickname
 *
 * 3、LoadMainPage：加载主页面
 * 接收数据
 * 无
 *
 * 返回JSON数据（一维）
 * Tittle1
 * Post_id1
 * PartContent1
 *
 * Tittle2
 * Post_id2
 * PartContent2
 *
 * Tittle3
 * Post_id3
 * PartContent3
 *
 * Tittle4
 * Post_id4
 * PartContent4
 *
 * Tittle5
 * Post_id5
 * PartContent5
 *
 * 4、LoadClassPage：加载某一板块的页面
 * 接收数据
 * Class：板块的名字
 *
 * 返回JSON数据（一维）
 * Tittle1
 * Post_id1
 * PartContent1
 *
 * Tittle2
 * Post_id2
 * PartContent2
 *
 * Tittle3
 * Post_id3
 * PartContent3
 *
 * Tittle4
 * Post_id4
 * PartContent4
 *
 * Tittle5
 * Post_id5
 * PartContent5
 *
 * 5、LoadPersonalPage：加载个人主页
 * 接收数据
 * User_id：用户的id
 *
 * 返回数据(JSON)
 * User_name：用户的用户名
 * Nickname：用户的昵称
 * Major：用户的专业
 * Gender：用户的性别
 * Birthday：用户的生日
 * Postnum：用户发帖的数量
 *
 * 6、LoadPost：加载某一帖子内容
 * 接收数据
 * Post_id：帖子的id
 *
 * 返回数据
 * Tittle：帖子的标题
 * Post_Content：帖子的内容
 * Time_Create：帖子发布的时间
 * Major：帖子所属的专业
 * Post_Nickname：发帖者的昵称
 * Comment_Exist：是否有评论（Yes/No）
 * Comment_Content：评论的内容
 * Comment_Nickname：评论者的昵称
 * Comment_Time：评论的时间
 *
 * 7、WritePost：写帖子
 * 接收
 * Tittle：帖子的标题
 * Content：帖子的内容
 * Major：帖子的专业
 * User_id：发帖者的id
 *
 * 返回
 * Result：结果，为0则成功
 *
 * 8、WriteComment：写评论
 * 接收数据
 * Post_id：帖子的id
 * Content：评论的内容
 * User_id：评论者的id
 *
 * 返回
 * Result：结果，为0则成功
 */

public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        //创建实体类
        User user = new User();

        //获取请求类型
        String Method = request.getParameter("Method");
        System.out.println("获取到的method参数为： " + Method);

        switch(Method) {
            case "Register":
                this.doRegister(request, response);
                break;
            case "Login":
                this.doLogin(request, response);
                break;
            case "LoadMainPage":
                this.doLoadMainPage(request, response);
                break;
            case "LoadClassPage":
                this.doLoadClassPage(request, response);
                break;
            case "LoadPersonalPage":
                this.doLoadPersonalPage(request, response);
                break;
            case "LoadPost":
                this.doLoadPost(request, response);
                break;
            case "WritePost":
                this.doWritePost(request, response);
                break;
            case "WriteComment":
                this.doWriteComment(request, response);
                break;
        }
    }

    /**
     * 1、Register：注册
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
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void doRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, JSONException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("开始注册");

        DBControl dbcontrol = new DBControl();
        //获取数据
        String User_name = request.getParameter("User_name");
        String Password = request.getParameter("Password");
        String Nickname = request.getParameter("Nickname");
        String Major = request.getParameter("Major");
        String Birthday = request.getParameter("Birthday");
        String Gender = request.getParameter("Gender");

        System.out.println("获得的参数 User_name = " + User_name);
        System.out.println("获得的参数 Password = " + Password);
        System.out.println("获得的参数 Nickname = " + Nickname);
        System.out.println("获得的参数 Major = " + Major);
        System.out.println("获得的参数 Birthday = " + Birthday);
        System.out.println("获得的参数 Gender = " + Gender);

        //处理数据
        String[] A = new String[6];
        A[0] = User_name;
        A[1] = Password;
        A[2] = Nickname;
        A[3] = Gender;
        A[4] = Major;
        A[5] = Birthday;

        JSONObject json = new JSONObject();

        //录入数据库
        if(dbcontrol.DB_Signin(A)) {
            json.put("Result","0");
            System.out.println("注册成功");
        }
        else {
            json.put("Result","1");
            System.out.println("注册失败");
        }

        //返回数据
        try {
            response.getWriter().print(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("已经返回结果给页面");
    }

    /**
     * 2、Login：登陆
     * 接收数据
     * User_name：用户名
     * Password：密码
     *
     * 返回JSON数据
     * User_id：为0则登陆失败，否则为User_id
     * Nickname：用户的昵称
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, JSONException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("开始登陆");

        DBControl dbcontrol = new DBControl();

        //获取数据
        String User_name = request.getParameter("User_name");
        String Password = request.getParameter("Password");

        System.out.println("获得的参数 User_name = " + User_name);
        System.out.println("获得的参数 Password = " + Password);

        //处理数据
        String[] A = new String[2];
        A[0] = User_name;
        A[1] = Password;

        JSONObject json = new JSONObject();

        String User_id = dbcontrol.DB_Login(A);
        if(User_id.equals("0")) {
            System.out.println("登陆失败");
            json.put("Result","0");
        }
        else {
            System.out.println("登陆成功");
            json.put("Result", User_id);
            json.put("Nickname", dbcontrol.GetUserInfo(User_id)[1]);
        }

        try {
            response.getWriter().print(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("已经返回登陆结果给页面");
    }

    /**
     * 3、LoadMainPage：加载主页面
     * 接收数据
     * 无
     *
     * 返回JSON数据（一维）
     * Tittle1
     * Post_id1
     * PartContent1
     *
     * Tittle2
     * Post_id2
     * PartContent2
     *
     * Tittle3
     * Post_id3
     * PartContent3
     *
     * Tittle4
     * Post_id4
     * PartContent4
     *
     * Tittle5
     * Post_id5
     * PartContent5
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void doLoadMainPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, JSONException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("开始加载主页面");

        DBControl dbcontrol = new DBControl();

        //查询数据
        String[][] A = new String[5][3];
        A = dbcontrol.DB_GetMainPage();

        System.out.println("已经从数据库查询到数据，其中第一个帖子的Tittle为：" + A[0][1] + "，Post_id为：" + A[0][0] + "，PartContent为：" + A[0][2]);
        JSONObject json = new JSONObject();
        json.put("Tittle1",A[0][1]);
        json.put("Post_id1",A[0][0]);
        json.put("PartContent1",A[0][2]);
        json.put("Tittle2",A[1][1]);
        json.put("Post_id2",A[1][0]);
        json.put("PartContent2",A[1][2]);
        json.put("Tittle3",A[2][1]);
        json.put("Post_id3",A[2][0]);
        json.put("PartContent3",A[2][2]);
        json.put("Tittle4",A[3][1]);
        json.put("Post_id4",A[3][0]);
        json.put("PartContent4",A[3][2]);
        json.put("Tittle5",A[4][1]);
        json.put("Post_id5",A[4][0]);
        json.put("PartContent5",A[4][2]);

        //返回数据
        try {
            response.getWriter().print(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("已经返回主页面给页面");
    }

    /**
     * 4、LoadClassPage：加载某一板块的页面
     * 接收数据
     * Class：板块的名字
     *
     * 返回JSON数据（一维）
     * Tittle1
     * Post_id1
     * PartContent1
     *
     * Tittle2
     * Post_id2
     * PartContent2
     *
     * Tittle3
     * Post_id3
     * PartContent3
     *
     * Tittle4
     * Post_id4
     * PartContent4
     *
     * Tittle5
     * Post_id5
     * PartContent5
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void doLoadClassPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, JSONException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("开始加载板块页面");

        //获取数据
        String Class = request.getParameter("Class");

        System.out.println("用户打开的页面为：" + Class + "，将要从数据库中查询数据");

        //查询数据
        //加载某板块页面。
        //导入专业板块的名称。
        //导出该板块最近刷新的5个帖子的Post_id、Title和Content的前50个字符，存在一个5*3的数组中。
        //String[][] DB_GetClassPage();
        String[][] A = new String[5][3];
        DBControl dbcontrol = new DBControl();
        A = dbcontrol.DB_GetClassPage(Class);

        System.out.println("已经从数据库查询到数据，其中第一个帖子的Tittle为：" + A[0][1] + "，Post_id为：" + A[0][0] + "，PartContent为：" + A[0][2]);
        JSONObject json = new JSONObject();
        json.put("Tittle1",A[0][1]);
        json.put("Post_id1",A[0][0]);
        json.put("PartContent1",A[0][2]);
        json.put("Tittle2",A[1][1]);
        json.put("Post_id2",A[1][0]);
        json.put("PartContent2",A[1][2]);
        json.put("Tittle3",A[2][1]);
        json.put("Post_id3",A[2][0]);
        json.put("PartContent3",A[2][2]);
        json.put("Tittle4",A[3][1]);
        json.put("Post_id4",A[3][0]);
        json.put("PartContent4",A[3][2]);
        json.put("Tittle5",A[4][1]);
        json.put("Post_id5",A[4][0]);
        json.put("PartContent5",A[4][2]);

        //返回数据
        try {
            response.getWriter().print(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("已经返回" + Class + "板块的5个帖子给页面");
    }

    /**
     * 5、LoadPersonalPage：加载个人主页
     * 接收数据
     * User_id：用户的id
     *
     * 返回数据(JSON)
     * User_name：用户的用户名
     * Nickname：用户的昵称
     * Major：用户的专业
     * Gender：用户的性别
     * Birthday：用户的生日
     * Postnum：用户发帖的数量
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void doLoadPersonalPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, JSONException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("开始访问个人主页");

        //获取数据
        String User_id = request.getParameter("User_id");
        System.out.println("用户的id为：" + User_id);

        JSONObject json = new JSONObject();

        //从数据库获取数据
        String[] A = new String[6];

        DBControl dbcontrol = new DBControl();

        A = dbcontrol.GetUserInfo(User_id);

        System.out.println("已经成功从数据库获取数据，用户的User_name为：" + A[0] + "，Nickname为：" + A[1] + "，Gender为：" + A[2] + "，Major为：" + A[3] + "，Birthday为：" + A[4] + "，发布帖子总数为：" + A[5]);
        json.put("User_name",A[0]);
        json.put("Nickname",A[1]);
        json.put("Gender",A[2]);
        json.put("Major",A[3]);
        json.put("Birthday",A[4]);
        json.put("Postnum",A[5]);

        //返回数据
        try {
            response.getWriter().print(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("已经返回用户个人信息给页面");
    }

    /**
     * 6、LoadPost：加载某一帖子内容
     * 接收数据
     * Post_id：帖子的id
     *
     * 返回数据
     * Tittle：帖子的标题
     * Post_Content：帖子的内容
     * Time_Create：帖子发布的时间
     * Major：帖子所属的专业
     * Post_Nickname：发帖者的昵称
     * Comment_Exist：是否有评论（1-有/0-无）
     * Comment_Content：评论的内容
     * Comment_Nickname：评论者的昵称
     * Comment_Time：评论的时间
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void doLoadPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, JSONException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("开始加载帖子");

        //获取数据
        String Post_id = request.getParameter("Post_id");

        System.out.println("获得的参数 Post_id = " + Post_id);

        //从数据库中查询数据
        String[] A = new String[5];
        String[] B = new String[5];

        DBControl dbcontrol = new DBControl();
        A = dbcontrol.GetPost(Post_id);
        B = dbcontrol.GetComment(Post_id);

        System.out.println("已经从数据库获取数据：");
        System.out.println("Tittle：" + A[0]);
        System.out.println("Content：" + A[1]);
        System.out.println("发帖者的User_id：" + A[2]);
        System.out.println("Post_Nickname：" + A[3]);
        System.out.println("Time_create：" + A[4]);
        System.out.println("是否存在评论（1-有/0-无）：" + A[5]);
        if(B[0].equals("1")) {
            System.out.println("Comment_Time：" + B[2]);
            System.out.println("Comment_Content：" + B[3]);
            System.out.println("Comment_Nickname：" + B[4]);
        }

        //录入数据到json
        JSONObject json = new JSONObject();
        json.put("Tittle", A[0]);
        json.put("Content", A[1]);
        json.put("User_id", A[2]);
        json.put("Post_Nickname", A[3]);
        json.put("Time_create", A[4]);
        json.put("Comment_Exist", B[0]);
        if(B[0].equals("1")) {
            json.put("Comment_Time", B[2]);
            json.put("Comment_Content", B[3]);
            json.put("Comment_Nickname", B[4]);
        }

        //录入数据库
        if(dbcontrol.DB_Signin(A)) {
            json.put("Result","0");
            System.out.println("注册成功");
        }
        else {
            json.put("Result","1");
            System.out.println("注册失败");
        }

        //返回数据
        try {
            response.getWriter().print(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("已经返回结果给页面");
    }

    /**
     * 7、WritePost：写帖子
     * 接收
     * Tittle：帖子的标题
     * Content：帖子的内容
     * Major：帖子的专业
     * User_id：发帖者的id
     *
     * 返回
     * Result：结果，为0则成功
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void doWritePost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, JSONException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("开始发帖");

        //获取数据
        String Tittle = request.getParameter("Tittle");
        String Content = request.getParameter("Content");
        String Major = request.getParameter("Major");
        String User_id = request.getParameter("User_id");

        System.out.println("获得的参数 Tittle = " + Tittle);
        System.out.println("获得的参数 Content = " + Content);
        System.out.println("获得的参数 Major = " + Major);
        System.out.println("获得的参数 User_id = " + User_id);

        //处理数据
        String[] A = new String[4];
        A[0] = User_id;
        A[1] = Tittle;
        A[2] = Content;
        A[3] = Major;

        JSONObject json = new JSONObject();

        DBControl dbcontrol = new DBControl();

        //导入数据库
        if(dbcontrol.DB_WritePost(A)) {
            System.out.println("录入数据库成功");
            json.put("Result","0");
        }
        else {
            System.out.println("录入数据库失败");
            json.put("Result","1");
        }

        //返回数据
        try {
            response.getWriter().print(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("已经返回结果给页面");
    }

    /**
     * 8、WriteComment：写评论
     * 接收数据
     * Post_id：帖子的id
     * Content：评论的内容
     * User_id：评论者的id
     *
     * 返回
     * Result：结果，为0则成功
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void doWriteComment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, JSONException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        System.out.println("开始写评论");

        //获取数据
        String Post_id = request.getParameter("Post_id");
        String Content = request.getParameter("Content");
        String User_id = request.getParameter("User_id");

        System.out.println("获得的参数 Post_id = " + Post_id);
        System.out.println("获得的参数 Content = " + Content);
        System.out.println("获得的参数 User_id = " + User_id);

        //处理数据
        //发布评论
        //导入用户的User_id、帖子的Post_id、评论的Content。数组[3]
        //导出发布结果
        //Boolean DB_WriteComment(String[] Data_Comment);
        String[] A = new String[3];
        A[0] = User_id;
        A[1] = Post_id;
        A[2] = Content;

        JSONObject json = new JSONObject();

        DBControl dbcontrol = new DBControl();

        //导入数据库
        if(dbcontrol.DB_WriteComment(A)) {
            System.out.println("录入数据库成功");
            json.put("Result","0");
        }
        else {
            System.out.println("录入数据库失败");
            json.put("Result","1");
        }

        //返回数据
        try {
            response.getWriter().print(json);
            response.getWriter().flush();
            response.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("已经返回结果给页面");
    }
}
