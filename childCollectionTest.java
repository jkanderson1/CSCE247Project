import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class childCollectionTest{
    private ChildCollection childcollection = ChildCollection.getinstance();
    private ArrayList<Child> children = childcollection.getkids();
    private ArrayList<Child> childrentestal = new ArrayList<>();

    @BeforeEach
    public void set(){
        childrentestal.clear();
        //children.add(new Child("Sally", "Martin","10/12/2010","none",(new Contact("Bob", "Manning", "8031234567", "123 house drive")),(new Contact("Jonny", "Cash", "8031234567", "123 Barbie drive"))));
        childrentestal.add(new Child("Sally", "Martin","10/12/2010","none",(new Contact("Bob", "Manning", "8031234567", "123 house drive")),(new Contact("Jonny", "Cash", "8031234567", "123 Barbie drive"))));
    }

  @AfterEach
    public void tearDown(){
        //ChildCollection.getinstance().getkids().clear();
        childrentestal.clear();
    }

    public boolean haveChild(String childFirstName, String childLastName, String childDOB, String restriction, Contact Pediatrician, Contact emergencyContact ){
        for (Child child :childrentestal){
            if ( child.getchildFirstName().equals(childFirstName)&& child.getchildLastName().equals(childLastName)&& child.getchildDOB().equals(childDOB)&& child.getEmergencyContact().equals(emergencyContact) && child.getpediatrician().equals(Pediatrician)&& child.getRestriction().equals(restriction)){
                return true;
            }
        }
        return false;
    }

    @Test
    void testHaveChildValid() {
		boolean hasSally = haveChild("Sally", "Martin","10/12/2010","none",(new Contact("Bob", "Manning", "8031234567", "123 house drive")),(new Contact("Jonny", "Cash", "8031234567", "123 Barbie drive")));
		assertTrue(hasSally);
	}

    @Test
	void testHaveChildInValid() {
		boolean hasSophie = haveChild("Mike", "Sully","02/22/2010","none",(new Contact("Blake", "Uni", "8031234567", "123 lake drive")),(new Contact("Jonny", "Cash", "8031234567", "123 Barbie drive")));
		assertTrue(hasSophie);
	}

    @Test
	void testHaveChildEmpty() {
		boolean hasEmpty = haveChild(" ", " ", " ", " ", (new Contact(" ", " ", "", "")),(new Contact("", "", "", "")));
		assertTrue(hasEmpty);
	}

    @Test
	void testHaveChildNull() {
		boolean hasNull = haveChild(null, null, null, null, null, null);
		assertTrue(hasNull);
	}

}