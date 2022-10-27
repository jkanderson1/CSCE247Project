import java.util.ArrayList;
import java.util.Scanner;

public class CampDriver{
    CabinCollection cabins;
    static CounselorCollection counselors;
    static ArrayList<Director> director;
    static ChildCollection children;
    static ArrayList<Parent> parents;
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
        int option = keyboard.nextInt();
        if (option==1){
            System.out.println("******Camp Infromation*****");
            System.out.println("Our camp is located in sunny South Carolina");
            System.out.println("Our camp runs from August to July");
            System.out.println("Have 8 camp sessions each with different Themes");
            System.out.println("Session 1: Hawaiin\nSession 2: Rockstars\nSession 3: Ninja Warriors\nSession 4: Willy Wonka\nSession 5: Hollywood\nSession 6: Legos\nSession 7: Cops and Robbers\nSession 8: Shark Tank\nSession 9: Smores");
            System.out.println("");
        }


        counselors = new CounselorCollection(DataReader.getAllCounselors());
        director = DataReader.getAllDirectors();
        children = new ChildCollection(DataReader.getAllChildren());
        parents = DataReader.getAllParents();
        children.getChildren();
        System.out.println("===============================================");
        counselors.getCounselors();
        }
    }
}