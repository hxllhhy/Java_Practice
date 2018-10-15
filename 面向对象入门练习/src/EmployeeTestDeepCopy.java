class Address implements Cloneable {
    private String state;
    private String province;
    private String city;
    public Address(String state, String province, String city) {
        this.state = state;
        this.province = province;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("国家:" + state + ",");
        sb.append("省:" + province + ",");
        sb.append("市:" + city);
        return sb.toString();
    }

    @Override
    public Address clone() {
        Address address = null;
        try {
            address = (Address)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return address;
    }
}

class Employeee implements Cloneable {
    private String name;
    private int age;
    private Address address;
    public Employeee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：" + name + ", ");
        sb.append("年龄：" + age + "\n");
        sb.append("地址：" + address);
        return sb.toString();
    }

    @Override
    public Employeee clone() {
        Employeee employee = null;
        try {
            employee = (Employeee)super.clone();
            employee.address = address.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
public class EmployeeTestDeepCopy {
    public static void main(String[] args) {
        System.out.println("克隆之前：");
        Address address = new Address("中国", "吉林", "长春");
        Employeee employee1 = new Employeee("鸭鸭", 3, address);
        System.out.println("员工1的信息：");
        System.out.println(employee1);
        System.out.println("克隆之后：");
        Employeee employee2 = employee1.clone();
        employee2.getAddress().setState("中国");
        employee2.getAddress().setProvince("四川");
        employee2.getAddress().setCity("成都");
        employee2.setName("蛋蛋");
        employee2.setAge(2);
        System.out.println("员工1的信息：");
        System.out.println(employee1);
        System.out.println("员工2的信息：");
        System.out.println(employee2);
    }
}
