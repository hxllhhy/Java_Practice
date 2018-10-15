class Person {
    private String name;
    private String gender;
    private int age;
    public Person() {
        System.out.println("使用无参构造方法创建对象");
    }
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("使用有参构造方法创建对象");
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
}


public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("mr", "男", 11);
        System.out.println("员工1的信息：");
        System.out.println("员工姓名：" + p1.getName());
        System.out.println("员工性别：" + p1.getGender());
        System.out.println("员工年龄：" + p1.getAge());
        System.out.println("员工2的信息：");
        System.out.println("员工姓名：" + p2.getName());
        System.out.println("员工性别：" + p2.getGender());
        System.out.println("员工年龄：" + p2.getAge());

    }
}
