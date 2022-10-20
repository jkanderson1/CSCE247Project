
import java.util.ArrayList;
public class Child {
    public String childFirstname;
    public String childLastname;
    public String childDOB;
    public Contact EmergencyContact;
    public Contact Pediatrician;
    public ArrayList<Restriction> restriction;
    //might remove restrictions;

    public Child(String childFirstname, String childLastname, String childDOB, ArrayList<Restriction> restriction, Contact EmergencyContact, Contact Pediatrician){
        this.childFirstname = childFirstname;
        this.childLastname = childLastname;
        this.childDOB = childDOB;
        this.restriction = restriction;
        this.EmergencyContact = EmergencyContact;
        this.Pediatrician = Pediatrician;
    }

    public void addChild(String childFirstName, String childLastName, String childDOB, Contact EmergencyContact, Contact Pediatrician, ArrayList<Restriction> restriction){
        this.childFirstname =  childFirstName;
        this.childLastname = childLastName;
        this.childDOB = childDOB;
        this.EmergencyContact = EmergencyContact;
        this.Pediatrician = Pediatrician;
        this.restriction = restriction;
     }

    public String toString(){
        return childFirstname+ childLastname+ childDOB+ restriction+ EmergencyContact+ Pediatrician;
    }

    public boolean hasRestriction(Restriction restriction){
        return restriction!= null;
    }


}
