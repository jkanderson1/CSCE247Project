
import java.util.ArrayList;
import java.util.UUID;
public class Child extends Parent{
    public String childFirstname;
    public String childLastname;
    public String childDOB;
    public String emergencyContact;
    public String emergencyContactNumber;
    public String pediatrician;
    public String pediatricianNumber;
    public String restriction;
    public UUID childID;

    //might remove restrictions;
    public Child(String childFirstname, String childLastname, String childDOB, String restriction, String emergencyContact, String emergencyContactNumber, String pediatrician,String pediatricianNumber){
        this.childFirstname = childFirstname;
        this.childLastname = childLastname;
        this.childDOB = childDOB;
        this.restriction = restriction;
        this.emergencyContact = emergencyContact;
        this.emergencyContactNumber = emergencyContactNumber;
        this.pediatrician = pediatrician;
        this.pediatricianNumber= pediatricianNumber;
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
        return childFirstname+ childLastname+ childDOB+ restriction+ emergencyContact+ emergencyContactNumber+ pediatrician+pediatricianNumber;
    }

    public String hasRestriction(String restriction){
        if (restriction != null)
        {
            return restriction;
        }
        else return null;
    }


}
