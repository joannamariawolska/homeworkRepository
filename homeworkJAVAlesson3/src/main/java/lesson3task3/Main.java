package lesson3task3;

public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Jan", "Kowalski", 2015, 500);
        TicketSeller ticketSeller1 = new TicketSeller("Adam", "Nowak", 2018);

        System.out.println(manager1.introduce() + manager1.getSalary()+ manager1.getWorkYears());
        System.out.println(ticketSeller1.introduce() + ticketSeller1.getSalary() + ticketSeller1.getWorkYears());
    }
}