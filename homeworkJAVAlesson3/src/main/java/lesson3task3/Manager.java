package lesson3task3;

public class Manager extends BaseEmployee{
    public static final int BASE_SALARY = 5000;
    int bonus;

    @Override
    public int calculateMonthlySalary() {
        return  BASE_SALARY + bonus;
    }

    public Manager(String name, String surname, int employmentYear, int bonus) {
        super(name, surname, employmentYear);
        this.bonus = bonus;
    }
}
