

import java.util.ArrayList;

public class CounselorCollection {
    private static ArrayList<Counselor> Counselors;
    private static Counselor counselor;

    public void AddCounselor(String firstName, String lastName, String couselorDOB, String address, Contact EmergencyContact, String restriction){
        Counselors.add(counselor);
        //adding counselor into the counselor array list
    }
    public void getCounselors(){
        for(int i = 0; i > Counselors.size();i++){
            System.out.println(Counselors.get(i).toString());
        }
    }

    
}
