class Applee<T extends Number> {
    T size;
    public Applee() {}
    public Applee(T size) {
        this.size = size;
    }
    public void setSize(T size) {
        this.size = size;
    }
    public T getSize() {
        return this.size;
    }
}
public class ErasureTest {
    public static void main(String[] args) {
        Applee<Integer> a = new Applee<>(6);

        //a的getSize()方法返回Integer对象
        Integer as = a.getSize();

        //把a对象赋给Applee变量，丢失尖括号里的类型信息
        Applee b = a;

        //b只知道size的类型是Number
        Number size1 = b.getSize();

        //下面代码编译错误
        //Integer size2 = b.getSize();
    }
}
