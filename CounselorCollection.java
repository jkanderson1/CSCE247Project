
import java.util.ArrayList;

/**
 * Counselor Collection class that stores the arrat list of all counselors
 */
public class CounselorCollection {
    private static ArrayList<Counselor> Counselors;
    private static Counselor counselor;
    /**
     * Counselor collection class that returns the collection of all counselors as an arraylist
     * @param counselors array list 
     */
    public CounselorCollection(ArrayList<Counselor> counselors){
        this.Counselors = counselors;
    }
    /**
     * Add counselor method that adds a counselor to the arraylist of counselors
     */
    public void AddCounselor(String firstName, String lastName, String couselorDOB, String address, Contact EmergencyContact, String restriction){
        Counselors.add(counselor);
        //adding counselor into the counselor array list
    }
    /**
     * get Counselor by UUID method that returns the array list of counselors
     * @return array list of counselors
     */
    public ArrayList getCounselorbyUUID(){
       return Counselors;
    }
    public void getAllCounselors(){
        for(int i = 0; i > Counselors.size();i++){
            System.out.println(Counselors.get(i).toString());
        }
    }
    
}
