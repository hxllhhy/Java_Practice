import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayMinValue {
    public static void main(String[] args) {
        System.out.println("请输入一组数字：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim(); //接收输入的一行，并对左右空格进行处理
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(!Character.isDigit(c) && c != ' ') {
                System.out.println("输入包含非数字内容！");
                return;
            }
        }
        String[] numStr = str.split(" {1,}"); //正则表达式 X{1,} X至少1次 即将字符串以一个或多个空格分割
        int[] numArray = new int[numStr.length];
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.valueOf(numStr[i]); //用Integer.valueOf将字符串转为整数
            num.add(numArray[i]); //把数组中的数都添加到ArrayList里
        }
        System.out.println("这组数字中最大值是：" + Collections.max(num)); //通过Collections工具类的max方法求得
    }
}
