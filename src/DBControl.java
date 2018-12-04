import org.json.JSONException;
import org.json.JSONObject;


import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class DBControl {
    String url="jdbc:mysql://39.105.70.32:3306/stubar";
    String User_name;
    String Password;
    String Nickname;
    String Gender;
    String Major;
    String Birthday;


//    Connection con=DriverManager.getConnection(url,"stubar","123456");
//    Statement stmt=con.createStatement();
//	        System.out.println("数据库连接成功!");
//    String sql="select * from team_work where hobby like '%"+Hobby+"%'";
//
//	        System.out.println("构造的sql语句是:"+sql);
//    ResultSet rs=stmt.executeQuery(sql);
//	        while(rs.next()){
//        Map map=new HashMap();
//        map.put("student_id",rs.getString("student_id"));
//        map.put("student_name",rs.getString("student_name"));
//        map.put("hobby",rs.getString("hobby"));
//        jsonList.add(map);
//    }
//	        stmt.close();
//	        con.close();
//	        System.out.println("数据库关闭!!");

   //注册功能。
   //导入用户的用户名、密码、昵称、性别（男/女）、专业、生日。数组[6]
   //导出结果。
   //数组内：String User_name, String Password, String Nickname, String Gender, String Major, String Birthday
   public Boolean DB_Signin(String[] Data_Signin)
   {
       String User_name=Data_Signin[0];
       String Password=Data_Signin[1];
       String Nickname=Data_Signin[2];
       String Gender=Data_Signin[3];
       String Major=Data_Signin[4];
       String Birthday=Data_Signin[5];
//      以下部分连接数据库然后向数据库写入数据。
//       try{
//           String url="jdbc:mysql://39.105.70.32:3306/stubar";
//           Connection con=DriverManager.getConnection(url,"stubar","123456");
//           Statement stmt=con.createStatement();
//           System.out.println("数据库连接成功!");
//           String sql="select * from team_work where hobby like '%"+Hobby+"%'";
//
//           System.out.println("构造的sql语句是:"+sql);
//           ResultSet rs=stmt.executeQuery(sql);
//           while(rs.next()){
//               Map map=new HashMap();
//               map.put("student_id",rs.getString("student_id"));
//               map.put("student_name",rs.getString("student_name"));
//               map.put("hobby",rs.getString("hobby"));
//               jsonList.add(map);
//           }
//           stmt.close();
//           con.close();
//           System.out.println("数据库关闭!!");
//
//       }catch (SQLException sqlexception){
//           sqlexception.printStackTrace();
//       }

      return true;
   }


   //登陆功能。
   //导入用户的用户名、密码。数组[2]
   //导出用户的User_id。若登陆失败，返回0。
   public String DB_Login(String[] Data_Login){
      return null;
   }

   //加载主页面。
   //导出所有帖子中最新刷新的5个帖子的Post_id、Title和Content的前50个字符。数组[5][3]
   public String[][] DB_GetMainPage(){
      return new String[0][];
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

    /*
     接口版本

     @Override
    static Boolean DB_Signin(String[] Data_Signin) {

        return null;
    }

    @Override
    static String DB_Login(String[] Data_Login) {

        return null;
    }

    @Override
    static Boolean DB_WriteComment(String[] Data_Comment) {
        return null;
    }

    @Override
    public Boolean DB_WritePost(String[] Data_Post) {
        return null;
    }

    @Override
    public String[] DB_GetComment(String Post_id) {
        return new String[0];
    }

    @Override
    public String[] DB_GetPost(String Post_id) {
        return new String[0];
    }

    @Override
    public String[] DB_GetUserInfo(String User_id) {
        return new String[0];
    }

    @Override
    public String[][] DB_GetClassPage() {

        return new String[0][];
    }

    @Override
    public String[][] DB_GetMainPage() {
        return new String[0][];
    }
*/


