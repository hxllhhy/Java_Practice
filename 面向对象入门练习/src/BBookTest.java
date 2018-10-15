import java.util.Random;

class BBook {
    private static int count = 0;
    public BBook(String title) {
        System.out.println("售出图书：" + title);
        count++;
    }
    public static int getCount() {
        return count;
    }
}
public class BBookTest {
    public static void main(String[] args) {
        String[] titles = {"《Java从入门到精通》", "《Java变成词典》", "《看视频学Java》"};
        for (int i = 0; i < 5; i++) {
            new BBook(titles[new Random().nextInt(3)]); //[0,3)随机数
        }
        System.out.println("总计销售了" + BBook.getCount() + "本图书！");
    }
}
