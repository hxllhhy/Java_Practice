class Emperor {
    private static Emperor emperor = null; //声明一个Emperor类的引用
    private Emperor() {      //将构造方法私有
    }
    public static Emperor getInstance() {  //实例化引用
        if(emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }
    public void getName() {
        System.out.println("我是皇帝");
    }
}

public class EmperorTest {
    public static void main(String[] args) {
        System.out.println("创建皇帝1对象：");
        Emperor emperor1 = Emperor.getInstance();
        emperor1.getName();
        System.out.println("创建皇帝2对象：");
        Emperor emperor2 = Emperor.getInstance();
        emperor2.getName();
        System.out.println("创建皇帝3对象：");
        Emperor emperor3 = Emperor.getInstance();
        emperor3.getName();
    }
}
