package DeThi3.Bai1;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Khánh",1000);
        Employee employee2 = new Employee("Minh",1000);
        Employee employee3 = new Employee("Thơm",1000);
        Employee employee4 = new Employee("Trang",1000);

        Employee[] employees = { employee2, employee3, employee4};

        employee1.addBonus(100);
        System.out.println("Nhân viên cụ thể : " + employee1.toString());

        employee2.addBonus(employees,120);
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

    }
}
