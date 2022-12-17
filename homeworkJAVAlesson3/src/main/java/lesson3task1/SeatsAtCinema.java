package lesson3task1;

public class SeatsAtCinema {
    int seatNumber;
    int rowNumber;
    String status;

    public String getMeMySeat(){
        return "Wybrane miejsce to " + seatNumber + ", w rzędzie " + rowNumber + " i jest " + status;
    }

    public SeatsAtCinema(int seatNumber, int rowNumber, String status) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.status = status;
    }
}
