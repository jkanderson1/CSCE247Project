//written by Walker Bowen
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class DataReader {
    JSONParser parser = new JSONParser();
    public static ArrayList<Director> getAllDirectors(){
        /*
         * why does director.json have all of this stuff if the director only has a children and parentname arraylist. 
         * 
         */
        ArrayList<Director> directorAL = new ArrayList<Director>(); 
       try {
         FileReader reader = new FileReader("Director.json");
         JSONParser parser = new JSONParser();
        JSONArray directorJsonArray = (JSONArray)new JSONParser().parse(reader);
        for (int i = 0; i<directorJsonArray.size(); i++){
            JSONObject directorJson = (JSONObject)directorJsonArray.get(i);
            String username = (String)directorJson.get("username");
            String password = (String)directorJson.get("password");
            String firstName = (String)directorJson.get("firstName");
            String lastName = (String)directorJson.get("lastName");
            String emergencyContact = (String)directorJson.get("emergencyContact");
            JSONArray restrictions = (JSONArray)directorJson.get("restrictions");
            ArrayList<String> restrictionsAL = new ArrayList<String>();

            Iterator iterator = restrictions.iterator();

            while(iterator.hasNext())
            {
                restrictionsAL.add((String)iterator.next());
            }

            Director director = new Director(username, password, firstName, lastName, emergencyContact, restrictionsAL);
            directorAL.add(director);
        }
       

    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return directorAL; 
    }
    public ArrayList<Child> getAllChildren(){
        FileReader reader;
        try {
            reader = new FileReader("Child.json");
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        JSONParser parser = new JSONParser();
       try {
        JSONArray directorJsonArray = (JSONArray)new JSONParser().parse(reader);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (ParseException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    }
    public ArrayList<Cabin> getAllCabins(){
        return null;
        
    }
}
