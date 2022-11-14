/*
 * Colson Carey
 */
import java.util.ArrayList;

public class UserTesting {
    public static User user;
    public static void main(String[] args) {
        testUserIncorrectLogin();
    }
    public static void testUserIncorrectLogin(){
        user = new User("bobber", "berger132");
        user = user.login();
        user.access();
    }
}
