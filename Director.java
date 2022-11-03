import java.util.ArrayList;
import java.util.UUID;
import java.util.Scanner;

/**
 * Director class that stores all the properties of the director
 */
public class Director extends User{
private ArrayList<Child> children;
private ArrayList<String> parentname;
public static Scanner keyboard = new Scanner(System.in);

private String firstName;
private String lastName; 
private Contact emergencyContact; 
private String restrictions; 
public UUID directorID;
public ChildCollection child;
public CounselorCollection counselor;
public CabinCollection cabins;
private String theme1;
private String theme2;
private String theme3;
private String theme4;
private String theme5;
private String theme6;
private String theme7;
private String theme8;
private String theme9;

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
    this.cabins = new CabinCollection(DataReader.getAllCabins());
    this.child = new ChildCollection(DataReader.getAllChildren());
    this.counselor = new CounselorCollection(DataReader.getAllCounselors());
    
}
/**
 * access method that allows the director to choose which of their director capabilities that would like to use
 * Takes in user input and runs the appropriate methods for the input
 */
public void access(){

    while(true){
        System.out.println("welcome director what would you like to do?\n 1. view all cabins\n 2.view all campers\n 3. view all counselors \n4. set session themes\n5.view schedule by cabin and session\n 6. log out");
        int option = keyboard.nextInt();
        if (option==1){
           cabins.cabinList();
        }
        else if (option==2){
            child.getChildren();
        }
        else if (option==3){
            counselor.getAllCounselors();;
        }
        else if (option==4){
            keyboard.nextLine();
            System.out.println("what is the theme for session 1 ");
            String theme1 = keyboard.nextLine();
            System.out.println("what is the theme for session 2 ");
            String theme2 = keyboard.nextLine();
            System.out.println("what is the theme for session 3 ");
            String theme3 = keyboard.nextLine();
            System.out.println("what is the theme for session 4 ");
            String theme4 = keyboard.nextLine();
            System.out.println("what is the theme for session 5 ");
            String theme5 = keyboard.nextLine();
            System.out.println("what is the theme for session 6 ");
            String theme6 = keyboard.nextLine();
            System.out.println("what is the theme for session 7 ");
            String theme7 = keyboard.nextLine();
            System.out.println("what is the theme for session 8 ");
            String theme8 = keyboard.nextLine();
            System.out.println("what is the theme for session 9 ");
            String theme9 = keyboard.nextLine();
            
        
        }
        else if (option== 5){
            System.out.println("Input the cabin number you'd like to search");
            int cabNum = keyboard.nextInt();
            System.out.println("Input the session number for this cabin");
            int sessionNum = keyboard.nextInt();
            ArrayList<Cabin> theCabins = cabins.cabinList();
            for(int i = 0;i<theCabins.size();i++){
                if(theCabins.get(i).getCabinNumber()==cabNum && theCabins.get(i).getSession()==sessionNum){
                    System.out.println(theCabins.get(i).getSchedule().toString());
                }
            }
        }
        else if (option==6){
            System.out.println("Goodbye.");
            break;
        }
        else {
            System.out.println("invalid number, try again.");
        }
        
    }
}

/**
 * get themes method that returns the string that represents each theme
 * @return strings for each theme
 */
public String getthemes(){
    return "session 1: "+this.theme1+ " session 2: "+this.theme2+ " session 3: "+this.theme3+ " session 4: "+this.theme4+ " session 5: "+this.theme5+ " session 6: "+this.theme6+" session 7: "+this.theme7+ " session 8: "+this.theme8+ " session 9: "+this.theme9;
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
/**
 * expel child method that allows the director to remove a child with specific parrameters from the camp
 * @param cabin childs cabin 
 * @param childFirstName childs first name
 * @param childLastName childs last name
 */
private void expelChild(Cabin cabin, String childFirstName, String childLastName){
    
}
/**
 * get theme method that returns the appropriate theme
 * @return the appropriate theme (theme 1)
 */
public String gettheme1(){
    return this.theme1;
}

/**
 * get theme method that returns the appropriate theme
 * @return the appropriate theme (theme 2)
 */
public String gettheme2(){
    return this.theme2;
}

/**
 * get theme method that returns the appropriate theme
 * @return the appropriate theme (theme 3)
 */
public String gettheme3(){
    return this.theme3;
}

/**
 * get theme method that returns the appropriate theme
 * @return the appropriate theme (theme 4)
 */
public String gettheme4(){
    return this.theme4;
}

/**
 * get theme method that returns the appropriate theme
 * @return the appropriate theme (theme 5)
 */
public String gettheme5(){
    return this.theme5;
}

/**
 * get theme method that returns the appropriate theme
 * @return the appropriate theme (theme 6)
 */
public String gettheme6(){
    return this.theme6;
}

/**
 * get theme method that returns the appropriate theme
 * @return the appropriate theme (theme 7)
 */
public String gettheme7(){
    return this.theme7;
}

/**
 * get theme method that returns the appropriate theme
 * @return the appropriate theme (theme 8)
 */
public String gettheme8(){
    return this.theme8;
}

/**
 * get theme method that returns the appropriate theme
 * @return the appropriate theme (theme 9)
 */
public String gettheme9(){
    return this.theme9;
}
/**
 * get first name method that returns the directors first name
 * @return the directors first name
 */
public String getFirstName()
{
    return this.firstName;
}
/**
 * get last name method that returns the directors last name
 * @return the directors last name
 */
public String getLastName()
{
    return this.lastName;
}
/**
 * get emergency contact ID method that prints the to string that represents the emergency contact ID
 * @return the emergency contact to string
 */
public String getEContactID()
{
    return this.emergencyContact.contactID.toString();

}

/**
 * get restrictions method that returns the list of resctrictions
 * @return return the list of restrictions
 */
public String getRestrictions()
{
    return this.restrictions;
}
/**
 * get director UUID method
 * @return returns the user UUID
 */
public UUID getDirectorID() {
    return this.directorID;
}
/**
 * to string that returns the defining strings for the director
 * return first name, last name, emergency contact, and restrictions strings
 */
public String toString()
{
    return this.firstName+" "+this.lastName+" "+ this.emergencyContact+" "+this.restrictions;
}

}
