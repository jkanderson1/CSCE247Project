import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChildTest {
    private ChildCollection childcollection = ChildCollection.getinstance();
    private static ArrayList<Child> children = ChildCollection.getAllChildren();

    @BeforeEach
    public void setup(){
        children.clear();
        children.add(new Child("Lucas", "Sinclair","04/22/2012","peanuts",(new Contact("Bob", "Manning", "8031234567", "123 house drive")),(new Contact("Jonny", "Cash", "8031234567", "123 Barbie drive"))));
    }

    @AfterEach
    public void tearDown(){
        ChildCollection.getinstance().getkids().clear();
    }

    @Test
    void testHasRestriction(){
        boolean hasrestriction = Child.hasRestriction("peanuts");
        assertTrue(hasrestriction);
    }

    @Test
    void testGetAge(){
        int rightage = Child.getAge();
        boolean check = false;
        if(rightage == 10)
        {
            check = true;
        }
        assertTrue(check);
    }

}
