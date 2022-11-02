import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Schedule{
    public ArrayList<Activities> ActivitiesAL = new ArrayList<Activities>();
    private HashMap <Days,ArrayList<Activities>>ActivitiesHMap = new HashMap <Days,ArrayList<Activities>>();

    ArrayList<Activities> mondayActivities = new ArrayList<Activities>();
    ArrayList<Activities> tuesdayActivities = new ArrayList<Activities>();
    ArrayList<Activities> wednesdayActivities = new ArrayList<Activities>();
    ArrayList<Activities> thursdayActivities = new ArrayList<Activities>();
    ArrayList<Activities> fridayActivities = new ArrayList<Activities>();
    ArrayList<Activities> saturdayActivities = new ArrayList<Activities>();
    ArrayList<Activities> sundayActivities = new ArrayList<Activities>();
    
    
    public void makeSchedule(){
        Random rand = new Random();
        //creating an arraylist of activities for each day
       
        //picking random activities for each day
        int pick = rand.nextInt(Activities.values().length);
        Activities activity1 = Activities.values()[pick];
        pick = rand.nextInt(Activities.values().length);
        Activities activity2 = Activities.values()[pick];

        int pick2 = rand.nextInt(Activities.values().length);
        Activities activity3 = Activities.values()[pick2];
        pick2 = rand.nextInt(Activities.values().length);
        Activities activity4 = Activities.values()[pick2];

        int pick3 = rand.nextInt(Activities.values().length);
        Activities activity5 = Activities.values()[pick3];
        pick3 = rand.nextInt(Activities.values().length);
        Activities activity6 = Activities.values()[pick3];

        int pick4 = rand.nextInt(Activities.values().length);
        Activities activity7 = Activities.values()[pick4];
        pick3 = rand.nextInt(Activities.values().length);
        Activities activity8 = Activities.values()[pick4];

        int pick5= rand.nextInt(Activities.values().length);
        Activities activity9 = Activities.values()[pick5];
        pick3 = rand.nextInt(Activities.values().length);
        Activities activity10 = Activities.values()[pick5];

        int pick6= rand.nextInt(Activities.values().length);
        Activities activity11 = Activities.values()[pick6];
        pick3 = rand.nextInt(Activities.values().length);
        Activities activity12 = Activities.values()[pick6];

        int pick7= rand.nextInt(Activities.values().length);
        Activities activity13 = Activities.values()[pick7];
        pick3 = rand.nextInt(Activities.values().length);
        Activities activity14 = Activities.values()[pick7];
        //Activities for Monday
        //checks to make sure they are not the same Activities
        while(activity1.equals(activity2))
        {
            pick = rand.nextInt(Activities.values().length);
            activity2 = Activities.values()[pick];
        }
        mondayActivities.add(Activities.Breakfast);
        mondayActivities.add(activity1);
        mondayActivities.add(Activities.Lunch);
        mondayActivities.add(activity2);
        mondayActivities.add(Activities.Dinner);
       //activities for Tuesday
        while(activity3.equals(activity4))
        {
            pick2 = rand.nextInt(Activities.values().length);
            activity4 = Activities.values()[pick2];
        }
        tuesdayActivities.add(Activities.Breakfast);
        tuesdayActivities.add(activity3);
        tuesdayActivities.add(Activities.Lunch);
        tuesdayActivities.add(activity4);
        tuesdayActivities.add(Activities.Dinner);
        //activities for wednesday
        while(activity5.equals(activity6))
        {
            pick3= rand.nextInt(Activities.values().length);
            activity5 = Activities.values()[pick3];
        }
        wednesdayActivities.add(Activities.Breakfast);
        wednesdayActivities.add(activity5);
        wednesdayActivities.add(Activities.Lunch);
        wednesdayActivities.add(activity6);
        wednesdayActivities.add(Activities.Dinner);
        //activities for thursday
        while(activity7.equals(activity8))
        {
            pick4= rand.nextInt(Activities.values().length);
            activity7 = Activities.values()[pick4];
        }
        thursdayActivities.add(Activities.Breakfast);
        thursdayActivities.add(activity7);
        thursdayActivities.add(Activities.Lunch);
        thursdayActivities.add(activity8);
        thursdayActivities.add(Activities.Dinner);
        //friday activities
        while(activity9.equals(activity10))
        {
            pick5= rand.nextInt(Activities.values().length);
            activity9 = Activities.values()[pick5];
        }
        fridayActivities.add(Activities.Breakfast);
        fridayActivities.add(activity9);
        fridayActivities.add(Activities.Lunch);
        fridayActivities.add(activity10);
        fridayActivities.add(Activities.Dinner);
        //saturday activities
        while(activity11.equals(activity12))
        {
            pick6= rand.nextInt(Activities.values().length);
            activity11 = Activities.values()[pick6];
        }
        saturdayActivities.add(Activities.Breakfast);
        saturdayActivities.add(activity11);
        saturdayActivities.add(Activities.Lunch);
        saturdayActivities.add(activity12);
        saturdayActivities.add(Activities.Dinner);
        //sunday activities
        while(activity13.equals(activity14))
        {
            pick7= rand.nextInt(Activities.values().length);
            activity11 = Activities.values()[pick7];
        }
        sundayActivities.add(Activities.Breakfast);
        sundayActivities.add(activity13);
        sundayActivities.add(Activities.Lunch);
        sundayActivities.add(activity14);
        sundayActivities.add(Activities.Dinner);

        //Hashmap of activities for each day. 
        //Array list represents the activities and enumeration represents the days
        ActivitiesHMap.put(Days.Monday, mondayActivities);
        ActivitiesHMap.put(Days.Tuesday, tuesdayActivities);
        ActivitiesHMap.put(Days.Wednesday, wednesdayActivities);
        ActivitiesHMap.put(Days.Thursday, thursdayActivities);
        ActivitiesHMap.put(Days.Friday, fridayActivities);
        ActivitiesHMap.put(Days.Saturday, saturdayActivities);
        ActivitiesHMap.put(Days.Sunday, sundayActivities);

        
    }

    //printing out the schedule for each day after they are made
    public String toString(){
        System.out.println(mondayActivities.toString());
        System.out.println(tuesdayActivities.toString());
        System.out.println(wednesdayActivities.toString());
        System.out.println(thursdayActivities.toString());
        System.out.println(fridayActivities.toString());
        System.out.println(saturdayActivities.toString());
        System.out.println(sundayActivities.toString());
        return "";
    }
    
}


