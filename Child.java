import java.time.Period;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Child class that stores all the necessary properties for a child
 */
public class Child {
    public String childFirstname;
    public String childLastname;
    public String childDOB;
    public Contact Pediatrician;
    public Contact EmergencyContact;
    public String restriction;

    /**
     * Creating a child with the follow parameters 
     * @param childFirstname First name of the child
     * @param childLastname Last name of the child
     * @param childDOB Childs Date of birth input at MM/DD/YYYY
     * @param restriction Restrictions of the child
     * @param emergencyContact Childs emergency contact
     * @param Pediatrician Childs pediatrician
     */
    public Child(String childFirstname, String childLastname, String childDOB, String restriction, Contact emergencyContact, Contact Pediatrician){
        this.childFirstname = childFirstname;
        this.childLastname = childLastname;
        this.childDOB = childDOB;
        this.restriction = restriction;
        this.Pediatrician = Pediatrician;
        this.EmergencyContact = emergencyContact;
    }

    /**
     * to string method that prints out the identifying properties for the child
     * @return  child first name, child last name, child date of birth, child restriction, pediatricin, emergency contact, amd UUID
     */
    public String toString(){
        return childFirstname+ childLastname+childDOB+restriction+Pediatrician+EmergencyContact;
    }

    /**
     * Has restriction method that returns the string that represents the restriction if the child has a restriction 
     * otherwise null is returned
     * @param restriction restrictions of the child
     * @return retriction or null
     */
    public String hasRestriction(String restriction){
        if (restriction != null)
        {
            return restriction;
        }
        else return null;
    }
    
    /**
     * get Child first name method that returns the childs first name
     * @return child first name
     */
    public String getchildFirstName()
    {
    return this.childFirstname;
    }
   /**
     * get Child last name method that returns the childs first name
     * @return child last name
     */
    public String getchildLastName()
    {
    return this.childLastname;
    }

    /**
     * get Child date of birth method that returns the childs first name
     * @return child date of birth
     */
    public String getchildDOB()
    {
    return this.childDOB;
    }

    /**
     * get pediatirician method that returns the childs first name
     * @return pediatrician
     */
    public Contact getpediatrician()
    {
    return this.Pediatrician;
    }

    /**
     * get emergency contact method that returns the childs first name
     * @return child first name
     */
    public Contact getEmergencyContact()
    {
    return this.EmergencyContact;
    }

    /**
     * get restricition method that returns the childs first name
     * @return retriction
     */
    public String getRestriction()
    {
        return this.restriction;
    }

    
    /**
     * getAge method that calculates and returns the age of a child using the child date of birth parameter
     * @return integer that represents childs age
     */
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
