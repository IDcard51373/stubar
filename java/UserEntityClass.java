//用户的实体类

public class UserEntityClass {
    private String User_id;
    private String User_name;
    private String Password;
    private String Nickname;
    private String Gender;
    private String Major;
    private String Birthday;

    public void setUser_id(String a) {
        User_id = a;
    }

    public String getUser_id() {
        return User_id;
    }

    public void setUser_name(String a) {
        User_name = a;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setPassword(String a) {
        Password = a;
    }

    public String getPassword() {
        return Password;
    }

    public void setNickname(String a) {
        Nickname = a;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setGender(String a) {
        Gender = a;
    }

    public String getGender() {
        return Gender;
    }

    public void setMajor(String a) {
        Major = a;
    }

    public String getMajor() {
        return Major;
    }

    public void setBirthday(String a) {
        Birthday = a;
    }

    public String getBirthday() {
        return Birthday;
    }
}
