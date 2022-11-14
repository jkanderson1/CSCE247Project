import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class DataReaderTest {
    
    @BeforeClass
    public static void oneTimeSetup()
    {

    }

    @AfterClass
    public static void oneTimeTearDown()
    {

    }

    @BeforeEach
    public static void setup()
    {

    }
    @AfterEach
    public static void tearDown()
    {

    }

    @Test
    public void testGetAllDirectors()
    {
        //I am changing the file in the DataReader class to a test Json
        Director directorFact = new Director("testUsername","testPassword","testFirstName","testLastName",new Contact("testContactFirstName","testContactLastName","testContactNumber","testContactAddress"),"testRestrictions");
        ArrayList<Director> testDirector = DataReader.getAllDirectors();
        assertEquals(directorFact, testDirector.get(0));
    }

    @Test
    public void testGetAllChildren()
    {
        Child childFact = new Child("testFirstName", "testLastName", "testDOB", "testRestriction",new Contact("testECFirstName","testECLastName","testECNumber","testECAddress") , new Contact("testPFirstName","testPLastName","testPNumber","testPAddress"));
        ArrayList<Child> testChild = DataReader.getAllChildren();
        assertEquals(childFact, testChild.get(0));
    }
    @Test
    public void testGetAllCabins()
    {
        Cabin cabinFact = new Cabin(10, 4,"testUUID",new Counselor("testCFirstName", "testCLastName", "testCDOB", "testCAddress", new Contact("testECFirstName","testECLastName","testECNumber","testECAddresss"), "testCRestriction", "testCUsername", "testCPassword"),1,1,"testSchedule",new ArrayList<Child>());
        ArrayList<Cabin> testCabin = DataReader.getAllCabins();
        assertEquals(cabinFact.toString(), testCabin.get(0));
    }
    @Test
    public void testGetAllParents()
    {
        Parent parentFact = new Parent("testUsername","testPassword","testFirstName","testLastName","testEmail","testNumber","testAddress",null);
        ArrayList<Parent> testParent = DataReader.getAllParents();
        assertEquals(parentFact,testParent.get(0));
    }
    @Test
    public void testGetAllCounselors()
    {
        Counselor counselorFact = new Counselor("testFirstName", "testLastName", "testDOB", "testAddress", new Contact("testECFirstName","testECLastName","testECNumber", "testECAddress"), "testRestriction", "testUsername", "testPassword");
        ArrayList<Counselor> testCounselor = DataReader.getAllCounselors();
        assertEquals(counselorFact,testCounselor.get(0));
    }
}
