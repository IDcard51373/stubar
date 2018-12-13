

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.math.*;



public class DBControl {
    String url="jdbc:mysql://39.105.70.32:3306/stubar";


    //注册功能。
    //导入用户的用户名、密码、昵称、性别（男/女）、专业、生日。数组[6]
    //导出结果。
    //数组内：String User_name, String Password, String Nickname, String Gender, String Major, String Birthday
    public Boolean DB_Signin(String[] Data_Signin)
    {
//       String user_name=Data_Signin[0];
//       String password=Data_Signin[1];
//       String nickname=Data_Signin[2];
//       String gender=Data_Signin[3];
//       String major=Data_Signin[4];
//       String birthday=Data_Signin[5];
//      以下部分连接数据库然后向数据库写入数据。
        try{
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);  //加载驱动

            String url="jdbc:mysql://39.105.70.32:3306/stubar";
            Connection con=DriverManager.getConnection(url,"stubar","123456");
            Statement stmt=con.createStatement();

            System.out.println("数据库连接成功!");
            String sql="INSERT INTO user(user_name,passeword,nickname,gender,major,birthday) VALUES (?,?,?,?,?,?)";
            PreparedStatement pre = (PreparedStatement) con.prepareStatement(sql);
            pre.setString(1, Data_Signin[0]);
            pre.setString(2, Data_Signin[1]);
            pre.setString(3, Data_Signin[2]);
            pre.setString(4, Data_Signin[3]);
            pre.setString(5, Data_Signin[4]);
            pre.setString(6, Data_Signin[5]);
            System.out.println("构造的sql语句是:"+sql);
            int count = pre.executeUpdate();

            System.out.println(count+"条数据发生了变化");
            pre.close();
            con.close();
            System.out.println("数据库关闭!!");
//
        }catch (SQLException sqlexception){
            sqlexception.printStackTrace();
        }
        catch(Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        }

        return true;
    }


    //登陆功能。
    //导入用户的用户名、密码。数组[2]
    //导出用户的User_id。若登陆失败，返回0。
    public String DB_Login(String[] Data_Login){
        //Data_Login[0]-->用户名
        //Data_Login[1]-->密码
        int flag=0;//0:未查询到结果，用户名不存在；1：密码错误；2：登陆成功
        String userid=null;

        try{
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);  //加载驱动

            String url="jdbc:mysql://39.105.70.32:3306/stubar";
            Connection con=DriverManager.getConnection(url,"stubar","123456");

            System.out.println("数据库连接成功!");

            String sql="select passeword,user_id from user where user_name=?";
            PreparedStatement pre = (PreparedStatement) con.prepareStatement(sql);
            pre.setString(1, Data_Login[0]);

            System.out.println("构造的sql语句是:"+sql);

            ResultSet rs = pre.executeQuery();
            if(rs.next()){//查询到密码
//               s1.equals(s2)
                if(Data_Login[1].equals(rs.getString(1))){//密码正确，进行后续操作
                    userid=String.valueOf(rs.getString(2));
                }
                else{//密码错误
                    userid="0";
                }
            }

            pre.close();
            con.close();
            System.out.println("数据库关闭!!");
//
        }catch (SQLException sqlexception){
            sqlexception.printStackTrace();
        }
        catch(Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        }

        return userid;//null-->用户名不存在；0-->密码错误；userid
    }

    //加载主页面。
    //导出所有帖子中最新刷新的5个帖子的Post_id、Title和Content的前50个字符。数组[5][3]
    public String[][] DB_GetMainPage(){
        String result[][]=new String[5][3];
        try{
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);  //加载驱动

            String url="jdbc:mysql://39.105.70.32:3306/stubar";
            Connection con=DriverManager.getConnection(url,"stubar","123456");

            System.out.println("数据库连接成功!");

            String sql="select post_id,tittle,content from post order by time_edit desc limit 5";
            PreparedStatement pre = (PreparedStatement) con.prepareStatement(sql);

            System.out.println("构造的sql语句是:"+sql);

            ResultSet rs = pre.executeQuery();
            for (int j = 0; rs.next(); j++) {
                result[j][0]= rs.getString(1);
                result[j][1]= rs.getString(2);
                result[j][2]= rs.getString(3);
            }
            pre.close();
            con.close();
            System.out.println("数据库关闭!!");

        }catch (SQLException sqlexception){
            sqlexception.printStackTrace();
        }
        catch(Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        }

        return result;
    }


    //加载某板块页面。
    //导入专业板块的名称。
    //导出该板块最近刷新的5个帖子的Post_id、Title和Content的前50个字符。数组[5][3]
    public  String[][] DB_GetClassPage(){
        return new String[0][];
    }

    //加载某帖子。
    //导入该帖子的Post_id。
    //导出该帖子的Tittle、内容Content、发布者的User_id、发布者的Nickname、发布时间Time_create。数组[5]
    public String[] DB_GetPost(String Post_id){
        return new String[0];
    }

    //加载某帖子的评论。
    //导入该帖子的Post_id。
    //导出是否有评论（1-有/0-无），一条最新（不最新也行）评论的Comment_id，Time，Content，评论发布者的Nickname。数组[5]
    public String[] DB_GetComment(String Post_id){
        return new String[0];
    }

    //加载用户个人信息
    //导入用户的User_id
    //导出用户的User_name、Nickname、Gender、Major、Birthday、发布的帖子的总数。数组[6]
    public String[] DB_GetUserInfo(String User_id){
        return new String[0];
    }

    //发布帖子
    //导入用户的User_id、帖子的Tittle、Content、Major。数组[4]
    //导出发布结果
    public Boolean DB_WritePost(String[] Data_Post){
        return null;
    }

    //发布评论
    //导入用户的User_id、帖子的Post_id、评论的Content。数组[3]
    //导出发布结果
    public Boolean DB_WriteComment(String[] Data_Comment){
        return null;
    }

}


