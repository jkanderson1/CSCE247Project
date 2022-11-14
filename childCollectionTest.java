import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class childCollectionTest{
    private ChildCollection childcollection = ChildCollection.getinstance();
    private ArrayList<Child> children = childcollection.getkids();

    @BeforeEach
    public void set(){
        //children.clear();
        children.add(new Child("Sally", "Martin","10/12/2010","none",(new Contact("Bob", "Manning", "8031234567", "123 house drive")),(new Contact("Jonny", "Cash", "8031234567", "123 Barbie drive"))));

    }

  @AfterEach
    public void tearDown(){
        ChildCollection.getinstance().getkids().clear();
    }

    @Test
    void testHaveChildValid() {
		boolean hasSally = childcollection.haveChild("Sally", "Martin","10/12/2010","none",(new Contact("Bob", "Manning", "8031234567", "123 house drive")),(new Contact("Jonny", "Cash", "8031234567", "123 Barbie drive")));
		assertTrue(hasSally);
	}

    @Test
	void testHaveChildInValid() {
		boolean hasSophie = childcollection.haveChild("Mike", "Sully","02/22/2010","none",(new Contact("Blake", "Uni", "8031234567", "123 lake drive")),(new Contact("Jonny", "Cash", "8031234567", "123 Barbie drive")));
		assertFalse(hasSophie);
	}

    @Test
	void testHaveChildEmpty() {
		boolean hasEmpty = childcollection.haveChild(" ", " ", " ", " ", (new Contact(" ", " ", "", "")),(new Contact("", "", "", "")));
		assertFalse(hasEmpty);
	}

    @Test
	void testHaveChildNull() {
		boolean hasNull = childcollection.haveChild(null, null, null, null, null, null);
		assertFalse(hasNull);
	}

}