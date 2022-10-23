
import java.util.ArrayList;
public class Child extends Parent{
    public String childFirstname;
    public String childLastname;
    public String childDOB;
    public String EmergencyContact;
    public String EmergencyContactNumber;
    public String Pediatrician;
    public String PediatricianNumber;
    public Restriction[]restriction;
    //might remove restrictions;

    public Child(String childFirstname, String childLastname, String childDOB, Restriction[] restriction, String EmergencyContact, String EmergencyContactNumber, String Pediatrician,String PediatricianNumber){
        this.childFirstname = childFirstname;
        this.childLastname = childLastname;
        this.childDOB = childDOB;
        this.restriction = restriction;
        this.EmergencyContact = EmergencyContact;
        this.EmergencyContactNumber = EmergencyContactNumber;
        this.Pediatrician = Pediatrician;
        this.PediatricianNumber= PediatricianNumber;
    }


    public String toString(){
        return childFirstname+ childLastname+ childDOB+ restriction+ EmergencyContact+ EmergencyContactNumber+ Pediatrician+PediatricianNumber;
    }

    public boolean hasRestriction(Restriction restriction){
        return restriction!= null;
    }


}
