import java.util.ArrayList;
import java.util.Scanner;

public class Facade {
    private User user;
    private ChildCollection kids;
    private CounselorCollection counselorcollection;
    private Director director;
    private Parent parent;
    public String Username;
    public String Password;
    public Scanner keyboard = new Scanner(System.in);
    private String usertype;

    public Facade(){
        
    }
/**
 * log in method that returns the results from the login method in the user
 * @return the results of the login method in the user class
 */
public User login(){
    return user.login();
}
/**
 * sign up method that prompts a new user to input their information and stores it in order to create a new user 
 * further allowing them to login with that information in the future
 * @return this user
 */
public User signUp(){
  
    System.out.println("Create your username");
    this.Username = keyboard.nextLine();
    System.out.println("Input password");
    this.Password = keyboard.nextLine();
    System.out.println("what type of user are you? Parent or Counselor");
    this.usertype = keyboard.nextLine();
    if (usertype.equalsIgnoreCase("Parent"))
    {
        System.out.println("what is your first Name");
        String firstName = keyboard.nextLine();
        System.out.println("what is your last name ");
        String lastName = keyboard.nextLine();
        System.out.println("what is your email");
        String email = keyboard.nextLine();
        System.out.println("what is your phone number ");
        String number= keyboard.nextLine();
        System.out.println("what is your address");
        String address = keyboard.nextLine();
        parent = new Parent(address, address, firstName, lastName, email, number, address, null);
        parent.addParent(Username, Password, firstName, lastName, email, number,address);
        System.out.println("How many children would you like to register?");
        int numOfKids =  keyboard.nextInt();
        for (int i= 0; i < numOfKids; i++){
            System.out.println("what is the child's first name ");
            String childFirstname = keyboard.nextLine();
            System.out.println("what is the child's last name ");
            String childLastname  = keyboard.nextLine();
            System.out.println("what is the child's date of birth ");
            String childDOB = keyboard.nextLine();
            System.out.println("Does the child have any dietary or physical restictions?");
            String restriction = keyboard.nextLine(); 
            System.out.println("what is the child's pediatricians information ");
            System.out.println("what is the pediatrician's first name");
            String firstname = keyboard.nextLine();
            System.out.println("what is the pediatrician's last name");
            String lastname = keyboard.nextLine();
            System.out.println("what is the pediatricians phone number");
            String Number = keyboard.nextLine();
            System.out.println("what is the pediatricians address");
            String Address = keyboard.nextLine();
            Contact Pediatrician = new Contact( firstname, lastname, Number, Address);
            System.out.println("what is the child's emergency contacts name information ");
            System.out.println("what is their first name");
            String efirstname = keyboard.nextLine();
            System.out.println("what is their last name");
            String elastname = keyboard.nextLine();
            System.out.println("what is their phone number");
            String eNumber = keyboard.nextLine();
            System.out.println("what is their address");
            String eAddress = keyboard.nextLine();
            Contact EmergencyContact = new Contact(efirstname, elastname, eNumber, eAddress);
            kids.addChild(childFirstname, childLastname, childDOB, EmergencyContact,Pediatrician, restriction);
            
        }
    }
    else  if (usertype.equalsIgnoreCase("counselor"))
    {
        System.out.println("what is your first Name");
        String firstName = keyboard.nextLine();
        System.out.println("what is your last name ");
        String lastName = keyboard.nextLine();
        System.out.println("what is your date of birth");
        String couselorDOB = keyboard.nextLine();
        System.out.println("what is your address");
        String address = keyboard.nextLine();
        System.out.println("Do you have any dietary or physical restictions?");
        String restriction = keyboard.nextLine(); 
        System.out.println("who is  your emergency contact's first name");
        String firstname = keyboard.nextLine();
        System.out.println("what is their last name");
        String lastname = keyboard.nextLine();
        System.out.println("what is their phone number");
        String Number = keyboard.nextLine();
        System.out.println("what is their address");
        String Address = keyboard.nextLine();
        Contact EmergencyContact= new Contact(firstname, lastname, Number, Address);
        counselorcollection = new CounselorCollection(null);
        counselorcollection.AddCounselor(firstName, lastName,couselorDOB, address,EmergencyContact, restriction);
    }
    return user;

}
/**
 * get schedule by name method that takes in a string and returns the schedule that matches that string
 * @param Name of the schedule that the user is searching for
 */
public void getScheduleByName(String Name){
return;
}
/**
 * get all schedules method that allows the director to view all of the schedules
 */
public void getAllSchedules(){
    return;
    //director.
    
}
/**
 * get child collection method that runs runs the get children method in child collection 
 */
public void getchildCollection(){
    //return null;
    kids.getChildren();
}
/**
 * get counselor collection method that runs the get counselor by UUID method from counselor collection
 */
public void getConselorcollection(){
    //return null;
    counselorcollection.getCounselorbyUUID();
    
}
/**
 * camp info method that prints out a string that displays all the camp information to the user in the terminal
 * @return string of camp information
 */
public String campinfo(){
    return ("******Camp Infromation*****"+
    "\nOur camp is located in sunny South Carolina"+
    "\nOur camp runs from August to July"+
    "\nHave 8 camp sessions each with different Themes"+
    "\nSession 1: Hawaiin\nSession 2: Rockstars\nSession 3: Ninja Warriors\nSession 4: Willy Wonka\nSession 5: Hollywood\nSession 6: Legos\nSession 7: Cops and Robbers\nSession 8: Shark Tank\nSession 9: Smores"+
    "\n The activities avaible for your child are listed as the following"+
    "\nTeen Activities: "+
    "\nArchery\nSwimming\nSoccer\nFootball \nBasketBall\nCooking\nMountainBiking\nPottery \nHorseRiding \nBungeeJumping\nZipLine\nObstacleCourse \nHiking \nWoodShop\nCanoeing\n"+
    "Child Activities: "+
    "\nArtsandCrafts\nKickBall\nFlagFootball\nScavengerHunt\nBikeRiding\nSandbox\nBirdWatching\nRoastingMarshmallows\nDanceParty\nCaptureTheFlag\nPettingZoo\nShowAndTell\nIceCreamParty\nLaserTag ");
}
}
