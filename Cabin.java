import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * Cabin class that stores all of the properties for a cabin
 */
public class Cabin extends User{
    public Counselor counselor;
    public ArrayList<Child> children = new ArrayList<Child>(8);
    public int cabinNumber;
    public int session;
    public UUID cabinID;
    private Scanner keyboard = new Scanner(System.in);
    public int maxAge;
    public int minAge;
    public String counselorUUID;
    public Schedule schedule;
    ChildCollection collection = new ChildCollection(DataReader.getAllChildren());
    
    /**
     * Creating a cabin with the following properties as parameters
     * @param maxAge maximum age of the children in the cabin
     * @param minAge minimum age of the children in the cabin
     * @param counselorUUID UUID of the counselor in the cabin
     * @param counselor Counselor in the cabin
     * @param session Session for the cabin
     */
    public Cabin(int maxAge,int minAge, String counselorUUID, Counselor counselor, int session)
    {
        super(counselor.getUsername(),counselor.getPassword());
        this.counselor = counselor;
        this.maxAge = maxAge;
        this.minAge = minAge;
        this.counselorUUID = counselorUUID;
        this.session = session;
    }

    public void access(){
        while(true){
        System.out.println("Welcome "+counselor.getFirstName()+" Select a number for an option:"+
                            "\n0 for Cabin Roster (Simple)"+
                            "\n1 for Cabin Details Printout (Complex)"+
                            "\n2 for Cabin Schedule"+
                            "\n3 for logout");
        if(keyboard.nextInt()==0){
            System.out.println(collection.toString());
        }
        else if(keyboard.nextInt()==1){
            DataWriter.cabinToTXT(this);
        }
        else if(keyboard.nextInt()==2){
            System.out.println(schedule.toString());
        }
        else if(keyboard.nextInt()==3){
            return;
        }
    }
    }


    /**
     * fill cabin method which puts the specified amount of children into the cabin
     */
    public void fillCabin(){
        for(int i = 0;i<children.size();i++){
            this.children.add(ChildCollection.getChild(this.minAge, this.maxAge));
        }
    }

    /**
     * Set counselor method that creates the counselor for the cabin
     * @param counselor that is assigned to the cabin
     */
    public void setCounselor(Counselor counselor)
    {
        this.counselor = counselor;
    }

    //make maximum amount of children per cabin and keep track of each child


    /**
     * A static method that generates the UUID randomly
     * @return the UUID
     */
    private static UUID setUUID(){
        UUID temp = UUID.randomUUID();
        return temp;
    }
    /**
     * toString method that returns the string to represent the cabin
     * @return the strings that represent the counselor, cabin number, session, and children, 
     */
    public String toString(){
        return "Counselor: "+this.counselor+" Cabin Number: "+this.cabinNumber+" Session: "+this.session+" Children: "+this.children.toString();
    }

    

}
