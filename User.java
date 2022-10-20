import java.util.Scanner;
import java.util.UUID;
public class User {
    private String username;
    private String password;
    private Schedule schedule;
    public Scanner keyboard = new Scanner(System.in);

    public User(){
        System.out.println("Input username");
        this.username = keyboard.nextLine();
        System.out.println("Input password");
        this.password = keyboard.nextLine();
        this.schedule = new Schedule();
    }
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
    }
    //maybe set to void
    private boolean login(String username){
        return true;
    }

}
