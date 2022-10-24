import java.util.ArrayList;
import java.util.UUID;

public class Director extends User{
private ArrayList<Child> children;
private ArrayList<String> parentname;
private String username;
private String password; 
private String firstName;
private String lastName; 
private String emergencyContact; 
private ArrayList<String> restrictions; 
public UUID directorID;

public Director(String username, String password, String firstName, String lastName, String emergencyContact, ArrayList<String> restrictions)
{
    super();
    this.username = username;
    this.password = password; 
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

private void makeChildSchedule(Days ChildActivities){

}
private void makeTeenSchedule(Days TeenActivities){

}
private CabinCollection viewCabins(){
    return null;

}
private ChildCollection viewChildren(){
    return null;

}
private CounselorCollection viewCounselors(){
    return null;

}
private void expelChild(Cabin cabin, String childFirstName, String childLastName){
    
}

private void addDirector(){
    
}
}
