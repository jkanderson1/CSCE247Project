import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ParentTest {
    private Parent parent = Parent.getinstance();
    private ArrayList<Parent> parental = parent.getParents();
    private ArrayList <Parent> parenttestAL = new ArrayList<>();

    @BeforeEach
    public void set(){
       parenttestAL.clear();
        //parental.add(new Parent("jillw", "watson123","jill", "Watson"," watson123@aol.com", "8032314567"," 123 apple rd", null));
        parenttestAL.add(new Parent("jillw", "watson123","jill", "Watson"," watson123@aol.com", "8032314567"," 123 apple rd", null));
    }

    @AfterEach
    public void tearDown(){
        //ChildCollection.getinstance().getkids().clear();
        parenttestAL.clear();
    }

    public boolean haveParent(String username, String password, String firstName, String lastName, String email, String number, String address){
        for (Parent parent :parenttestAL){
           if (parent.getUsername().equals(username)&& parent.getPassword().equals(password) && parent.getfirstname().equals(firstName)&& parent.getlastname().equals(lastName) && parent.getemail().equals(email) && parent.getphonenumber().equals(number) && parent.getaddress().equals(address)){
              return true;
           }
        }
        return false;
     }
    @Test
    void testHaveParentValid() {
		boolean hasSally = haveParent("jillw", "watson123","jill", "Watson"," watson123@aol.com", "8032314567"," 123 apple rd");
		assertTrue(hasSally);

	}

    @Test
	void testHaveParentInValid() {
		boolean hasSophie = haveParent("joyw", "wheeler","joy", "Wheeler"," joy13@aol.com", "8032314567"," 123 marryway rd");
		assertFalse(hasSophie);
	}

    @Test
	void testHaveParentEmpty() {
		boolean hasEmpty = haveParent(" ", " ", " ", " ", "", "", "");
		assertFalse(hasEmpty);
	}

    @Test
	void testHaveParentNull() {
		boolean hasNull = haveParent(null, null, null, null, null, null, null);
		assertFalse(hasNull);
	}

}  

