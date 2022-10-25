import java.util.UUID;

public class Counselor extends User{
private String firstName;
private String lastName;
private String couselorDOB;
private String address;
private String EmergencyContact;
private String EmergencyContactNumber;
private String restriction;
public Cabin cabin;
public UUID counselorID;

public Cabin viewCabin(){
    return cabin;
    //print out the list of children in their cabin  
}

public Counselor(Cabin cabin, String firstName, String lastName, String couselorDOB, String address, String EmergencyContact, String EmergencyContactNumber, String restriction, String username, String password){
    super(username,password);
    this.cabin = cabin;
    this.firstName = firstName;
    this.lastName = lastName;
    this.couselorDOB = couselorDOB;
    this.address = address;
    this.EmergencyContact = EmergencyContact;
    this.EmergencyContactNumber = EmergencyContactNumber;
    this.restriction = restriction;
    this.counselorID = setUUID();
}

public String toString(){
    return firstName+lastName+couselorDOB+address+EmergencyContact+EmergencyContactNumber+restriction+counselorID;
}
/*
     * A static method that generates a UUID randomly
     */
    private static UUID setUUID(){
        UUID temp = UUID.randomUUID();
        return temp;
    }

}
