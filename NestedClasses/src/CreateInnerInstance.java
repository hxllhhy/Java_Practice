class Out {
    //定义一个内部类，不使用访问控制符
    //即只有同一个包中的其他类可访问该内部类
    class In {
        public In(String msg) {
            System.out.println(msg);
        }
    }
}

public class CreateInnerInstance {
    public static void main(String[] args) {
        Out.In in = new Out().new In("test");

        /*
        Out.In in;
        Out out = new Out();
        in = out.new In("test");
         */
    }
}
