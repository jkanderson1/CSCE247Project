import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.random.*;

public class Schedule{
    public ArrayList<Activities> ActivitiesAL = new ArrayList<Activities>();
    private HashMap <Days,ArrayList<Activities>>ActivitiesHMap = new HashMap <Days,ArrayList<Activities>>();
    
   
    public void makeScheduleOne(){
        Random rand = new Random();
        ArrayList<Activities> mondayActivities = new ArrayList<Activities>();
        int pick = rand.nextInt(Activities.values().length);
        Activities activity1 = Activities.values()[pick];
        if(activity1.equals(Activities.Breakfast)||activity1.equals(Activities.Lunch)||activity1.equals(Activities.Dinner))
        {
            pick = pick + 3;
            activity1 = Activities.values()[pick];

        }
        pick = rand.nextInt(Activities.values().length);
        Activities activity2 = Activities.values()[pick];
        //checks to make sure they are not the same Activities
        while(activity1.equals(activity2))
        {
            pick = rand.nextInt(Activities.values().length);
            activity2 = Activities.values()[pick];
        }
        if(activity2.equals(Activities.Breakfast)||activity2.equals(Activities.Lunch)||activity2.equals(Activities.Dinner))
        {
            pick = pick + 3;
            activity2 = Activities.values()[pick];

        }
        mondayActivities.add(Activities.Breakfast);
        mondayActivities.add(activity1);
        mondayActivities.add(Activities.Lunch);
        mondayActivities.add(activity2);
        mondayActivities.add(Activities.Dinner);


        ActivitiesHMap.put(Days.Monday, mondayActivities);
        ArrayList<Activities> tuesdayActivities = new ArrayList<Activities>();
        pick = rand.nextInt(Activities.values().length);
        activity1 = Activities.values()[pick];
        if(activity1.equals(Activities.Breakfast)||activity1.equals(Activities.Lunch)||activity1.equals(Activities.Dinner))
        {
            pick = pick + 3;
            activity1 = Activities.values()[pick];

        }
        pick = rand.nextInt(Activities.values().length);
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


