package lesson3task3;

public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Jan", "Kowalski", 2015, 700);
        TicketSeller ticketSeller1 = new TicketSeller("Adam", "Nowak", 2018, 700);


        System.out.println(manager1.calculateMonthlySalary());
        //System.out.println(manager1.getSalary() + " " + manager1.calculateMonthlySalary() + " " + manager1.getWorkYears());
        //System.out.println(ticketSeller1.getSalary() + " " + ticketSeller1.calculateMonthlySalary() + " " + ticketSeller1.getWorkYears());
    }
}