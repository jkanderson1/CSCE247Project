import java.util.ArrayList;
import java.util.HashMap;

public class Schedule{
    public ArrayList<Activities> Activities = new ArrayList<Activities>();
    private HashMap <Days,ArrayList<Activities>>ActivitiesHMap = new HashMap <Days,ArrayList<Activities>>();
   
    public void makeScheduleOne(){
        ActivitiesHMap.put(Days.Monday, new ArrayList<Activities>());
        ActivitiesHMap.put(Days.Tuesday, new ArrayList<Activities>());
        ActivitiesHMap.put(Days.Wednesday, new ArrayList<Activities>());
        ActivitiesHMap.put(Days.Thursday, new ArrayList<Activities>());
        ActivitiesHMap.put(Days.Friday, new ArrayList<Activities>());
        
    }

    public void makeScheduleTwo(){
        ActivitiesHMap.put(Days.Monday, new ArrayList<Activities>());
        ActivitiesHMap.put(Days.Tuesday, new ArrayList<Activities>());
        ActivitiesHMap.put(Days.Wednesday, new ArrayList<Activities>());
        ActivitiesHMap.put(Days.Thursday, new ArrayList<Activities>());
        ActivitiesHMap.put(Days.Friday, new ArrayList<Activities>());
    }

}


