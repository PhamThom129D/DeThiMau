package DeThi3.Bai1;

import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

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

    public double calculateSalary() {
        return salary;
    }

    public void addBonus(double bonus) {
        this.salary += bonus;
        System.out.println("Thêm tiền thưởng cho nhân viên " + name + ": " + bonus);
    }

    public void addBonus(Employee[] employees, double bonus) {
        System.out.println("Thêm tiền thưởng cho nhóm nhân viên: " + bonus);
        for (Employee employee : employees) {
            employee.salary += bonus;
            System.out.println("Thêm tiền thưởng cho nhân viên " + employee.getName() + ": " + bonus);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
