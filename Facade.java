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
public Facade(User user, ChildCollection kids, CounselorCollection counselorcollection, Director director){
this.user = user;
this.kids= kids;
this.director=director;
this.counselorcollection = counselorcollection;
}

public User login(String username,String password){
    while (true){
    if (user.login() ==false)
    {
        return null;
    }
        return user;
    }
}
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
        parent.addParent(firstName, lastName, email, number,address);
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
            Contact[] EmergencyContact = new Contact(efirstname, elastname, eNumber, eAddress);
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
        counselorcollection.AddCounselor(firstName, lastName,couselorDOB, address,EmergencyContact, restriction);
    }
    return user;

}
public void getScheduleByName(String Name){

}

public void getAllSchedules(){
    return;
    //director.
    
}
public void getchildCollection(){
    //return null;
    kids.getChildren();
    
}
public void getConselorcollection(){
    //return null;
    counselorcollection.getCounselors();
    
}
}
