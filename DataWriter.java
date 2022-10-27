//Written by Walker Bowen
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.json.simple.*;

public class DataWriter {

public boolean saveAllChildren(ArrayList<Child> children)
{
    JSONArray jsonChildren = new JSONArray();
    for (int i = 0; i<children.size(); i++) 
    {
        
        jsonChildren.add(getChildJSON(children.get(i)));

    }
    try(FileWriter childFile = new FileWriter("Child.json"))
    {
        childFile.write(jsonChildren.toJSONString());
        childFile.flush();
        return true;
        
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        return false;
    }


   

    
}
public static JSONObject getChildJSON(Child child)
{
    JSONObject childDetails = new JSONObject();
    childDetails.put("childFirstName",child.childFirstname);
    childDetails.put("childLastName", child.childLastname);
    childDetails.put("childAge", child.childDOB);
    childDetails.put("restrictions", child.restriction);
    childDetails.put("emergencyContact", child.EmergencyContact.firstname+" "+child.EmergencyContact.lastname);
    childDetails.put("emergencyContactNumber", child.EmergencyContact.number);
    childDetails.put("pediatrician", child.Pediatrician.firstname+" "+child.Pediatrician.lastname);
    childDetails.put("pediatricianNumber", child.Pediatrician.number);
    childDetails.put("UUID", child.childID.toString());
    
    return childDetails;

}

public boolean saveAllCabins(ArrayList<Cabin> cabins)
{
    JSONArray jsonCabin = new JSONArray();
    for (int i = 0; i<cabins.size(); i++) 
    {
        
        jsonCabin.add(getCabinJSON(cabins.get(i)));

    }
    try(FileWriter cabinFile = new FileWriter("Cabin.json"))
    {
        cabinFile.write(jsonCabin.toJSONString());
        cabinFile.flush();
        return true;
        
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        return false;
    }
    
}

public static JSONObject getCabinJSON(Cabin cabin)
{

    JSONObject cabinDetails = new JSONObject();
    cabinDetails.put("cabinNumber", cabin.cabinNumber);
    cabinDetails.put("counselor", cabin.counselor.getFirstName()+" "+cabin.counselor.getLastName());
    cabinDetails.put("ageGroup", Integer.toString(cabin.minAge)+"-"+Integer.toString(cabin.maxAge));
    // creating String array to put into json 
    String[] childrenArray = new String[cabin.children.size()];
    for (int i =0; i<childrenArray.length; i++)
    {
        childrenArray[i]=cabin.children.get(i).childFirstname+" "+cabin.children.get(i).childLastname;
    }
    

    cabinDetails.put("children", childrenArray);
    cabinDetails.put("schedule", //Do not know what to do with Scedule bc Schedule is not done//)
    cabinDetails.put("session", cabin.session);
    cabinDetails.put("UUID", cabin.cabinID.toString());

    return cabinDetails;


}

public boolean saveAllContacts(ArrayList<Contact> contacts)
{
    JSONArray jsonContact = new JSONArray();
    for (int i = 0; i<contacts.size(); i++) 
    {
        
        jsonContact.add(getContactJSON(contacts.get(i)));

    }
    try(FileWriter contactFile = new FileWriter("Cabin.json"))
    {
        contactFile.write(jsonContact.toJSONString());
        contactFile.flush();
        return true;
        
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        return false;
    }
}
public JSONObject getContactJSON(Contact contact)
{
    JSONObject contactJson = new JSONObject();
    contactJson.put("FirstName", contact.firstname );
    contactJson.put("LastName", contact.lastname);
    contactJson.put("Number", contact.number );
    contactJson.put("Address", contact.address);

    return contactJson;
}

public boolean saveAllCounselors(ArrayList<Counselor> counselors)
{

}

public boolean saveAllDirectors(ArrayList<Director> directors)
{

}

public boolean saveAllParents(ArrayList<Parent> parents)
{

}
}
