/**
 * 接口 服务器-数据库
 */
public interface DBControlInterface {

    //注册功能。
    //导入用户的用户名、密码、昵称、性别（男/女）、专业、生日。
    //导出结果。
    //List内：String User_name, String Password, String Nickname, String Gender, String Major, String Birthday
    Boolean DB_Signin(String[] Data_Signin);

    //登陆功能。
    //导入用户的用户名、密码。
    //导出用户的User_id。若登陆失败，返回0。
    String DB_Login(String[] Data_Login);

    //加载主页面。
    //导出所有帖子中最新刷新的10个帖子的Post_id、Title和Content的前50个字符，存在一个10*2的数组中。
    String[][] DB_GetMainPage();

    //加载某板块页面。
    //导入专业板块的名称。
    //导出该板块最近刷新的10个帖子的Post_id、Title和Content的前50个字符，存在一个10*2的数组中。
    String[][] DB_GetClassPage();

    //加载某帖子。
    //导入该帖子的Post_id。
    //导出该帖子的Tittle、内容Content、发布者的User_id、发布者的User_name、发布时间Time_create。
    String[] DB_GetPost(String Post_id);

    //加载某帖子的评论。
    //导入该帖子的Post_id。
    //导出评论的数量，按照最近->最早发布时间的顺序返回（最多10条）评论的Comment_id，Time，Content，评论发布者的User_id，User_name。
    String[][] DB_GetComment(String Post_id);

    //加载用户个人信息
    //导入用户的User_id
    //导出用户的User_name、Nickname、Gender、Major、Birthday、发布的帖子的总数
    String[] DB_GetUserInfo(String User_id);

    //发布帖子
    //导入用户的User_id、帖子的Tittle、Content、Time_create。
    //导出发布结果
    Boolean DB_WritePost(String[] Data_Post);

    //发布评论
    //导入用户的User_id、帖子的Post_id、评论的Content、Time。
    //导出发布结果
    Boolean DB_WriteComment(String[] Data_Comment);
}