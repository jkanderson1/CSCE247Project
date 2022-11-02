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
   System.out.pritnln("Welcom parent, what would you like to do?\n 1.");
   
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
