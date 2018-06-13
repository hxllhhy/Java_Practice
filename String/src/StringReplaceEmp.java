public class StringReplaceEmp {
    public static void main(String[] args) {
        String str = "Hello World HeHe";
        System.out.println(str.replace('H','W'));

        //都是全部替换,区别是replace可以基于正则表达式进行替换,若只替换出现第一次的,则与replaceFirst效果相同
        System.out.println(str.replace("He","Wa"));
        System.out.println(str.replaceAll("He","Ha"));
        System.out.println(str.replaceFirst("He","Ha"));
    }
}
