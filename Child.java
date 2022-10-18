public class Child {
    public String childFirstname;
    public String childLastname;
    public String childDOB;
    public Contact EmergencyContact;
    public Contact Pediatrician;

    public Child(String childFirstName, String childLastname, String childDOB, Contact EmergencyContact, Contact Pediatrician){

    }

    public String toString(){
        return " ";
    }

    public boolean hasRestriction(Restriction restriction){
        return false;
    }






}
