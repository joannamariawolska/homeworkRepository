package lesson3task3;

public class Manager extends BaseEmployee{
    private static final int BASE_SALARY = 5000;
    private int bonus;

    public Manager(String name, String surname, int employmentYear, int salary) {
        super(name, surname, employmentYear, salary);
        this.bonus = 500;
    }


    @Override
    public int calculateMonthlySalary(){
        return getSalary() + bonus;
    }
}
