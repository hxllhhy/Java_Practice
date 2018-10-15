package 经理与员工的差异;

import java.util.Date;

public class Employee {
    private String name;   //姓名
    private double salary; //薪水
    private Date birthday; //生日

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
