
import java.util.ArrayList;
import java.util.UUID;
public class Child {
    public String childFirstname;
    public String childLastname;
    public String childDOB;
    public Contact Pediatrician;
    public Contact EmergencyContact;
    public String restriction;
    public UUID childID;

    //might remove restrictions;
    public Child(String childFirstname, String childLastname, String childDOB, String restriction, Contact EmergencyContact, Contact Pediatrician){
        this.childFirstname = childFirstname;
        this.childLastname = childLastname;
        this.childDOB = childDOB;
        this.restriction = restriction;
        this.Pediatrician = Pediatrician;
        this.EmergencyContact = EmergencyContact;
        this.childID = setUUID();
    }
    /*
     * A static method that generates a UUID randomly
     */
    private static UUID setUUID(){
        UUID temp = UUID.randomUUID();
        return temp;
    }

    public String toString(){
        return childFirstname+ childLastname;
    }

    public String hasRestriction(String restriction){
        if (restriction != null)
        {
            return restriction;
        }
        else return null;
    }


}
