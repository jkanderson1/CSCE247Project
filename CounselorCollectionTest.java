import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounselorCollectionTest{
    private CounselorCollection counselorcollection = CounselorCollection.getinstance();
    private ArrayList<Counselor> Counselors = counselorcollection.getCounselors();
    private ArrayList<Counselor> Counselorstestal = new ArrayList<>();

    @BeforeEach
    public void setup(){
        Counselorstestal.clear();
        //Counselors.add(new Counselor("Bobby", "Settles","10/12/2002","213 newhouse dr",(new Contact("Bob", "Settles", "8031234567", "123 logger drive")), "none", "bobbys", "thesettes"));
        Counselorstestal.add(new Counselor("Bobby", "Settles","10/12/2002","213 newhouse dr",(new Contact("Bob", "Settles", "8031234567", "123 logger drive")), "none", "bobbys", "thesettes"));
        
    }

    @AfterEach
    public void tearDown(){
        //CounselorCollection.getinstance().getCounselors().clear();
        Counselorstestal.clear();
    }

    public boolean haveCounselor(String firstName, String lastName, String couselorDOB, String address, Contact EmergencyContact, String restriction, String username, String password){
        for (Counselor counselor :Counselorstestal){
            if ( counselor.getFirstName().equals(firstName)&& counselor.getLastName().equals(lastName)&& counselor.getCounselorDOB().equals(couselorDOB)&& counselor.getAddress().equals(address) &&counselor.getEmergencyContact().equals(EmergencyContact) && counselor.getRestriction().equals(restriction)&& counselor.getusername().equals(username) && counselor.getpassword().equals(password)){
                return true;
            }
        }
        return false;
    } 

    @Test
    void testHaveCounselorValid() {
		boolean hasBobby = haveCounselor("Bobby", "Settles","10/12/2002","213 newhouse dr",(new Contact("Bob", "Settles", "8031234567", "123 logger drive")), "none", "bobbys", "thesettes");
		assertTrue(hasBobby);
	}

    @Test
	void testHaveUCounselorInValid() {
		boolean hasSophie = haveCounselor("Mike", "Sully","02/22/2010","123 addres rd",(new Contact("Blake", "Uni", "8031234567", "123 lake drive")),"none", "username", "password");
		assertTrue(hasSophie);
	}

    @Test
	void testHaveCounselorEmpty() {
		boolean hasEmpty = haveCounselor("", "", "", "", (new Contact(" ", " ", "", "")),"", "", "");
		assertTrue(hasEmpty);
	}

    @Test
	void testHaveCounselorNull() {
		boolean hasNull = haveCounselor(null, null, null, null, null, null, null, null);
		assertTrue(hasNull);
	}

}