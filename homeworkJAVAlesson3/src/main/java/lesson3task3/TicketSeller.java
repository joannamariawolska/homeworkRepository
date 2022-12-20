package lesson3task3;

public class TicketSeller extends BaseEmployee{

    @Override
    public int calculateMonthlySalary() {
        return BASE_SALARY;
    }

    public TicketSeller(String name, String surname, int employmentYear) {
        super(name, surname, employmentYear);
    }
}