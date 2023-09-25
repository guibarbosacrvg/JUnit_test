package model;

public class UserDAO {
    public static User recuperarUsuario(String login, String pwsd){
        User user = null;
        user = new User(login,pwsd);
        return user;
    }
    public static boolean save(User user){
        if(user == null){
            return false;
        }
        return true;
    }
}
