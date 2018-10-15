import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] nameStr = str.split(" {1,}");
        int index = (int)(Math.random()*nameStr.length); //[0,1.0)*length
        String formatArg = "本次抽取观众人员：\n\t%1$s\n恭喜%1$s成为本次观众抽奖的大奖得主。" + "\n\n我们将为%1$s颁发：\n\t过期的酸奶二十箱。";
        String info = String.format(formatArg, nameStr[index]);
        System.out.println(info);
    }
}
