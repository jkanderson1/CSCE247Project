import java.util.ArrayList;
import java.util.UUID;
public class Parent extends User{
   public String firstName;
   public String lastName;
   public String email;
   public String number;
   public String address;
   public ArrayList<Child> children;
   public UUID parentID;
   
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
   
public String toString(){
   return firstName+" "+lastName+email+number+address;
}

private  ArrayList<Parent> parent;
private Parent parents;
 public ArrayList<Parent> addParent(String firstName, String lastName, String email, String number, String address){
   parent.add(parents);
   return parent;
}

public String getfirstname(){
   return this.firstName;
}
public String getlastname(){
        return this.lastName;
}

public String getemail()
{
        return this.email;
}
public String getphonenumber()
    {
        return this.number;
    }

    public String getaddress()
    {
        return this.address;
    }

   

}
