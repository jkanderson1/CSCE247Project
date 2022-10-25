import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Cabin {
    public static Cabin cabin;
    private Counselor counselor;
    public ArrayList<Child> children;
    public int cabinNumber;
    public int session;
    public UUID cabinID;
    private Scanner keyboard = new Scanner(System.in);
    public int maxAge;
    public int minAge;
    public String counselorUUID;
    
    public Cabin(int maxAge,int minAge, String counselorUUID, Counselor counselor, int session)
    {
        this.counselor = counselor;
        this.maxAge = maxAge;
        this.minAge = minAge;
        this.counselorUUID = counselorUUID;
        this.session = session;
    }

    public static Cabin makeCabinYoungest(int maxAge,int minAge, String counselorUUID, Counselor counselor, int session){
        //Singleton
        maxAge = 5;
        minAge = 9;
        if(cabin == null)
        {
            System.out.println("Creating a cabin for the youngest age group");
            cabin = new Cabin(maxAge, minAge, counselorUUID, counselor, session);
        }
        return cabin;
    }

    public static Cabin makeCabinMiddleCabin(int maxAge,int minAge, String counselorUUID, Counselor counselor, int session){
        //Singleton
        maxAge = 9;
        minAge = 14;
        if(cabin == null)
        {
            System.out.println("Creating a cabin for the middle age group");
            cabin = new Cabin(maxAge, minAge, counselorUUID, counselor, session);
        }
        return cabin;
    }

    public static Cabin makeCabinOldest(int maxAge,int minAge, String counselorUUID, Counselor counselor, int session){
        //Singleton
        maxAge = 14;
        minAge = 18;
        if(cabin == null)
        {
            System.out.println("Creating a for the oldest age group");
            cabin = new Cabin(maxAge, minAge, counselorUUID, counselor, session);
        }
        return cabin;
    }
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
