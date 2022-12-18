public class Movie {

    private final String title;
    private final String director;
    private final int lengthInMinutes;
    private final int yearOfProduction;

    protected String getDescriptionOfMovie(){
        return "Twój film to " + title + " z " + yearOfProduction + ". " + "Wyreżyserował " + director  + ". " + "Długość filmu to " + lengthInMinutes + " minuty.";
    }

    protected Movie(String title, String director, int lengthInMinutes, int yearOfProduction) {
        this.title = title;
        this.director = director;
        this.lengthInMinutes = lengthInMinutes;
        this.yearOfProduction = yearOfProduction;
    }
}
