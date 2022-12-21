package lesson3task3;

public class Manager extends BaseEmployee{
    private static final int BASE_SALARY = 5000;
    private int bonus;

    public Manager(String name, String surname, int employmentYear, int bonus) {
        super(name, surname, employmentYear);
        this.bonus = bonus;
    }

    public int getBaseSalary() {
        return BASE_SALARY;
    }

    @Override
    public int calculateMonthlySalary(){
        return BASE_SALARY + bonus;
    }
}
