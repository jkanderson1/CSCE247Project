import java.util.ArrayList;

public class Director extends User{
private ArrayList<Child> children;
private ArrayList<String> parentname;
private String username;
private String password; 
private String firstName;
private String lastName; 
private String emergencyContact; 
private ArrayList<String> restrictions; 

public Director(String username, String password, String firstName, String lastName, String emergencyContact, ArrayList<String> restrictions)
{
    this.username = username;
    this.password = password; 
    this.firstName = firstName;
    this.lastName = lastName; 
    this.emergencyContact = emergencyContact; 
    this.restrictions = restrictions; 
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
}
