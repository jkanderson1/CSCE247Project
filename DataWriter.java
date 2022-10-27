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
    
    
}

public static JSONObject getCabinJson()
{
    JSONObject cabinDetails = new JSONObject();

}

public boolean saveAllContacts(ArrayList<Contact> contacts)
{

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
