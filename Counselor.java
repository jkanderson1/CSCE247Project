

<<<<<<< HEAD
public class Counselor {
public static String firstName;
public static String lastName;
=======
public class Counselor extends User{
private String firstName;
private String lastName;
>>>>>>> refs/remotes/origin/main
private String couselorDOB;
private String address;
private Contact EmergencyContact;
private  Restriction restriction;

public Cabin viewCabin(){
    return null;
    //print out the list of children in their cabin
    
}

public Counselor(String firstName, String lastName, String couselorDOB, String address, Contact EmergencyContact, Restriction restriction){
    this.firstName = firstName;
    this.lastName = lastName;
    this.couselorDOB = couselorDOB;
    this.address = address;
    this.EmergencyContact = EmergencyContact;
    this.restriction = restriction;
}
}
