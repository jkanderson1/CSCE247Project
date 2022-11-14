public class CounselorTest {
    public static void main(String[] args) {
        User tCounselor = new Counselor(null, null, null, null, null, null, null, null);
        tCounselor = tCounselor.login();
        System.out.println(tCounselor.toString());
    }
}
