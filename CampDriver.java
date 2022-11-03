import java.util.ArrayList;
import java.util.Scanner;

public class CampDriver{
    CabinCollection cabins;
    static CounselorCollection counselors;
    static ArrayList<Director> director;
    static ChildCollection children;
    static ArrayList<Parent> parents;
    private static Facade facade = new Facade();
    private static  User user = new User(null, null);
    static User ourUser;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // cabins = DataReader.getAllCabins();
        while (true){
        System.out.println("Welcome to summer Camp ");
        System.out.println("Where its summer every day");
        System.out.println("***** main menu *****");
        System.out.println("1. learn more about camp");
        System.out.println("2.new user ");
        System.out.println("3.returning user");
        System.out.println("4. exit ");
        int option = keyboard.nextInt();
        if (option==1){
            System.out.println(facade.campinfo());
            System.out.println("Are you a returning user or new user\n 1:returning user 2: new user ");
            int option1 = keyboard.nextInt();
            if (option1==1){
                ourUser = user.login();
                user.access();
            }
            else if(option1 ==2){
                facade.signUp();
            }
            
        }
        else if (option == 2){
            user = facade.signUp();
        }
        else if (option ==3){
            user = facade.login();
            user.access();

        }
        else if (option==4){
            System.out.println("GoodBye, have a sunny day!");
            break;
        }

        }


        counselors = new CounselorCollection(DataReader.getAllCounselors());
        director = DataReader.getAllDirectors();
        children = new ChildCollection(DataReader.getAllChildren());
        parents = DataReader.getAllParents();
        children.getChildren();
        System.out.println("===============================================");
        counselors.getCounselorbyUUID();
    }
}
