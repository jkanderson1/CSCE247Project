
import java.util.ArrayList;
import java.util.UUID;

/**
 * Contact class that stores the necessary properties ofa  contact
 */
public class Contact {
    public String firstname;
    public String lastname;
    public String number;
    public String address;
    public UUID contactID;

    /**
     * Creating a contact with the following parameters
     * @param firstname first name of the counselor
     * @param lastname last name of the counselor
     * @param number counselors phone number
     * @param address counselors address
     */
    public Contact(String firstname,String lastname,String number,String address){
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
        this.address = address;
    }


    /**
     * get first name method that returns the contacts first name
     * @return contacts first name
     */
    public String getfirstname()
    {
        return this.firstname;
    }

    /**
     * get last name method that returns the contacts last name
     * @return contacts last name
     */
    public String getlastname()
    {
        return this.lastname;
    }


    /**
     * get  number method that returns the contacts phone number
     * @return contacts phone number
     */
    public String getphonenumber()
    {
        return this.number;
    }


    /**
     * get address method that returns the contacts address
     * @return contacts address
     */
    public String getaddress()
    {
        return this.address;
    }


    /**
     * get UUIDmethod that returns the contacts UUID
     * @return counselor UUID
     */
    public String getContactUUID()
    {
        return this.contactID.toString();
    }

    /**
     * to string method that returns the defining string for the contact
     * @return the first name, last name, number, and address of the contact
     */
    public String toString(){
        return this.firstname+" "+this.lastname+" "+this.number+" "+this.address;

    }
}
