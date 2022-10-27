import java.util.ArrayList;

public class CampDriver{
    CabinCollection cabins;
    static CounselorCollection counselors;
    static ArrayList<Director> director;
    static ChildCollection children;
    static ArrayList<Parent> parents;
    public static void main(String[] args) {
        // cabins = DataReader.getAllCabins();
        counselors = new CounselorCollection(DataReader.getAllCounselors());
        director = DataReader.getAllDirectors();
        children = new ChildCollection(DataReader.getAllChildren());
        parents = DataReader.getAllParents();
        children.getChildren();
        System.out.println("===============================================");
        counselors.getCounselors();
    }
}