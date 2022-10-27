import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Cabin {
    public Counselor counselor;
    public ArrayList<Child> children;
    public int cabinNumber;
    public int session;
    public UUID cabinID;
    private Scanner keyboard = new Scanner(System.in);
    public int maxAge;
    public int minAge;
    public String counselorUUID;
    public Schedule schedule;
    
    public Cabin(int maxAge,int minAge, String counselorUUID, Counselor counselor, int session)
    {
        this.counselor = counselor;
        this.maxAge = maxAge;
        this.minAge = minAge;
        this.counselorUUID = counselorUUID;
        this.session = session;
    }
    public void fillCabin(){

    }

    //make maximum amount of children per cabin and keep track of each child


    /*
     * A static method that generates the UUID randomly
     */
    private static UUID setUUID(){
        UUID temp = UUID.randomUUID();
        return temp;
    }
    public String toString(){
        return "Counselor: "+this.counselor+" Cabin Number: "+this.cabinNumber+" Session: "+this.session+" Children: "+this.children.toString();
    }

    

}
