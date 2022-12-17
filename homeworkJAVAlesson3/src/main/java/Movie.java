public class Movie {

    String movieTitle;
    String nameOfDirector;
    int theLengthOfTheMovie;
    int yearOfProduction;

    protected String getDescriptionOfMovie(){
        return "Twój film to " + movieTitle + " z " + yearOfProduction + ". " + "Wyreżyserował " + nameOfDirector  + ". " +"Długość filmu to " + theLengthOfTheMovie + "minuty.";
    }

    protected Movie(String movieTitle, String nameOfDirector, int theLengthOfTheMovie, int yearOfProduction) {
        this.movieTitle = movieTitle;
        this.nameOfDirector = nameOfDirector;
        this.theLengthOfTheMovie = theLengthOfTheMovie;
        this.yearOfProduction = yearOfProduction;
    }
}
