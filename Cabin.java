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
    public String schedule;
    ChildCollection collection = new ChildCollection(DataReader.getAllChildren());
    
    /**
     * Creating a cabin with the following properties as parameters
     * @param maxAge maximum age of the children in the cabin
     * @param minAge minimum age of the children in the cabin
     * @param counselorUUID UUID of the counselor in the cabin
     * @param counselor Counselor in the cabin
     * @param session Session for the cabin
     * @param cabinNumber Arbitrary Cabin Number
     */
    public Cabin(int maxAge,int minAge, String counselorUUID, Counselor counselor, int session, int cabinNumber, String schedule, ArrayList<Child> children)
    {
        super(counselor.getUsername(),counselor.getPassword());
        this.counselor = counselor;
        this.maxAge = maxAge;
        this.minAge = minAge;
        this.counselorUUID = counselorUUID;
        this.session = session;
        this.cabinNumber = cabinNumber;
        this.schedule = schedule;
        this.children = children;
    }

    /**
     * access method that allows the user to view specific cabin details
     */
    public void access(){
        while(true){
        System.out.println("Welcome "+counselor.getFirstName()+" Select a number for an option:"+
                            "\n0 for Cabin Roster (Simple)"+
                            "\n1 for Cabin Details Printout (Complex)"+
                            "\n2 for Cabin Schedule"+
                            "\n3 for logout");
        int option = keyboard.nextInt();
        if(option==0){
           for (int i =0; i<children.size(); i++)
           {
                System.out.println(" ");
                System.out.println(children.get(i));
           }
        }
        else if(option==1){
            DataWriter.cabinToTXT(this);
        }
        else if(option==2){
            System.out.print(schedule);
        }
        else if(option==3){
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

    public int getCabinNumber(){
        return this.cabinNumber;
    }
    public int getSession(){
        return this.session;
    }
    public String getSchedule(){
        return this.schedule;
    }
}
