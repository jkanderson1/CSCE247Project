import java.util.Scanner;
import java.util.UUID;

public class Counselor extends User{
private String firstName;
private String lastName;
private String couselorDOB;
private String address;
private Contact EmergencyContact;
private String restriction;
public Cabin cabin;
public UUID counselorID;

public Cabin viewCabin(){
    return cabin;
    //print out the list of children in their cabin  
}

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

public String toString(){
    return firstName+" "+lastName+" "+couselorDOB+" "+address+" Contact: "+EmergencyContact+" "+restriction+" "+counselorID+" ";
}
/*
 * A static method that generates a UUID randomly
 */
 private static UUID setUUID()
 {
        UUID temp = UUID.randomUUID();
        return temp;
}


public String getFirstName()
{
    return this.firstName;
}
public String getLastName()
{
    return this.lastName;

}
public String getCounselorDOB()
{
    return this.couselorDOB;
}
public String getAddress()
{
    return this.address; 
}
public Contact getEmergencyContact()
{
return this.EmergencyContact;
}
public String getRestriction()
{
    return this.restriction;
}
public UUID getCounselorID()
{
    return this.counselorID;
}

}


