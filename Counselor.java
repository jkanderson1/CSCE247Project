import java.util.Scanner;
import java.util.UUID;
/**
 * Counselor class that extends user and stores all the properties of the User of type counselor
 */
public class Counselor extends User{
private String firstName;
private String lastName;
private String couselorDOB;
private String address;
private Contact EmergencyContact;
private String restriction;
public Cabin cabin;
public UUID counselorID;

/**
 * view cabin method that returns the cabin that the counselor is assigned to
 * @return the specific cabin for the counselor
 */
public Cabin viewCabin(){
    return cabin;
    //print out the list of children in their cabin  
}
/**
 * creating a counselor with the following parameters 
 * @param firstName counselors first name
 * @param lastName counselors last name
 * @param couselorDOB counselors date of birth
 * @param address counselors address
 * @param EmergencyContact counselors emergency contact
 * @param restriction conselors restrictions
 * @param username counselors username which is needed to login 
 * @param password counselors password which is needed to login
 */
public Counselor(String firstName, String lastName, String couselorDOB, String address, Contact EmergencyContact, String restriction, String username, String password){

    super(username,password);
    this.firstName = firstName;
    this.lastName = lastName;
    this.couselorDOB = couselorDOB;
    this.address = address;
    this.EmergencyContact = EmergencyContact;
    this.restriction = restriction;
    this.counselorID = setUUID();
    
}

/**
 * to string method that prints out the defining strints of a counselor
 * @return the first name, last name, date of birth, address, contact, emergency contact, restrictions, and counselor UUID
 */
public String toString(){
    return firstName+" "+lastName+" "+couselorDOB+" "+address+" Contact: "+EmergencyContact+" "+restriction+" "+counselorID.toString()+" ";
}
/**
 * A static method that generates a UUID randomly
 * returns the UUID
 */
 private static UUID setUUID()
 {
        UUID temp = UUID.randomUUID();
        return temp;
}

/**
 * get first name method that returns the counselors first name
 * @return the counselors first name
 */
public String getFirstName()
{
    return this.firstName;
}
/**
 * get last name method that returns the counselors last name
 * @return the counselors last name
 */
public String getLastName()
{
    return this.lastName;

}
/**
 * get date of birth method that returns the counselors date of birth
 * @return the counselors date of birth
 */
public String getCounselorDOB()
{
    return this.couselorDOB;
}

/**
 * get address method that returns the counselors address
 * @return the counselors address
 */
public String getAddress()
{
    return this.address; 
}
/**
 * get emergency contact method that returns the counselors emergency contact
 * @return the counselors emergency contact
 */
public Contact getEmergencyContact()
{
return this.EmergencyContact;
}
/**
 * get restriction method that returns the counselors restriction
 * @return the counselors restriction
 */
public String getRestriction()
{
    return this.restriction;
}

/**
 * get ID method that returns the counselors UUID
 * @return the counselors UUID
 */
public UUID getCounselorID()
{
    return this.counselorID;
}

}


