public class CounselorTest {
    public static void main(String[] args) {

    }
    public static void testCounselortoString(){
        User tCounselor = new Counselor(null, null, null, null, null, null, null, null);
        tCounselor = tCounselor.login();
        System.out.println(tCounselor.toString());
    }
}
