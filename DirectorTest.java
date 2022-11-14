public class DirectorTest {
    public static void main(String[] args) {
        User testD = new User("sammys", "samsame1");
        testD = testD.login();
        System.out.println(testD.toString());
    }
}
