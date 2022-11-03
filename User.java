import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
/**
 * User class that stores the properties for each user 
 */
public class User {
    public String username;
    public String password;
    public static Scanner keyboard = new Scanner(System.in);
/**
 * Creating a user with the following parameters
 * @param username users username
 * @param password users password
 */
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    /**
     * get username method that returns the users username
     * @return the users username
     */
    public String getUsername(){
        return this.username;
    }
    /**
     * ger users password that returns the users password
     * @return the password for the specific user
     */
    public String getPassword(){
        return this.password;
    }
    /**
     * to string that returns the specific defining strings for the user
     */
    public String toString(){
        return this.username+" "+this.password+" ";
    }
    public void access(){}
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
    }
    /**
     * login method that prompts the user to input their username and password and then allows them to log in 
     * using those specific user properties. If there is no user with that user name and password, a string 
     * is displayed to show the user that their input is incorrect
     * @return the user with those properties if there is a user with those properties
     */
    public static User login(){
        ArrayList<Parent> parents = DataReader.getAllParents();
        ArrayList<Director> directors = DataReader.getAllDirectors();
        ArrayList<Cabin> counselors = DataReader.getAllCabins();
        while(true){
            System.out.println("Input username");
            String username1 = keyboard.nextLine();
            keyboard.nextLine();
            System.out.println("Input password");
            String password1 = keyboard.nextLine();
            keyboard.nextLine();
            User retUser = new User(username1, password1);
            for(int i = 0;i<parents.size();i++) {   
                if (parents.get(i).getUsername().equals(username1)){        
                    System.out.println("Attemping parent login...");    
                    for(int j = 0;j<parents.size();j++) {
                        if (parents.get(j).getPassword().equals(password1)){
                            System.out.println("Successful Login! Welcome "+username1);
                            retUser = parents.get(j);
                            return retUser;
                        }
                    }
                    System.out.println("Incorrect Password");
                    return null;
                }
            }
            if (directors.get(0).getUsername().equals(username1)){
                System.out.println("Attemping director login..."); 
                if (directors.get(0).getPassword().equals(password1)){
                    System.out.println("Successful Login! Welcome "+username1);
                    retUser = directors.get(0);
                    return retUser;
                }
                System.out.println("Incorrect Password");
                return null;
            }
            for(int i = 0;i<counselors.size();i++){ 
                System.out.println(counselors.get(i).getUsername());           
                if (counselors.get(i).getUsername().equals(username1)){
                    System.out.println("Attemping counselor login...");
                    for(int j = 0;j<counselors.size();j++)    
                        if (counselors.get(j).getPassword().equals(password1)){
                            System.out.println("Successful Login! Welcome "+username1);
                            retUser = counselors.get(j);
                            return retUser;
                        }
                    System.out.println("Incorrect Password");
                    return null;
                }
            }
            System.out.println("Incorrect Username! Press 0 to try again");
            if (keyboard.nextLine().equals("0"))
                continue;
            return null;
        }
    } 
}
