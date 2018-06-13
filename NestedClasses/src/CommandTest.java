interface Command {
    void process(int[] target);
}
class ProcessArray {
    public void process(int[] target, Command cmd) {
        cmd.process(target);
    }
}
//public class CommandTest {
//    public static void main(String[] args) {
//        ProcessArray pa = new ProcessArray();
//        int[] target = {3, -4, 6, 4};
//        pa.process(target, new Command() {
//            @Override
//            public void process(int[] target) {
//                int sum = 0;
//                for(int tmp : target) {
//                    sum += tmp;
//                }
//                System.out.println("数组元素总和为：" + sum);
//            }
//        });
//    }
//}
public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] array = {3, -4, 6, 4};
        pa.process(array , (int[] target) -> {
            int sum = 0;
            for(int tmp : target) {
                sum += tmp;
            }
            System.out.println("数组元素总和为：" + sum);
        });
    }
}
