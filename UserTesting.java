/*
 * Colson Carey
 */
import java.util.ArrayList;

public class UserTesting {
    public static User user;
    public static void main(String[] args) {
        user = new User("bobber", "berger132");
        System.out.println(user.toString());
        user = user.login();
        user.access();

    }
}
