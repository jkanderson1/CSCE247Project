import java.util.ArrayList;
import java.util.UUID;

/**
 * Director class that stores all the properties of the director
 */
public class Director extends User{
private ArrayList<Child> children;
private ArrayList<String> parentname;
private String username;
private String password; 
private String firstName;
private String lastName; 
private Contact emergencyContact; 
private String restrictions; 
public UUID directorID;
public ChildCollection child;
public CounselorCollection counselor;
public CabinCollection cabins;

/**
 * Creating director that has the following parameters
 * @param username director username
 * @param password director password
 * @param firstName director first name
 * @param lastName director last name
 * @param emergencyContact director emergency contact
 * @param restrictions director restrictions
 */
public Director(String username, String password, String firstName, String lastName, Contact emergencyContact, String restrictions)
{
    super(username, password);
    this.firstName = firstName;
    this.lastName = lastName; 
    this.emergencyContact = emergencyContact; 
    this.restrictions = restrictions; 
    
}
    /**
     * A static method that generates a UUID randomly
     * @return the UUID
     */
    private static UUID setUUID(){
        UUID temp = UUID.randomUUID();
        return temp;
    }
/**
 * View cabins method that returns the whole array list of cabins
 * @param cabinList
 * @return list of cabins from cabin collection
 */
private CabinCollection viewCabins(ArrayList<Cabin> cabinList){
    return (CabinCollection)cabins;

}
/**
 * view child method that returns the whole array list of children
 * @param Children
 * @return list of children from child collection
 */
private ChildCollection viewChildren(ArrayList<Child> Children){
    return (ChildCollection)child;
}
/**
 * 
 * @param counselors
 * @return
 */
private CounselorCollection viewCounselors(ArrayList<Counselor>counselors){
    return (CounselorCollection)counselor;

}
private void expelChild(Cabin cabin, String childFirstName, String childLastName){
    
}

public String getUsername()
{
    return this.username;
}
public String getPassword()
{
    return this.password;
}
public String getFirstName()
{
    return this.firstName;
}
public String getLastName()
{
    return this.lastName;
}
public String getEContactID()
{
    return this.emergencyContact.contactID.toString();

}
public String getRestrictions()
{
    return this.restrictions;
}
public UUID getDirectorID() {
    return this.directorID;
}
public String toString()
{
    return this.firstName+" "+this.lastName+" "+ this.emergencyContact+" "+this.restrictions;
}

}
