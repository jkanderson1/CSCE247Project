import java.util.ArrayList;
import java.util.UUID;
/**
 * Parent class that extends the User class making it a type of user
 * stores all the properties of a parent
 */
public class Parent extends User{
   public String firstName;
   public String lastName;
   public String email;
   public String number;
   public String address;
   public ArrayList<Child> children;
   public UUID parentID;
   private  ArrayList<Parent> parent;
   private Parent parents;
   
   /**
    * creating a parent with the following parameters
    * @param username parents username
    * @param password parents password
    * @param firstName parents first name
    * @param lastName parents last name
    * @param email parents email
    * @param number parents phone number
    * @param address parents address
    * @param children parents children
    */
   public Parent(String username, String password, String firstName, String lastName, String email, String number, String address, ArrayList<Child> children)
   {
      super(username, password);
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.number = number; 
      this.address = address; 
      this.children = children;
      this.parentID = UUID.randomUUID();
      
   }
public void access(){
   while(true){
   System.out.println("Welcome "+firstName+", what would you like to do?\n"+
                     "0 to register a child\n"+
                     "1 to view registered children\n"+
                     "2 to view camp/session information\n"+
                     "3 to logout");
   int options = keyboard.nextInt();
   if(options ==0){
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
            children.add(new Child(childFirstname, childLastname, childDOB, restriction,EmergencyContact,Pediatrician));
            
        }
   }
   if(options==1){
      System.out.println(children.toString());
      for(int i = 0; i<children.size(); i++)
      {
         System.out.println(children.get(i).toString());
         System.out.println("what session would you like to sign your children up for\nSession 1: Hawaiin\nSession 2: Rockstars\nSession 3: Ninja Warriors\nSession 4: Willy Wonka\nSession 5: Hollywood\nSession 6: Legos\nSession 7: Cops and Robbers\nSession 8: Shark Tank\nSession 9: Smores");
         String sessionpicked = keyboard.nextLine();
         System.out.println("Okay your child/children are signed up for session"+sessionpicked);
      }

   }
   if(options==2){
      System.out.println("******Camp Infromation*****"+
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
   if(options==3){
      break;
   }
}
}
   

   /**
    * to string method that returns the difining strings for a parent
    */
public String toString(){
   return firstName+" "+lastName+email+number+address;
}
/**
 * add parent method that adds a parent to the arraylist of parents
 * @param firstName parents first name
 * @param lastName parents last name
 * @param email parents email
 * @param number parents number
 * @param address parents address
 * @return the parent that was added to the arrylist
 */
 public ArrayList<Parent> addParent(String firstName, String lastName, String email, String number, String address){
   parent.add(parents);
   return parent;
}
/**
 * get first name method that returns the parents first name
 * @return the parents first name
 */
public String getfirstname(){
   return this.firstName;
}
/**
 * get last name method that returns the parents last name
 * @return parents last name
 */
public String getlastname(){
        return this.lastName;
}

/**
 * get email method that returns the parents email
 * @return parents email
 */
public String getemail()
{
        return this.email;
}

/**
 * get phone number method that returns the parents phone number
 * @return parents phone number 
 */
public String getphonenumber()
    {
        return this.number;
    }
/**
 * get address method that returns the parents address
 * @return the parents address
 */
    public String getaddress()
    {
        return this.address;
    }

   

}
