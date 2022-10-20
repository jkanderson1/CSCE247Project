import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import javax.lang.model.util.ElementScanner14;
public class User {
    private String username;
    private String password;
    private Schedule schedule;
    public Scanner keyboard = new Scanner(System.in);

    public User(){
        this.username = null;
        this.password = null;
        this.schedule = new Schedule();
    }
    private String getUsername(){
        return this.username;
    }
    private String getPassword(){
        return this.password;
    }
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
    }
    //Should allow logins once the .equals method is changed
    private boolean login(){
        System.out.println("Input username");
        this.username = keyboard.nextLine();
        System.out.println("Input password");
        this.password = keyboard.nextLine();
        ArrayList<Parent> parents = DataReader.getAllParents();
        ArrayList<Director> directors = DataReader.getAllDirectors();
        ArrayList<Counselor> counselors = DataReader.getAllCounselors();
        for (int i = 0; i > parents.size();i++) {
            if (this.username.equals(parents.get(i))){
                if (this.password.equals(parents.get(i))){
                    System.out.println("Successful Login! Welcome "+this.username);
                    return true;
                }
                System.out.println("Incorrect Password");
                return false;
            }
            if (this.username.equals(/*The DataReader method for director users*/)){
                if (this.password.equals(/*The DataReader method for parent passwords*/)){
                    System.out.println("Successful Login! Welcome "+this.username);
                    return true;
                }
                System.out.println("Incorrect Password");
                return false;
            }
            if (this.username.equals(/*The DataReader method for counselor users*/)){
                if (this.password.equals(/*The DataReader method for parent passwords*/)){
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
