

import java.util.ArrayList;

public class CounselorCollection {
    private static ArrayList<Counselor> Counselors;
    private static Counselor counselor;

    public CounselorCollection(ArrayList<Counselor> counselors){
        this.Counselors = counselors;
    }
    public void AddCounselor(String firstName, String lastName, String couselorDOB, String address, Contact EmergencyContact, String restriction){
        Counselors.add(counselor);
        //adding counselor into the counselor array list
    }
    public ArrayList getCounselorbyUUID(){
       return Counselors;
    }

    
}
