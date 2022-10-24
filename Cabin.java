
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

    public Cabin makeCabin(String ageGroup, Counselor counselor){
        // this.children = ChildCollection.childList(ageGroup);
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
