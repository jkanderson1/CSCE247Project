
import java.util.ArrayList;
import java.util.Scanner;

public class Cabin {
    private Counselor counselor;
    public ArrayList<Child> children;
    public String cabinName;
    public int cabinNumber;
    public int Sessions;
    private Scanner keyboard = new Scanner(System.in);

    public Cabin makeCabin(String ageGroup, Counselor counselor){
        // this.children = ChildCollection.childList(ageGroup);
        this.counselor = counselor;
        System.out.println("Input New Cabin Name");
        this.cabinName = keyboard.nextLine();
        System.out.println("Input New Cabin Number");
        this.cabinNumber = keyboard.nextInt();
    }

    public String setageGroup(ArrayList<Child> children){
        return "";
        
    }


}
