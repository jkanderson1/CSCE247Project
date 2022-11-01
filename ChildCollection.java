
import java.util.ArrayList;

public class ChildCollection{

    public ChildCollection(ArrayList<Child> children) {
        this.children = children;
    }

    private static ArrayList<Child> children;
    public void addChild(String childFirstName, String childLastName, String childDOB, Contact emergencyContact, Contact Pediatrician, String restriction){
        Child child = new Child(childFirstName, childLastName, childDOB, restriction, emergencyContact, Pediatrician);
        this.children.add(child);
    }
    public void getChildren(){
        for(int i = 0; i > children.size();i++){
            System.out.println(children.get(i).toString());
        }
    }
    public static Child getChild(int minAge, int maxAge){
        Child retChild;
        for(int i = 0;i<children.size();i++){
            if(children.get(i).getAge()>=minAge && children.get(i).getAge()<=maxAge){
                retChild = children.get(i);
                children.remove(retChild);
                return retChild;
            }
        }
        return null;
    }

    
}
