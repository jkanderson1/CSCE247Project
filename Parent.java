import java.util.ArrayList;
public class Parent extends User{
   public String firstName;
   public String lastName;
   public String email;
   public String number;
   public String address;
   // private ArrayList<Parent> parents ;
   // private Parent Parent;
   
   public Parent(String username, String password, String firstName, String lastName, String email, String number, String address)
   {
      super(username, password);
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.number = number; 
      this.address = address; 
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
