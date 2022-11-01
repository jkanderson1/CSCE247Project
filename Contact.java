
import java.util.ArrayList;
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


    public String getfirstname()
    {
        return this.firstname;
    }

    public String getlastname()
    {
        return this.lastname;
    }

    public String getphonenumber()
    {
        return this.number;
    }

    public String getaddress()
    {
        return this.address;
    }

    public String getContactUUID()
    {
        return this.contactID.toString();
    }

    public String toString(){
        return this.firstname+" "+this.lastname+" "+this.number+" "+this.address;
    }
}
