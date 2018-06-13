import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;
            //保存原输出流
            PrintStream ps = new PrintStream("./log.txt");
            //创建文件输出流
            System.setOut(ps);
            //设置使用新的输出流
            int age = 18;
            System.out.println("年龄变量成功定义，初始值为18");
            String sex = "女";
            System.out.println("性别变量成功定义，初始值为女");

            //整合两个变量
            String info = "这是个" + sex + "孩子，应该有" + age+ "岁了";
            System.out.println("整合两个变量为info字符串变量，其结果是：" + info);
            System.setOut(out);
            //恢复原有输出流
            System.out.println("程序运行完毕，请查看日志文件。");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//setOut方法用于重新分配System类的标准输出流
//public static void setOut(PrintStream out)
//out 新的PrintStream输出流对象

//也可以把err标准错误输出流重定向到其他位置
