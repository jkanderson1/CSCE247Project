import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
public class User {
    private String username;
    private String password;
    public Scanner keyboard = new Scanner(System.in);

    public User(){
        this.username = null;
        this.password = null;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
    }
    private boolean login(){
        System.out.println("Input username");
        this.username = keyboard.nextLine();
        System.out.println("Input password");
        this.password = keyboard.nextLine();
        ArrayList<Parent> parents = DataReader.getAllParents();
        ArrayList<Director> directors = DataReader.getAllDirectors();
        ArrayList<Counselor> counselors = DataReader.getAllCounselors();
        for (int i = 0; i > parents.size();i++) {
            if (this.username.equals(parents.get(i).getUsername())){
                System.out.println("Attemping parent login... \n  Input Password");    
                if (this.password.equals(parents.get(i).getPassword())){
                    System.out.println("Successful Login! Welcome "+this.username);
                    return true;
                }
                System.out.println("Incorrect Password");
                return false;
            }
            if (this.username.equals(directors.get(i).getUsername())){
                System.out.println("Attemping director login... \n  Input Password");    
                if (this.password.equals(directors.get(i).getPassword())){
                    System.out.println("Successful Login! Welcome "+this.username);
                    return true;
                }
                System.out.println("Incorrect Password");
                return false;
            }
            if (this.username.equals(counselors.get(i).getUsername())){
                System.out.println("Attemping counselor login... \n  Input Password");    
                if (this.password.equals(counselors.get(i).getUsername())){
                    System.out.println("Successful Login! Welcome "+this.username);
                    return true;
                }
                System.out.println("Incorrect Password");
                return false;
            }
            else{
                System.out.println("Incorrect Username! Try again?");
                return false;
            }
        }
    }
}
