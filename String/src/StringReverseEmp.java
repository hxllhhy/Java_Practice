public class StringReverseEmp {
    public static void main(String[] args) {
        String string = "runoob";
        StringBuffer s = new StringBuffer(string);
        s.reverse();
        System.out.println("反转前:" + string);
        System.out.println("反转后:" + s);
    }
}
