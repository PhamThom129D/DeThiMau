package DeThi3.Bai1;

public class FullTimeEmployee extends  Employee{

    public FullTimeEmployee(String name, int salary) {
        super(name, salary);
    }
    @Override
    public double calculateSalary() {
        return super.calculateSalary()*1.5;
    }
}
