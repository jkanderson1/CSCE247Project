
import java.util.ArrayList;

public class ChildCollection extends Child{
    public ChildCollection(String childFirstname, String childLastname, String childDOB, ArrayList<Restriction> restriction,
            Contact EmergencyContact, Contact Pediatrician) {
        super(childFirstname, childLastname, childDOB, restriction, EmergencyContact, Pediatrician);
        //TODO Auto-generated constructor stub
    }

    private  String cabinName;
    private  ArrayList<Child> children;

    private ArrayList<Child> childList(){

        return children;

    }

    public void addChild(String childFirstName, String childLastName, String childDOB, Contact EmergencyContact, Contact Pediatrician, ArrayList<Restriction> restriction){
        this.childFirstname =  childFirstName;
        this.childLastname = childLastName;
        this.childDOB = childDOB;
        this.EmergencyContact = EmergencyContact;
        this.Pediatrician = Pediatrician;
        this.restriction = restriction;
     }

    
}
