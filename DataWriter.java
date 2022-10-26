//Written by Walker Bowen
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.json.simple.*;

public class DataWriter {

public boolean saveAllChildren(ArrayList<Child> children)
{
    java.util.Iterator<Child> iterator = children.iterator();
   while(iterator.hasNext())
   {
    Child child = iterator.next();
    JSONObject jsonChild = new JSONObject();
    jsonChild.put("childFirstname",child.childFirstname);
    jsonChild.put("childLastName", child.childLastname);
    jsonChild.put("childDOB", child.childDOB);
    //converting ArrayList to JSONArray

    JSONArray jsonRestrictions = new JSONArray();
    
    java.util.Iterator<String> restrictionIterator = child.restriction.iterator();
    while(restrictionIterator.hasNext())
    {
        restrictionsAL.add(restrictionIterator.next());
        
    }


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
