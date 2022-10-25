
import java.util.ArrayList;

public class ChildCollection extends Child{
    public ChildCollection(String childFirstname, String childLastname, String childDOB, String restriction,
            String EmergencyContact, String EmergencyContactNumber, String  Pediatrician, String PediatricanNumber) {
        super(childFirstname, childLastname, childDOB, restriction, EmergencyContact,EmergencyContactNumber, Pediatrician, PediatricanNumber);
        //TODO Auto-generated constructor stub
    }

    private  ArrayList<Child> children;
    private Child child;


    public void addChild(String childFirstName, String childLastName, String childDOB, String EmergencyContact, String Pediatrician, String restriction){
        /*this.childFirstname =  childFirstName;
        this.childLastname = childLastName;
        this.childDOB = childDOB;
        this.EmergencyContact = EmergencyContact;
        this.EmergencyContactNumber = EmergencyContactNumber;
        this.Pediatrician = Pediatrician;
        this.PediatricianNumber= PediatricianNumber;
        this.restriction = restriction; */
        children.add(child);
        

     }

    
}
