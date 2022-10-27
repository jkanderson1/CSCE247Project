import java.util.UUID;

public class Contact {
    public String firstname;
    public String lastname;
    public String phonenumber;
    public String address;
    public UUID contactID;

    public Contact(String firstname,String lastname,String phonenumber,String address){
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
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
        return this.phonenumber;
    }

    public String getaddress()
    {
        return this.address;
    }

    public String getContactUUID()
    {
        return this.contactID.toString();
    }

}
