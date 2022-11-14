import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class DataWriterTest {
    private ArrayList<Director> directorList = new ArrayList<Director>();

    @BeforeEach
    public void setup()
    {
        directorList = new ArrayList<Director>();
    }
    @AfterEach
    public void tearDown()
    {
        directorList = new ArrayList<Director>();
    }
    @Test
    public void testWritingZeroDirectors()
    {
        directorList = DataReader.getAllDirectors();
        assertEquals(0, directorList.size());

    }
    @Test
    public void testWritingOneDirector()
    {
        directorList.add(new Director("testUsername", "testPword", "testFname", "testLastName", null,"testRestrictions"));
        DataWriter.saveAllDirectors(directorList);
        assertEquals("testUsername", DataReader.getAllDirectors().get(0).getUsername());

    }
    @Test
    public void testWritingFiveUsers()
    {
        directorList.add(new Director("testUsername", "testPword", "testFname", "testLastName", null,"testRestrictions"));
        directorList.add(new Director("testUsername", "testPword", "testFname", "testLastName", null,"testRestrictions"));
        directorList.add(new Director("testUsername", "testPword", "testFname", "testLastName", null,"testRestrictions"));
        directorList.add(new Director("testUsername", "testPword", "testFname", "testLastName", null,"testRestrictions"));
        directorList.add(new Director("testUsername", "testPword", "testFname", "testLastName", null,"testRestrictions"));
        DataWriter.saveAllDirectors(directorList);
        assertEquals("testUsername", DataReader.getAllDirectors().get(4).getUsername());
    }
    @Test
    public void testWritingEmptyDirector()
    {
        directorList.add(new Director("","","","",null,""));
        DataWriter.saveAllDirectors(directorList);
        assertEquals("", DataReader.getAllDirectors().get(0).getUsername());
    }
    @Test
    public void testWritingNullDirector()
    {
        directorList.add(new Director(null, null, null, null, null, null));
        DataWriter.saveAllDirectors(directorList);
        assertEquals(null, DataReader.getAllDirectors().get(0).getUsername());
    }
    

    

}
