import java.util.UUID;

public class Contact {
    public String firstname;
    public String lastname;
    public String number;
    public String address;
    public UUID contactID;

    public Contact(String firstname,String lastname,String number,String address){
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
        this.address = address;
    }
}
