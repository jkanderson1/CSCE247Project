import java.util.ArrayList;
import java.util.UUID;

public class Director extends User{
private ArrayList<Child> children;
private ArrayList<String> parentname;
private String username;
private String password; 
private String firstName;
private String lastName; 
private Contact emergencyContact; 
private ArrayList<String> restrictions; 
public UUID directorID;
public ChildCollection child;
public CounselorCollection counselor;
public CabinCollection cabins;

public Director(String username, String password, String firstName, String lastName, Contact emergencyContact, ArrayList<String> restrictions)
{
    super(username, password);
    this.firstName = firstName;
    this.lastName = lastName; 
    this.emergencyContact = emergencyContact; 
    this.restrictions = restrictions; 
}
    /*
     * A static method that generates a UUID randomly
     */
    private static UUID setUUID(){
        UUID temp = UUID.randomUUID();
        return temp;
    }

private CabinCollection viewCabins(ArrayList<Cabin> cabinList){
    return (CabinCollection)cabins;

}
private ChildCollection viewChildren(ArrayList<Child> Children){
    return (ChildCollection)child;

}
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
public ArrayList getRestrictions()
{
    return this.restrictions;
}

}
