import java.util.StringTokenizer;

public class StringTokennizerEmp {
    public static void main(String[] args) {
        String str = "This is String , split by StringTokenizer, created by runoob";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("--------空格分割---------");
        while(st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        System.out.println("--------逗号分割---------");
        StringTokenizer str2 = new StringTokenizer(str, ",");
        while(str2.hasMoreElements()) {
            System.out.println(str2.nextElement());
        }
    }
}
