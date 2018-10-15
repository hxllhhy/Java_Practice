import java.io.*;

class Addresss implements Serializable {
    private String state;
    private String province;
    private String city;
    public Addresss(String state, String province, String city) {
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
}
class Employeeee implements Serializable {
    private String name;
    private int age;
    private Addresss address;
    public Employeeee(String name, int age, Addresss address) {
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

    public Addresss getAddress() {
        return address;
    }

    public void setAddress(Addresss address) {
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
}

public class EmployeeTestSerializable {
    public static void main(String[] args) {
        System.out.println("序列化之前：");
        Addresss addresss = new Addresss("中国", "吉林", "长春");
        Employeeee employeeee1 = new Employeeee("yaya", 2, addresss);
        System.out.println("员工1的信息：");
        System.out.println(employeeee1);
        System.out.println("序列化之后：");

        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        Employeeee employeeee2 = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("employee.dat"));
            out.writeObject(employeeee1);
            //将employeeee1对象写入到本地文件

            in = new ObjectInputStream(new FileInputStream("employee.dat"));
            employeeee2 = (Employeeee)in.readObject();
            //读取本地文件赋值给employeeee2

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if(employeeee2 != null) {
            //接着修改employeeee2的属性
            employeeee2.getAddress().setState("中国");
            employeeee2.getAddress().setProvince("四川");
            employeeee2.getAddress().setCity("成都");
            employeeee2.setName("蛋蛋");
            employeeee2.setAge(2);
            System.out.println("员工1的信息：");
            System.out.println(employeeee1);
            System.out.println("员工2的信息：");
            System.out.println(employeeee2);
        }
    }
}
