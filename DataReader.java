//written by Walker Bowen
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.spec.EdDSAParameterSpec;
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
         FileReader reader = new FileReader("jsons/Director.json");
         JSONParser parser = new JSONParser();
        JSONArray directorJsonArray = (JSONArray)new JSONParser().parse(reader);
        for (int i = 0; i<directorJsonArray.size(); i++){
            JSONObject directorJson = (JSONObject)directorJsonArray.get(i);
            String username = (String)directorJson.get("username");
            String password = (String)directorJson.get("password");
            String firstName = (String)directorJson.get("firstName");
            String lastName = (String)directorJson.get("lastName");
            JSONObject emergencyContact = (JSONObject)directorJson.get("emergencyContact");
            String eCFirstName = (String)directorJson.get("firstName");
            String eCLastName = (String)directorJson.get("lastName");
            String eCNumber = (String)directorJson.get("number");
            String eCAddress = (String)directorJson.get("address");
            Contact eContact = new Contact(eCFirstName, eCLastName, eCNumber, eCAddress);
            JSONArray restrictions = (JSONArray)directorJson.get("restrictions");
            UUID directorID = (UUID)directorJson.get("UUID");
            ArrayList<String> restrictionsAL = new ArrayList<String>();

            Iterator restrictionsIterator = restrictions.iterator();

            while(restrictionsIterator.hasNext())
            {
                restrictionsAL.add((String)restrictionsIterator.next());
            }

            Director director = new Director(username, password, firstName, lastName, eContact, restrictionsAL, directorID);
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
           FileReader reader = new FileReader("jsons/Child.json");
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
            
            
            //loop through the json array
     
            
                JSONObject EContactJson = (JSONObject)childJson.get("emergencyContacts");
                String FirstName = (String)EContactJson.get("FirstName");
                String LastName = (String)EContactJson.get("LastName");
                String Number = (String)EContactJson.get("Number");
                String Address = (String)EContactJson.get("Address");
                Contact Econtact = new Contact(FirstName, LastName, Number, Address);
                

                
            
            JSONObject pediatricianJson = (JSONObject) childJson.get("pediatrician");
            String pFirstName = (String) pediatricianJson.get("FirstName");
            String pLastName = (String) pediatricianJson.get("LastName");
            String pNumber = (String) pediatricianJson.get("Number");
            String pAddress = (String) pediatricianJson.get("Address");
            
            Contact pediatrician = new Contact (pFirstName, pLastName, pNumber, pAddress);
            //read each json object

            //read the properties of each json object
            //build a Contact object
            Child child = new Child(childFirstName, childLastName, childAge, restrictions, Econtact, pediatrician);
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
    public static ArrayList<Cabin> getAllCabins(){

        ArrayList<Cabin> cabinAL = new ArrayList<Cabin>();
        try {
            FileReader reader = new FileReader("jsons/Cabin.json");
            JSONArray cabinJsonArray = (JSONArray)new JSONParser().parse(reader);
           JSONParser parser = new JSONParser();
           for(int i = 0; i<cabinJsonArray.size(); i++)
           {
            JSONObject cabinJson = (JSONObject)cabinJsonArray.get(i);
            //Can we store a Counselor in JSON ? I think using the UUID like she said is the way to go. 
            
            JSONObject counselorJson = (JSONObject)cabinJson.get("counselor");
            //making counselor object to pass into the constructor
            String counselorUsername = (String)counselorJson.get("username");
            String counselorPassword = (String)counselorJson.get("password");
            String counselorFirstName = (String)counselorJson.get("FirstName");
            String counselorLastName = (String)counselorJson.get("LastName");
            String counselorDOB = (String)counselorJson.get("counselorDOB");
            String counselorAddress = (String)counselorJson.get("address");
            //making Contact object to put into counselor object
            JSONObject counselorEcontact = (JSONObject)counselorJson.get("emergencyContact");
            String CEFirstName = (String)counselorEcontact.get("FirstName");
            String CELastName = (String)counselorEcontact.get("LastName");
            String CENumber = (String)counselorEcontact.get("Number");
            String CEAddress = (String)counselorEcontact.get("Address");

            Contact CEContact = new Contact(CEFirstName, CELastName, CENumber, CEAddress);
            //constructing Counselor
            
            String counselorRestrictions = (String)counselorJson.get("restrictions");
            String counselorUUID = (String)counselorJson.get("UUID");
            Long minAge=(Long)cabinJson.get("minAge");
            Long maxAge=(Long)cabinJson.get("maxAge");
            int minAgeINT = minAge.intValue();
            int maxAgeINT = maxAge.intValue();
          
            Long session = (Long)cabinJson.get("session");
            int sessionINT = session.intValue();
            //String ageGroup = (String)cabinJson.get("ageGroup");
            
            //Cabin and Counselor both need eachother to be constructed :/
            Counselor counselor = new Counselor(counselorFirstName, counselorLastName, counselorDOB, counselorAddress, CEContact, counselorRestrictions, counselorUsername, counselorPassword);
            
            Cabin cabin = new Cabin(maxAgeINT,minAgeINT,counselorUUID,counselor,sessionINT);
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
            FileReader reader = new FileReader("jsons/Parent.json");
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
                String address = (String)parentJson.get("address");
                JSONArray childJSONArray = (JSONArray) parentJson.get("children");
                ArrayList<Child> childrenAL = new ArrayList<Child>();
                for(int o = 0; o<childJSONArray.size(); o++)
                {
                    JSONObject childJson = (JSONObject)childJSONArray.get(o);
                    String childFirstName = (String)childJson.get("childFirstName");
                    String childLastName = (String)childJson.get("childLastName");
                    String childAge = (String)childJson.get("childAge");
                    String childRestrictions = (String)childJson.get("restrictions");
                    //emergencyContact Object
                    JSONObject eContactJson = (JSONObject)childJson.get("emergencyContact");
                    String EContactFirstName = (String)eContactJson.get("FirstName");
                    String EContactLastName = (String)eContactJson.get("LastName");
                    String EContactNumber = (String)eContactJson.get("Number");
                    String EContactAddress = (String)eContactJson.get("Address");
                    Contact Econtact = new Contact(EContactFirstName, EContactLastName, EContactNumber, EContactAddress);
                    //pediatrician Object
                    JSONObject pediatricianJson = (JSONObject)childJson.get("pediatrician");
                    String pFirstName = (String)pediatricianJson.get("FirstName");
                    String pLastName = (String)pediatricianJson.get("LastName");
                    String pNumber = (String)pediatricianJson.get("Number");
                    String pAddress = (String)pediatricianJson.get("Address");
                    Contact pediatrician = new Contact(pFirstName, pLastName, pNumber, pAddress);
                    Child child = new Child(childFirstName, childLastName, childAge, childRestrictions, Econtact, pediatrician);

                }
                parentAL.add(new Parent(username, password, firstName, lastName, email, number, address, childrenAL));
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
            FileReader reader = new FileReader("jsons/Counselor.json");
            JSONArray counselorJsonArray = (JSONArray)new JSONParser().parse(reader);
            JSONParser parser = new JSONParser();
            for(int i = 0;i<counselorJsonArray.size();i++){
                JSONObject counselorJson = (JSONObject)counselorJsonArray.get(i);
                Cabin cabin = (Cabin)counselorJson.get("cabin");
                String username = (String)counselorJson.get("username");
                String password = (String)counselorJson.get("password");
                String firstName = (String)counselorJson.get("FirstName");
                String lastName = (String)counselorJson.get("LastName");
                String CounselorDOB = (String)counselorJson.get("CounselorDOB");
                String address = (String)counselorJson.get("address");
                JSONObject emergencyContact = (JSONObject)counselorJson.get("emergencyContact");
                String ECFirstName = (String)emergencyContact.get("FirstName");
                String ECLastName = (String)emergencyContact.get("LastName");
                String ECNumber = (String)emergencyContact.get("Number");
                String ECAddress = (String)emergencyContact.get("Address");
                Contact counselorEContact = new Contact(ECFirstName, ECLastName, ECNumber, ECAddress);
                //String emergencyContactNumber = (String)counselorJson.get("emergencyContactNumber");
                String restrictions = (String)counselorJson.get("restrictions");
                counselorAL.add(new Counselor(firstName, lastName, CounselorDOB, address, counselorEContact, restrictions, username, password));
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

    public static void main(String[] args){
        ArrayList<Cabin> cabins = DataReader.getAllCabins();

        for(Cabin cabin : cabins){
            cabin.fillCabin();
            System.out.println(cabin);
        }
    }

}

