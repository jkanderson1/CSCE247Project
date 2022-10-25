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
    public static ArrayList<Child> getAllChildren(){
    
        ArrayList<Child> childAL = new ArrayList<Child>();
        try {
           FileReader reader = new FileReader("Child.json");
           JSONArray childJsonArray = (JSONArray)new JSONParser().parse(reader);
           JSONParser parser = new JSONParser();
           for(int i =0; i<childJsonArray.size();i++)
           {
            JSONObject childJson = (JSONObject)childJsonArray.get(i);
            String childFirstName = (String)childJson.get("childFirstName");
            String childLastName = (String)childJson.get("childLastName");
            String childAge = (String)childJson.get("childAge");
            String restrictions = (String)childJson.get("restrictions");
            

            String address = (String)childJson.get("address");
            String emergencyContact = (String)childJson.get("emergencyContact");
            String emergencyContactNumber = (String)childJson.get("emergencyContactNumber");
            String guardian = (String)childJson.get("guardian");
            String pediatrician = (String)childJson.get("pediatrician");
            String pediatricianNumber = (String)childJson.get("pediatricianNumber");
            Child child = new Child(childFirstName, childLastName, childAge, restrictions, emergencyContact, emergencyContactNumber, pediatrician, pediatricianNumber);
            childAL.add(child);

           }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
      return childAL;
    

    }
    public ArrayList<Cabin> getAllCabins(){

        ArrayList<Cabin> cabinAL = new ArrayList<Cabin>();
        try {
            FileReader reader = new FileReader("Cabin.json");
            JSONArray cabinJsonArray = (JSONArray)new JSONParser().parse(reader);
           JSONParser parser = new JSONParser();
           for(int i = 0; i<cabinJsonArray.size(); i++)
           {
            JSONObject cabinJson = (JSONObject)cabinJsonArray.get(i);
            //Can we store a Counselor in JSON ? I think using the UUID like she said is the way to go. 
            //Counselor counselor = (Counselor)cabinJson.get("counselor");
            String counselorUUID = (String)cabinJson.get("UUID");
            String ageGroup = (String)cabinJson.get("ageGroup");
            Cabin cabin = new Cabin(ageGroup, counselorUUID);
            cabinAL.add(cabin);

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
        return cabinAL;
    }
    public static ArrayList<Parent> getAllParents(){

        ArrayList<Parent> parentAL = new ArrayList<Parent>();
        try{
            FileReader reader = new FileReader("Parent.json");
            JSONArray parentJsonArray = (JSONArray)new JSONParser().parse(reader);
            JSONParser parser = new JSONParser();
            for(int i = 0;i<parentJsonArray.size();i++){
                JSONObject parentJson = (JSONObject)parentJsonArray.get(i);
                String username = (String)parentJson.get("username");
                String password = (String)parentJson.get("password");
                String firstName = (String)parentJson.get("firstName");
                String lastName = (String)parentJson.get("lastName");
                String email = (String)parentJson.get("email");
                String number = (String)parentJson.get("number");
                String[] children = (String[])parentJson.get("children");
                String address = (String)parentJson.get("address");
                parentAL.add(new Parent(firstName, lastName, email, number, address));
            }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return parentAL;
    }
    public static ArrayList<Counselor> getAllCounselors(){

        ArrayList<Counselor> counselorAL = new ArrayList<Counselor>();
        try{
            FileReader reader = new FileReader("Counselor.json");
            JSONArray counselorJsonArray = (JSONArray)new JSONParser().parse(reader);
            JSONParser parser = new JSONParser();
            for(int i = 0;i<counselorJsonArray.size();i++){
                JSONObject counselorJson = (JSONObject)counselorJsonArray.get(i);
                String username = (String)counselorJson.get("username");
                String password = (String)counselorJson.get("password");
                String firstName = (String)counselorJson.get("FirstName");
                String lastName = (String)counselorJson.get("LastName");
                String CounselorDOB = (String)counselorJson.get("CounselorDOB");
                String address = (String)counselorJson.get("address");
                String emergencyContact = (String)counselorJson.get("emergencyContact");
                String emergencyContactNumber = (String)counselorJson.get("emergencyContactNumber");
                String restrictions = (String)counselorJson.get("restrictions");
                counselorAL.add(new Counselor( firstName, lastName, CounselorDOB, address, emergencyContact, emergencyContactNumber, restrictions));
            }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return counselorAL;
    }

}

