package 经理与员工的差异;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("yaya");
        employee.setSalary(100);
        employee.setBirthday(new Date());

        Manager manager = new Manager();
        manager.setName("dandan");
        manager.setSalary(3000);
        manager.setBirthday(new Date());
        manager.setBonus(2000);

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBirthday());

        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
        System.out.println(manager.getBirthday());
        System.out.println(manager.getBonus());
    }
}
