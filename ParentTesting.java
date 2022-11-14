/*
 * Colson Carey
 */
public class ParentTesting{
    public static void main(String[] args) {
       testParentLoginCase1();
    }
    public static void testParentLoginCase1(){
        User testP = new Parent("bobber", "berger123", null, null, null, null, null, null);
       testP = testP.login();
       testP.access();
    }

}