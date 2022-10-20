
import java.util.ArrayList;

public class ChildCollection extends Child{
    public ChildCollection(String childFirstname, String childLastname, String childDOB, Restriction restriction,
            Contact EmergencyContact, Contact Pediatrician) {
        super(childFirstname, childLastname, childDOB, restriction, EmergencyContact, Pediatrician);
        //TODO Auto-generated constructor stub
    }

    private  String cabinName;
    private  ArrayList<Child> children;

    private ArrayList<Child> childList(){
        return children;

    }

    
}
