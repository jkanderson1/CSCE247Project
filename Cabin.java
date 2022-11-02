import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

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
    
    public Cabin(int maxAge,int minAge, String counselorUUID, Counselor counselor, int session)
    {
        super(counselor.getUsername(),counselor.getPassword());
        this.counselor = counselor;
        this.maxAge = maxAge;
        this.minAge = minAge;
        this.counselorUUID = counselorUUID;
        this.session = session;
    }


    public void fillCabin(){
        for(int i = 0;i<children.size();i++){
            this.children.add(ChildCollection.getChild(this.minAge, this.maxAge));
        }
    }

    public void setCounselor(Counselor counselor)
    {
        this.counselor = counselor;
    }

    //make maximum amount of children per cabin and keep track of each child


    /*
     * A static method that generates the UUID randomly
     */
    private static UUID setUUID(){
        UUID temp = UUID.randomUUID();
        return temp;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return "Counselor: "+this.counselor+" Cabin Number: "+this.cabinNumber+" Session: "+this.session+" Children: "+this.children.toString();
    }

    

}
