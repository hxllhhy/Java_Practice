public class A1 extends Apple<String>{
    public String getInfo() {
        return "子类" + super.getInfo();
    }

    /*错误，重写父类方法时返回值类型不一样
    public Object getInfo() {
        return "子类";
    }
    */
}
