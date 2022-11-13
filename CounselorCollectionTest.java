import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounselorCollectionTest{
    private CounselorCollection counselorcollection = CounselorCollection.getinstance();
    private static ArrayList<Counselor> Counselors = CounselorCollection.getAllCounselors();

    @BeforeEach
    public void set(){
        Counselors.clear();
        Counselors.add(new Counselor("Bobby", "Settles","10/12/2002","213 newhouse dr",(new Contact("Bob", "Settles", "8031234567", "123 logger drive")), "none", "bobbys", "thesettes"));
        //children.add(new Child("Mike", "Sully","02/22/2010","none",(new Contact("Blake", "Uni", "8031234567", "123 lake drive")),(new Contact("Jonny", "Cash", "8031234567", "123 Barbie drive"))));

    }

    @AfterEach
    public void tearDown(){
        CounselorCollection.getinstance().getCounselors().clear();
    }

    @Test
    void testHaveUserValidFirstname() {
		boolean hasBobby = counselorcollection.haveCounselor("Bobby", "Settles","10/12/2002","213 newhouse dr",(new Contact("Bob", "Settles", "8031234567", "123 logger drive")),"none", "bobbys", "thesettes");
		assertTrue(hasBobby);
	}

    @Test
	void testHaveUserInValid() {
		boolean hasSophie = counselorcollection.haveCounselor("Mike", "Sully","02/22/2010","123 addres rd",(new Contact("Blake", "Uni", "8031234567", "123 lake drive")),"none", "username", "password");
		assertFalse(hasSophie);
	}

    @Test
	void testHaveUserEmpty() {
		boolean hasEmpty = counselorcollection.haveCounselor("", "", "", "", (new Contact(" ", " ", "", "")),"", "", "");
		assertFalse(hasEmpty);
	}

    @Test
	void testHaveUserNull() {
		boolean hasNull = counselorcollection.haveCounselor(null, null, null, null, null, null, null, null);
		assertFalse(hasNull);
	}

}