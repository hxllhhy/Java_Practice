package ArraysTest.SortTest;
import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {
        //注意，要想改变默认的排列顺序，不能使用基本类型（int,double, char）
        //而要使用它们对应的类
        Integer [] a = {7, 33, 1, 5, 99, 21};
        Comparator cmp = new MyComparator();
        Arrays.sort(a,cmp);
        //Arrays.sort(a,0,4,cmp);
        for (int i : a) {
            System.out.println(i);

        }
    }
}
//Comparator是一个接口，所以这里我们自己定义的类MyComparator要implents该接口
class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        //如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值，
        //这样颠倒一下，就可以实现反向排序了
        if(o1 < o2)
            return 1;
        else if(o1 > o2)
            return -1;
        else
            return 0;
    }
}
