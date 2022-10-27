import java.util.ArrayList;
import java.util.HashMap;

public class Schedule{
    public ArrayList<ChildActivities> ChildActivities = new ArrayList<ChildActivities>();
    public ArrayList<TeenActivities> TeenActivities = new ArrayList<TeenActivities>();
    private HashMap <Days,ArrayList<ChildActivities>>ChildHMap = new HashMap <Days,ArrayList<ChildActivities>>();
    private HashMap <Days,ArrayList<TeenActivities>>TeenHMap = new HashMap <Days,ArrayList<TeenActivities>>();
}

public String toString()
{
    //ToString
}