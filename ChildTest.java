import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChildTest {

    @BeforeEach
    public void setup(){
        Child aChild = new Child("Lucas", "Sinclair","06/18/20015", "peanuts", null, null);
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
