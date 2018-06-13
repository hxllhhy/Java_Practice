class MyTest {
    static {
        System.out.println("静态初始化块...");
    }
    static final String compileConstant = "疯狂Java讲义";
    //该类变量使用final修饰，在编译时就可以确定下来，被当做宏变量处理

    //static final String getCompileConstant = System.currentTimeMillis() + "";
    //该类变量必须等到运行时才能确定，所以可以初始化类
}

public class CompileConstantTest {
    public static void main(String[] args) {
        System.out.println(MyTest.compileConstant);
        //该行代码在编译时就被替换，不会导致初始化类
    }
}
