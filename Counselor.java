public class Counselor extends User{
private String firstName;
private String lastName;
private String couselorDOB;
private String address;
private String EmergencyContact;
private String EmergencyContactNumber;
private  String restriction;

public Cabin viewCabin(){
    return null;
    //print out the list of children in their cabin
    
}

public Counselor(String firstName, String lastName, String couselorDOB, String address, String EmergencyContact, String EmergencyContactNumber, String restriction){
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.couselorDOB = couselorDOB;
    this.address = address;
    this.EmergencyContact = EmergencyContact;
    this.EmergencyContactNumber = EmergencyContactNumber;
    this.restriction = restriction;
}
}
