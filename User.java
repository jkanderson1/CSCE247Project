import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
public class User {
    public String username;
    public String password;
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
    public String toString(){
        return this.username+" "+this.password+" ";
    }
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());
    }
    public static User login(){
        System.out.println("Input username");
        String username1 = keyboard.nextLine();
        System.out.println("Input password");
        String password1 = keyboard.nextLine();
        User retUser = new User(username1, password1);
        ArrayList<Parent> parents = DataReader.getAllParents();
        ArrayList<Director> directors = DataReader.getAllDirectors();
        ArrayList<Cabin> counselors = DataReader.getAllCabins();
        System.out.println(retUser.toString()+parents.get(0).toString()+directors.get(0)+counselors.get(0));
        while(true){
            for(int i = 0;i<parents.size();i++) {   
                if (parents.get(i).getUsername().equals(username1)){        
                    System.out.println("Attemping parent login...");    
                    for(int j = 0;j<parents.size();i++) {
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
            System.out.println(directors.get(0).toString());    
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
