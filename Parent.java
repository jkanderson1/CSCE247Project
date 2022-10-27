import java.util.ArrayList;
import java.util.UUID;
public class Parent extends User{
   public String firstName;
   public String lastName;
   public String email;
   public String number;
   public String address;
   public ArrayList<String> children;
   public UUID parentID;
   // private ArrayList<Parent> parents ;
   // private Parent Parent;
   
   public Parent(String username, String password, String firstName, String lastName, String email, String number, String address, ArrayList<String> children)
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
   
public String toString(){
   return firstName+" "+lastName;
}

/**
 * public void addParent(String firstName, String lastName, String email, String number, String address){
   parents.add(Parent);
}
*/


}
