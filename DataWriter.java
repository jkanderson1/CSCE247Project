//Written by Walker Bowen
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
    cabinDetails.put("schedule",null /*Do not know what to do with Scedule bc Schedule is not done*/);
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
    JSONArray jsonCounselor = new JSONArray();
    for (int i = 0; i<counselors.size(); i++) 
    {
        
        jsonCounselor.add(getCounselorJSON(counselors.get(i)));

    }
    try(FileWriter counselorFile = new FileWriter("Counselor.json"))
    {
        counselorFile.write(jsonCounselor.toJSONString());
        counselorFile.flush();
        return true;
        
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        return false;
    }

}

public JSONObject getCounselorJSON(Counselor counselor)
{
    JSONObject counselorJson = new JSONObject();
    counselorJson.put("username", counselor.username);
    counselorJson.put("password", counselor.password);
    counselorJson.put("FirstName", counselor.getFirstName());
    counselorJson.put("LastName", counselor.getLastName());
    counselorJson.put("counselorDOB", counselor.getCounselorDOB());
    counselorJson.put("address", counselor.getAddress());
    counselorJson.put("emergencyContact", counselor.getEmergencyContact().firstname+" "+counselor.getEmergencyContact().lastname);
    counselorJson.put("emergencyContactNumber", counselor.getEmergencyContact().number);
    counselorJson.put("restrictions", counselor.getRestriction());
    counselorJson.put("UUID", counselor.getCounselorID().toString());

    return counselorJson;
}

public boolean saveAllDirectors(ArrayList<Director> directors)
{
    JSONArray jsonDirectors = new JSONArray();
    for (int i = 0; i<directors.size(); i++) 
    {
        
        jsonDirectors.add(getDirectorJSON(directors.get(i)));

    }
    try(FileWriter directorFile = new FileWriter("Director.json"))
    {
        directorFile.write(jsonDirectors.toJSONString());
        directorFile.flush();
        return true;
        
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        return false;
    }
}
public JSONObject getDirectorJSON(Director director)
{
    JSONObject directorJson = new JSONObject();
    directorJson.put("username", director.getUsername());
    directorJson.put("password", director.getPassword());
    directorJson.put("firstName", director.getFirstName());
    directorJson.put("lastName", director.getLastName());
    directorJson.put("emergencyContact", director.getEContactID());
    //making restrictions into a String array
    String[] restrictionsArray = new String[director.getRestrictions().size()];
    for (int i = 0; i<restrictionsArray.length; i++)
    {
        restrictionsArray[i]= director.getRestrictions().get(i);
    }
    directorJson.put("restrictions", restrictionsArray);
    directorJson.put("UUID", director.getDirectorID());

    return directorJson;
}

public boolean saveAllParents(ArrayList<Parent> parents)
{
    JSONArray jsonParents = new JSONArray();
    for (int i = 0; i<parents.size(); i++) 
    {
        
        jsonParents.add(getParentJSON(parents.get(i)));

    }
    try(FileWriter parentFile = new FileWriter("Parent.json"))
    {
        parentFile.write(jsonParents.toJSONString());
        parentFile.flush();
        return true;
        
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        return false;
    }
}

public JSONObject getParentJSON(Parent parent)
{
    JSONObject parentJson = new JSONObject(); 
    parentJson.put("username", parent.username);
    parentJson.put("password", parent.password);
    parentJson.put("firstName", parent.firstName);
    parentJson.put("lastName", parent.lastName);
    parentJson.put("email", parent.email);
    parentJson.put("number", parent.number);
    //making array to put into json 
    String[] children = new String[parent.children.size()];
    for (int i = 0; i<children.length; i++ )
    {
        children[i] = parent.children.get(i);

    }
    parentJson.put("children", children);
    parentJson.put("UUID", parent.parentID.toString());

    return parentJson;
}

    public static void main(String[] args){
        System.out.println("Hello");
    }

}
