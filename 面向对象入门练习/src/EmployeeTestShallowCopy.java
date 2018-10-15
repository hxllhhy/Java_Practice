class Employee {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "姓名：" + name + ",年龄：" + age;
    }
}

public class EmployeeTestShallowCopy  {
    public static void main(String[] args) {
        System.out.println("克隆之前：");
        Employee employee1 = new Employee();
        employee1.setName("鸭鸭");
        employee1.setAge(3);
        Employee employee2 = employee1;
        employee2.setName("桶桶");
        employee2.setAge(2);
        System.out.println("老板1的信息：");
        System.out.println(employee1);
        System.out.println("老板2的信息：");
        System.out.println(employee2);
    }
}
