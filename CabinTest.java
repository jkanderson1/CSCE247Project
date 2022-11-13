import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CabinTest {
    static ArrayList<Child> children = Cabin.getChildren();
    @Test
    static
    void testFillCabin(){
        boolean check = false;
        if(children.size() == 8)
        {
            check = true;
        }
        else
        check = false;
        assertTrue(check);
    }

    public static void main(String[] args) {
        testFillCabin();
     }
    
}
