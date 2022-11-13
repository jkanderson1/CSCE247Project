import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class childCollectionTest{
    private ChildCollection childcollection = ChildCollection.getinstance();
    private static ArrayList<Child> children = ChildCollection.getAllChildren();

    @BeforeEach
    public void set(){
        children.clear();
        children.add(new Child("Sally", "Martin","10/12/2010","none",(new Contact("Bob", "Manning", "8031234567", "123 house drive")),(new Contact("Jonny", "Cash", "8031234567", "123 Barbie drive"))));
        children.add(new Child("Mike", "Sully","02/22/2010","none",(new Contact("Blake", "Uni", "8031234567", "123 lake drive")),(new Contact("Jonny", "Cash", "8031234567", "123 Barbie drive"))));
        
    }

    @AfterEach
    public void tearDown(){
        ChildCollection.getinstance().getkids().clear();
    }

    @Test
    void testHaveUserValidFirstname() {
		boolean hasSally = childcollection.haveChild("Sally");
		assertTrue(hasSally);
	}
    @Test
	void testHaveUserValidLastname() {
		boolean hasMike = childcollection.haveChild("bwhite");
		assertTrue(hasMike);
	}

    @Test
	void testHaveUserInValid() {
		boolean hasSophie = childcollection.haveChild("jsmith");
		assertFalse(hasSophie);
	}

    @Test
	void testHaveUserEmpty() {
		boolean hasEmpty = childcollection.haveChild("");
		assertFalse(hasEmpty);
	}

    @Test
	void testHaveUserNull() {
		boolean hasNull = childcollection.haveChild(null);
		assertFalse(hasNull);
	}

}