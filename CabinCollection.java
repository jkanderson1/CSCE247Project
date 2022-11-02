import java.util.ArrayList;

/**
 * Cabin collection class that stores the arraylists necessary for the cabins
 */
public class CabinCollection {
    private ArrayList<Child> childList;
    private ArrayList<Counselor> counselorList;
    private ArrayList<Cabin> cabins;
/**
 * Creating an array list of cabins
 * @return array list of cabins
 */
    public ArrayList<Cabin> cabinList(){
        return cabins;
    }
}
