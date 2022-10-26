//Written by Walker Bowen
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.json.simple.*;

public class DataWriter {

public boolean saveAllChildren(ArrayList<Child> children)
{FileWriter childFile = new FileWriter("Child.json");
    java.util.Iterator<Child> iterator = children.iterator();
   while(iterator.hasNext())
   {
    Child child = iterator.next();
    JSONObject jsonChild = new JSONObject();
    jsonChild.put("childFirstname",child.childFirstname);
    jsonChild.put("childLastName", child.childLastname);
    jsonChild.put("childDOB", child.childDOB);
    jsonChild.put("restriction", child.restriction);
    //need to create new pediatricianArray for contacts
    JSONArray pediatricianArray = new JSONArray();
    pediatricianArray.add("firstname:"+" "+child.Pediatrician.firstname);
    pediatricianArray.add("lastname:"+" "+child.Pediatrician.lastname);
    pediatricianArray.add("number:"+" "+child.Pediatrician.number);
    pediatricianArray.add("address:"+" "+child.Pediatrician.address);

    jsonChild.put("pediatrician", pediatricianArray);

    JSONArray EContactArray = new JSONArray();

    EContactArray.add("firstname:"+" "+child.EmergencyContact.firstname);
    EContactArray.add("lastname:"+" "+child.EmergencyContact.lastname);
    EContactArray.add("number:"+" "+child.EmergencyContact.number);
    EContactArray.add("address:"+" "+child.EmergencyContact.address);
    
    jsonChild.put("emergencyContact", EContactArray);

    childFile.write(jsonChild.toJSONString());

    }
    childFile.close();
    return true; 


   }

    
}

public boolean saveAllCabins(ArrayList<Cabin> cabins)
{
    
    
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
