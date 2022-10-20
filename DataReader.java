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
    public ArrayList<Director> getAllDirectors(){
        
       try {
        Object obj = parser.parse(new FileReader("Director.json"));
        JSONArray directorJsonArray = (JSONArray)obj;
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

            while()
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
        
    }
    public ArrayList<Child> getAllChildren(){
        return null;

    }
    public ArrayList<Cabin> getAllCabins(){
        return null;
        
    }
}
