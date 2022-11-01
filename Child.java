
import java.time.Period;
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
    public Child(String childFirstname, String childLastname, String childDOB, String restriction, Contact emergencyContact, Contact Pediatrician){
        this.childFirstname = childFirstname;
        this.childLastname = childLastname;
        this.childDOB = childDOB;
        this.restriction = restriction;
        this.Pediatrician = Pediatrician;
        this.EmergencyContact = emergencyContact;
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
        return childFirstname+ childLastname+childDOB+restriction+Pediatrician+EmergencyContact+childID;
    }

    public String hasRestriction(String restriction){
        if (restriction != null)
        {
            return restriction;
        }
        else return null;
    }
    
    public String childFirstName()
    {
    return this.childFirstname;
    }
    public String childLastName()
    {
    return this.childLastname;
    }
    public String childDOB()
    {
    return this.childDOB;
    }
    public Contact pediatrician()
    {
    return this.Pediatrician;
    }
    public Contact EmergencyContact()
    {
    return this.EmergencyContact;
    }
    public String getRestriction()
    {
        return this.restriction;
    }
    public String getUUID()
    {
        return this.childID.toString();
    }


    //method to calculate and return the age of a child
    public int getAge(){
        int yearint = Integer.parseInt(childDOB.substring(childDOB.length()-4));
        int monthint = Integer.parseInt(childDOB.substring(0,2));
        int dateint = Integer.parseInt(childDOB.substring(3,4));
        int year = 2022;
        int childAge = year - yearint;
        if(monthint < 11){
            childAge++;
        }
        if(monthint == 11 && dateint < 3 ){
            childAge++;
        }
        return childAge;
    }




}
