public class Child implements Parent{
    public String childFirstname;
    public String childLastname;
    public String childDOB;
    public Contact EmergencyContact;
    public Contact Pediatrician;
    public Restriction restriction;
    //might remove restrictions;

    public Child(String childFirstname, String childLastname, String childDOB, Restriction restriction, Contact EmergencyContact, Contact Pediatrician){
        this.childFirstname = childFirstname;
        this.childLastname = childLastname;
        this.childDOB = childDOB;
        this.restriction = restriction;
        this.EmergencyContact = EmergencyContact;
        this.Pediatrician = Pediatrician;
    }

    public String toString(){
        return childFirstname+ childLastname+ childDOB+ restriction+ EmergencyContact+ Pediatrician;
    }

    public boolean hasRestriction(Restriction restriction){
        if (restriction!= null){
            return true;
        }
        else return false;
    }


}
