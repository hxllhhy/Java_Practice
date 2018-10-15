public class Initialization {
    private byte b; //0
    private short s; //0
    private int i; //0
    private long l; //0L
    private float f; //0.0
    private double d; //0.0
    private boolean bl; //false
    private char c; //‘\u0000’ 即空字符null
    private String string; //null

    public static void main(String[] args) {
        Initialization init = new Initialization();
        System.out.println(init.b);
        System.out.println(init.s);
        System.out.println(init.i);
        System.out.println(init.l);
        System.out.println(init.f);
        System.out.println(init.d);
        System.out.println(init.bl);
        System.out.println(init.c);
        System.out.println(init.string);
    }
}
