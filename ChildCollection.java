
import java.util.ArrayList;

public class ChildCollection{
    public static ChildCollection childcollection;
    private static ArrayList<Child> children;
    /**
     * returning array list that represents the children
     * @param children
     */
    public ChildCollection(ArrayList<Child> children) {
        this.children = children;
    }
    /**
     * add child method that adds a child to the array list of children
     * @param childFirstName represents the childs first name
     * @param childLastName represents the childs last name
     * @param childDOB represents the childs date of birth
     * @param emergencyContact the childs emergency contact
     * @param Pediatrician the childs pediatrician
     * @param restriction the childs restriction
     */
    public void addChild(String childFirstName, String childLastName, String childDOB, Contact emergencyContact, Contact Pediatrician, String restriction){
        Child child = new Child(childFirstName, childLastName, childDOB, restriction, emergencyContact, Pediatrician);
        this.children.add(child);
    }
    /**
     * getchild method that returns the string that represents an instance of child in the arraylist of children
     */
    public void getChildren(){
        for(int i = 0; i > children.size();i++){
            System.out.println(children.get(i).toString());
        }
    }

    /**
     * get Child method that returns a child with a specific maximum and minimum age in order to fill 
     * the appropraite cabin
     * @param minAge minimum age that a child can be to enter the cabin
     * @param maxAge maximum age that a child can be to enter the cabin
     * @return the specific instance of child that fits those parameters
     */
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

    /**
     * @return an ArrayList of children from the ChildCollection class 
     */
    public static ArrayList<Child> getAllChildren()
    {
        return ChildCollection.children;
    }
    public String toString(){
        String ret = "";
        for(int i = 0;i<children.size();i++){
            ret = ret+children.get(i);
        }
        return ret;
    }

    public static ChildCollection getinstance(){
        if (childcollection==null){
            childcollection = new ChildCollection(children);
        }
        return childcollection;
    }

    public boolean haveChild(String childFirstName){
        for (Child child :children){
            if ( child.getchildFirstName().equals(childFirstName)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Child> getkids(){
        return children;
    }
  
    
}
