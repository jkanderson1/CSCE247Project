import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
public class User {
    public static String username;
    public static String password;
    public static Scanner keyboard = new Scanner(System.in);

    public User(String username, String password){
        this.username = username;
        this.password = password;
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
    public static User login(){
        System.out.println("Input username");
        username = keyboard.nextLine();
        System.out.println("Input password");
        password = keyboard.nextLine();
        User retUser = new User(username, password);
        ArrayList<Parent> parents = DataReader.getAllParents();
        ArrayList<Director> directors = DataReader.getAllDirectors();
        ArrayList<Counselor> counselors = DataReader.getAllCounselors();
        while(true){
            for(int i = 0;i<parents.size();i++) {   
                if (parents.get(i).getUsername().equals(username)){        
                    System.out.println("Attemping parent login... \n  Input Password");    
                    for(int j = 0;j<parents.size();i++) {
                        if (parents.get(i).getPassword().equals(password)){
                            System.out.println("Successful Login! Welcome "+username);
                            return retUser;
                        }
                    }
                    System.out.println("Incorrect Password");
                    return null;
                }
            }
            for(int i = 0;i<directors.size();i++){    
                if (directors.get(i).getUsername().equals(username)){
                    System.out.println("Attemping director login... \n  Input Password");
                    for(int j = 0;j<directors.size();i++){    
                        if (directors.get(i).getPassword().equals(password)){
                            System.out.println("Successful Login! Welcome "+username);
                            return retUser;
                        }
                    }
                    System.out.println("Incorrect Password");
                    return null;
                }
            }
            for(int i = 0;i<counselors.size();i++){            
                if (counselors.get(i).getUsername().equals(username)){
                    System.out.println("Attemping counselor login... \n  Input Password");
                    for(int j = 0;j<counselors.size();j++)    
                        if (counselors.get(j).getPassword().equals(password)){
                            System.out.println("Successful Login! Welcome "+username);
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
