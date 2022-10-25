import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Cabin {
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

    public Cabin makeCabin(int maxAge,int minAge, String counselorUUID, Counselor counselor, int session){
        //Singleton
        this.counselor = counselor;
        System.out.println("Input New Cabin Number");
        this.cabinNumber = keyboard.nextInt();
        System.out.println("Input the session week for this cabin");
        this.session = keyboard.nextInt();
        this.cabinID = setUUID();
        return this;
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
