public class StaticInnerClassTest {
    private int pro1 = 5;
    private static int pro2 = 9;
    static class StaticInnerClass {
        private static int age;
        public void accessOuterProp() {
            //System.out.println(pro1);
            System.out.println(pro2);
        }
    }
}
