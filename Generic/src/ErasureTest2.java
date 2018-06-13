import java.util.ArrayList;
import java.util.List;

public class ErasureTest2 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(6);
        li.add(9);
        List list = li;

        //下面代码引起警告“unchecked”
        List<String> ls = list;

        //但只要访问ls里的元素，就引起运行时异常
        //System.out.println(ls.get(0));
    }
}
