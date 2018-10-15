package 重写父类中的方法;

public class Test {
    public static void main(String[] args) {
        Employee em = new Employee();
        System.out.println(em.info());

        Manager ma = new Manager();
        System.out.println(ma.info());
    }
}
