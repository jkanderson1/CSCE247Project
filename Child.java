public class Child {
    public String childFirstName;
    public String childLastName;
    public String childDOB;
    public Contact EmergencyContact;
    public Contact Pediatrician;
    public Restriction[] restriction;
    //might remove restrictions;

    public Child(String childFirstName, String childLastname, String childDOB, Restriction restriction, Contact EmergencyContact, Contact Pediatrician){

    }

    public void addChild(String childFirstName, String childLastName, String childDOB, Contact EmergencyContact, Contact Pediatrician, Restriction[] restriction){
        this.childFirstName =  childFirstName;
        this.childLastName = childLastName;
        this.childDOB = childDOB;
        this.EmergencyContact = EmergencyContact;
        this.Pediatrician = Pediatrician;
        this.restriction = restriction;
     }

    public String toString(){
        return " ";
    }

    public boolean hasRestriction(Restriction restriction){
        return false;
    }


}
