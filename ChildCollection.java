
import java.util.ArrayList;

public class ChildCollection extends Child{
    public ChildCollection(String childFirstname, String childLastname, String childDOB, String restriction,
            Contact EmergencyContact, Contact Pediatrician) {
        super(childFirstname, childLastname, childDOB, restriction, EmergencyContact, Pediatrician);
        //TODO Auto-generated constructor stub
    }

    private  ArrayList<Child> children;
    private Child child;


    public void addChild(String childFirstName, String childLastName, String childDOB, String EmergencyContact, String Pediatrician, String restriction){
        children.add(child);
     }

    public void getChildren(){
        for(int i = 0; i > children.size();i++){
            System.out.println(children.get(i).toString());
        }
    }

    
}
