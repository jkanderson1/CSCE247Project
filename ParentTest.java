import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ParentTest {
    private Parent parent = Parent.getinstance();
    private static ArrayList<Parent> parental = Parent.getAllParents();

    @BeforeEach
    public void set(){
        parental.clear();
        parental.add(new Parent("jillw", "watson123","jill", "Watson"," watson123@aol.com", "8032314567"," 123 apple rd", null));

    }

    @AfterEach
    public void tearDown(){
        ChildCollection.getinstance().getkids().clear();
    }

    @Test
    void testHaveUserValidFirstname() {
		boolean hasSally = parent.haveParent("jillw", "watson123","jill", "Watson"," watson123@aol.com", "8032314567"," 123 apple rd");
		assertTrue(hasSally);
	}

    @Test
	void testHaveUserInValid() {
		boolean hasSophie = parent.haveParent("joyw", "wheeler","joy", "Wheeler"," joy13@aol.com", "8032314567"," 123 marryway rd");
		assertFalse(hasSophie);
	}

    @Test
	void testHaveUserEmpty() {
		boolean hasEmpty = parent.haveParent(" ", " ", " ", " ", "", "", "");
		assertFalse(hasEmpty);
	}

    @Test
	void testHaveUserNull() {
		boolean hasNull = parent.haveParent(null, null, null, null, null, null, null);
		assertFalse(hasNull);
	}

}  

