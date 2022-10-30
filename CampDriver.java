import java.util.ArrayList;
import java.util.Scanner;

public class CampDriver{
    CabinCollection cabins;
    static CounselorCollection counselors;
    static ArrayList<Director> director;
    static ChildCollection children;
    static ArrayList<Parent> parents;
    private static Facade facade;
    private static User user;
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
            System.out.println("******Camp Infromation*****");
            System.out.println("Our camp is located in sunny South Carolina");
            System.out.println("Our camp runs from August to July");
            System.out.println("Have 8 camp sessions each with different Themes");
            System.out.println("Session 1: Hawaiin\nSession 2: Rockstars\nSession 3: Ninja Warriors\nSession 4: Willy Wonka\nSession 5: Hollywood\nSession 6: Legos\nSession 7: Cops and Robbers\nSession 8: Shark Tank\nSession 9: Smores");
            System.out.println("The activities avaible for your child are listed as the following");
            System.out.println("Teen Activities: ");
            System.out.println("Archery\nSwimming\nSoccer\nFootball \nBasketBall\nCooking\nMountainBiking\nPottery \nHorseRiding \nBungeeJumping\nZipLine\nObstacleCourse \nHiking \nWoodShop\nCanoeing ");
            System.out.println(" ");
            System.out.println("Child Activities");
            System.out.println("ArtsandCrafts\nKickBall\nFlagFootball\nScavengerHunt\nBikeRiding\nSandbox\nBirdWatching\nRoastingMarshmallows\nDanceParty\nCaptureTheFlag\nPettingZoo\nShowAndTell\nIceCreamParty\nLaserTag ");
            System.out.println(" ");
            System.out.println("Are you a returning user or new user\n 1:returning user 2: new user ");
            int option1 = keyboard.nextInt();
            if (option1==1){
                user.login();
            }
            else if(option1 ==2){
                facade.signUp();
            }
            
        }
        else if (option == 2){
            facade.signUp();
        }
        else if (option ==3){
            user.login();
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
        counselors.getCounselors();
        }
    }
}