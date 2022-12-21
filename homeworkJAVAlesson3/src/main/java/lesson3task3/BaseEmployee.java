package lesson3task3;

public abstract class BaseEmployee {

    private final String name;
    private final String surname;
    private final int employmentYear;
    private final int salary;
    public static final int BASE_SALARY = 3000;

    private int bonus;

    public BaseEmployee(String name, String surname, int employmentYear) {
        this.name = name;
        this.surname = surname;
        this.employmentYear = employmentYear;
        this.salary = BASE_SALARY;
        this.bonus = bonus;
    }

    public int getWorkYears() {
        return 2022-employmentYear;
    }

    public int getBaseSalary(){
        return BASE_SALARY;
    }

    public abstract int calculateMonthlySalary();
}