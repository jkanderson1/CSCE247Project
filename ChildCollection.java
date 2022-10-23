
import java.util.ArrayList;

public class ChildCollection extends Child{
    public ChildCollection(String childFirstname, String childLastname, String childDOB, ArrayList<Restriction> restriction,
            String EmergencyContact, String EmergencyContactNumber, String  Pediatrician, String PediatricanNumber) {
        super(childFirstname, childLastname, childDOB, restriction, EmergencyContact,EmergencyContactNumber, Pediatrician,PediatricianNumber);
        //TODO Auto-generated constructor stub
    }

    private  String cabinName;
    private  ArrayList<Child> children;

    private ArrayList<Child> childList(){

        return children;

    }

    public void addChild(String childFirstName, String childLastName, String childDOB, String EmergencyContact, String Pediatrician, ArrayList<Restriction> restriction){
        this.childFirstname =  childFirstName;
        this.childLastname = childLastName;
        this.childDOB = childDOB;
        this.EmergencyContact = EmergencyContact;
        this.EmergencyContactNumber = EmergencyContactNumber;
        this.Pediatrician = Pediatrician;
        this.PediatricianNumber= PediatricianNumber;
        this.restriction = restriction;
        

     }

    
}
