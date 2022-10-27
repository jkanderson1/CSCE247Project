import java.util.ArrayList;
import java.util.HashMap;

public class Schedule{
    public ArrayList<ChildActivities> ChildActivities = new ArrayList<ChildActivities>();
    public ArrayList<TeenActivities> TeenActivities = new ArrayList<TeenActivities>();
    private HashMap <Days,ArrayList<ChildActivities>>ChildHMap = new HashMap <Days,ArrayList<ChildActivities>>();
    private HashMap <Days,ArrayList<TeenActivities>>TeenHMap = new HashMap <Days,ArrayList<TeenActivities>>();


    public String toString()
    {
        //ToString
        return "";
    }

    private void makeChildSchedule(){
        ArrayList<ChildActivities> list = makeChildDaySchedule();
        for (Days day : Days.values()) { 
            ChildHMap.put(Days.Monday, list);
            //either loop through or repeat the above line for each day
        }
        ArrayList<ChildActivities> list2 = makeChildNightSchedule();
        for (Days day : Days.values()) { 
            ChildHMap.put(Days.Monday, list);
        }
        ArrayList<TeenActivities> list3 = makeTeenDaySchedule();
        for (Days day : Days.values()) { 
            TeenHMap.put(Days.Monday, list);
        }
        ArrayList<TeenActivities> list4 = makeTeenNightSchedule();
        for (Days day : Days.values()) { 
            TeenHMap.put(Days.Monday, list);
        }
    }

    private ArrayList<ChildActivities> makeChildDaySchedule(){
        ArrayList<ChildActivities> activities = new ArrayList<ChildActivities>();
        activities.add(null);
        return activities;
    }

    private ArrayList<ChildActivities> makeChildNightSchedule(){
        ArrayList<ChildActivities> activities = new ArrayList<ChildActivities>();
        activities.add(null);
        return activities;
    }

    private ArrayList<TeenActivities> makeTeenDaySchedule(){
        ArrayList<TeenActivities> activities2 = new ArrayList<TeenActivities>();
        activities2.add(null);
        return activities2;
    }
    private ArrayList<TeenActivities> makeTeenNightSchedule(){
        ArrayList<TeenActivities> activities2 = new ArrayList<TeenActivities>();
        activities2.add(null);
        return activities2;
    }


}