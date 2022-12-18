package lesson3task1;

public class SeatAtCinema {
    final int number;
    final int rowNumber;
    boolean isAvailable;

    protected String getMeMySeat(){

        return "Wybrane miejsce to " + number + ", w rzędzie " + rowNumber + " i jest wolne: " + isAvailable;
    }

    protected SeatAtCinema(int number, int rowNumber, boolean isAvailable) {
        this.number = number;
        this.rowNumber = rowNumber;
        this.isAvailable = isAvailable;
    }
}