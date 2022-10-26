import java.util.ArrayList;

public class Facade {
    private User user;
    private ChildCollection kids;
    private CounselorCollection counselorcollection;
    private Director director;
public Facade(User user){
this.user = user;
this.kids= kids;
this.director=director;
this.counselorcollection = counselorcollection;
}

public User login(String username,String password){
    return user.login();

}
public User signUp(){
    return user;

}
public void getScheduleByName(String Name){

}

public ArrayList<Schedule> getAllSchedules(){
    return null;
    
}
public ArrayList<Child> getchildCollection(){
    return null;
    
}
public ArrayList<Counselor> getConselorcollection(){
    return null;
    
}
}
