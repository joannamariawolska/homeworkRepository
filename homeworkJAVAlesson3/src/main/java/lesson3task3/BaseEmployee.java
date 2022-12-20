package lesson3task3;

public abstract class BaseEmployee {

    String name;
    String surname;
    final int employmentYear;
    public static final int BASE_SALARY = 3000;

    public String introduce(){
        return "Nazywam się " + name + " " + surname + ". ";
    }

    public String getWorkYears() {
        return "Pracuję w firmie od " + (2022 - employmentYear) + " lat.";
    }

    public String getSalary(){
        return "Moja wypłata to: " + calculateMonthlySalary() + ". ";
    }

    public abstract int calculateMonthlySalary();

    public BaseEmployee(String name, String surname, int employmentYear) {
        this.name = name;
        this.surname = surname;
        this.employmentYear = employmentYear;
    }
}