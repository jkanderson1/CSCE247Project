//Written by Walker Bowen
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter {
static ArrayList<Director> directors;

/**
 * @param children
 * @return a boolean indicating if the children ArrayList got saved
 */
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
/**
 * @param child
 * @return A JSONObject for the saveAllChildren method to use
 */
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


/**
 * @param cabins
 * @return a boolean indicating if saving to the Cabin.json was succesful
 */
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

/**
 * @param cabin
 * @return a JSONObject that the saveAllCabins method uses to store the cabins
 */
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

/**
 * @param contacts
 * @return a boolean indicating if the save to Contact.json was succesful
 */
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

/**
 * @param contact
 * @return a JSONObject for the saveAllContacts to use
 */
public JSONObject getContactJSON(Contact contact)
{
    JSONObject contactJson = new JSONObject();
    contactJson.put("FirstName", contact.firstname );
    contactJson.put("LastName", contact.lastname);
    contactJson.put("Number", contact.number );
    contactJson.put("Address", contact.address);

    return contactJson;
}

/**
 * @param counselors
 * @return a boolean indicating if the Counselor.json save was succesfull
 */
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

/**
 * @param counselor
 * @return a JSONObject for the saveAllCounselors method to use
 */
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

/**
 * @param cabin
 * prints the contents of a cabin to a .txt file
 */
public static void cabinToTXT(Cabin cabin)
{
    File counselorFile = new File("C:\\Users\\walke\\Documents\\CSCE247Project\\counselor.txt");
    try {
        PrintWriter out = new PrintWriter("C:\\Users\\walke\\Documents\\CSCE247Project\\counselor.txt");
        out.println("Counselor:");
        out.println(cabin.counselor.toString());
        out.println("Children:");
        ArrayList<Child> childList = cabin.collection.getAllChildren();
        for(int i = 0; i<childList.size(); i++)
        {
            out.println(childList.get(i).toString());
        }
        out.close();

    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

}

/**
 * @param directors
 * @return a boolean indicating if the save to Director.json 
 */
public static boolean saveAllDirectors(ArrayList<Director> directors)
{
    JSONArray jsonDirectors = new JSONArray();
    for (int i = 0; i<directors.size(); i++) 
    {
        jsonDirectors.set(i, directors.get(i));

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
/**
 * @param director
 * @return a JSONObject for the saveAllDirectors method
 */
public JSONObject getDirectorJSON(Director director)
{
    JSONObject directorJson = new JSONObject();
    directorJson.put("username", director.getUsername());
    directorJson.put("password", director.getPassword());
    directorJson.put("firstName", director.getFirstName());
    directorJson.put("lastName", director.getLastName());
    directorJson.put("emergencyContact", director.getEContactID());
    directorJson.put("restrictions", director.getRestrictions());
    
    directorJson.put("UUID", director.getDirectorID());

    return directorJson;
}

/**
 * @param parents
 * @return a boolean indicating if the save to Parent.json was succesful 
 */
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

/**
 * @param parent
 * @return a JSONObject for 
 */
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
        directors = DataReader.getAllDirectors();
        ArrayList<String> restrictions = new ArrayList<String>();
        restrictions.add("gluten");
        saveAllDirectors(directors);
    }

}
