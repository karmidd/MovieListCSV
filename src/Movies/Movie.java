// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;

import java.io.Serializable;

/**
 * This class is used to create serializable movie objects that contain multiple characteristics.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani
 */
public class Movie implements Serializable {
    private int year;
    private String title;
    private double duration;
    private String genre;
    private String rating;
    private double score;
    private String director;
    private String actor1;
    private String actor2;
    private String actor3;

    /**
     * Parameterized constructor that initializes all instance variables by passing 10 different parameters:
     * @param year Year of release of movie
     * @param title Title of movie
     * @param duration Duration of movie
     * @param genre Genre of movie
     * @param rating Rating of movie
     * @param score Score of movie
     * @param director Director of movie
     * @param actor1 Actor 1 of movie
     * @param actor2 Actor 2 of movie
     * @param actor3 Actor 3 of movie
     */
    public Movie(int year, String title, double duration, String genre, String rating, double score, String director, String actor1, String actor2, String actor3){
        this.year = year;
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;
        this.score = score;
        this.director = director;
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    /**
     * This method will return the year of release.
     * @return Year of release of movie as integer.
     */
    public int getYear() {
        return year;
    }

    /**
     * This method sets a new value for the year of release.
     * @param year New year of release of movie.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * This method will return the title.
     * @return Title of movie as string.
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method will set the title.
     * @param title New title of movie.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method will return the duration.
     * @return Duration of movie as double.
     */
    public double getDuration() {
        return duration;
    }

    /**
     * This method will set the duration.
     * @param duration New duration of movie.
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * This method will return the genre.
     * @return Genre of movie as string.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * This method will set the genre.
     * @param genre New genre of movie.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * This method will return the rating.
     * @return Rating of movie as string.
     */
    public String getRating() {
        return rating;
    }

    /**
     * This method will set the rating.
     * @param rating New rating of movie.
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * This method will return the score.
     * @return Score of movie as double.
     */
    public double getScore() {
        return score;
    }

    /**
     * This method will set the score.
     * @param score New score of movie.
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * This method will return the name of the director.
     * @return Name of director of movie as string.
     */
    public String getDirector() {
        return director;
    }

    /**
     * This method will set the director.
     * @param director New name of director of movie.
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * This method will return the name of actor 1.
     * @return Name of actor 1 of movie.
     */
    public String getActor1() {
        return actor1;
    }

    /**
     * This method will set the name of actor 1.
     * @param actor1 New name of actor 1 of movie.
     */
    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    /**
     * This method will return the name of actor 2.
     * @return Name of actor 2 of movie.
     */
    public String getActor2() {
        return actor2;
    }

    /**
     * This method will set the name of actor 2.
     * @param actor2 New name of actor 2 of movie.
     */
    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    /**
     * This method will return the name of actor 3.
     * @return Name of actor 3 of movie.
     */
    public String getActor3() {
        return actor3;
    }

    /**
     * This method will set the name of actor 3.
     * @param actor3 New name of actor 3 of movie.
     */
    public void setActor3(String actor3) {
        this.actor3 = actor3;
    }

    /**
     * Equals method that overrides the equals method found in Object.
     * Compares the director, title, and release year of 2 movies.
     * @param otherObject Another object to compare with the object that is calling this method.
     * @return Boolean value that represents equality. True if equal, false if not.
     */
    @Override
    public boolean equals(Object otherObject){
        if (otherObject == null)
            return false;
        if (otherObject.getClass() != this.getClass())
            return false;
        Movie otherMovie =  (Movie) otherObject;
        return (this.year == otherMovie.year && this.director.equals(otherMovie.director) && this.title.equals(otherMovie.title));
    }

    /**
     * toString method that overrides the toString found in Object.
     * @return String that contains the info of all instance variables of a movie.
     */
    @Override
    public String toString(){
        return ("Title: " + title + "\nYear: " + year + "\nDirector: " + director + "\nGenre: " + genre + "\nDuration: " + duration + "\nScore: " + score + "\nRating: " + rating + "\nActor 1: " + actor1 + "\nActor 2: " + actor2 + "\nActor 3: " + actor3);
    }

    /**
     * Method that checks if a movie is valid according to a set of rules.
     * @param splitMovie The array representation of the movie string, created with .split().
     * @param movie The string representation of the movie.
     * @throws BadYearException Invalid or missing year.
     * @throws BadTitleException Missing title.
     * @throws BadGenreException Invalid or missing genre
     * @throws BadScoreException Invalid or missing score.
     * @throws BadDurationException Invalid or missing score.
     * @throws BadRatingException Invalid or missing rating.
     * @throws BadNameException Missing name.
     * @throws MissingQuotesException Missing quotation mark. ( " )
     * @throws ExcessFieldsException Excess field.
     * @throws MissingFieldsException Missing field.
     */

    public static void checkMovieValidity(String[] splitMovie, String movie) throws BadYearException, BadTitleException, BadGenreException, BadScoreException, BadDurationException, BadRatingException, BadNameException, MissingQuotesException, ExcessFieldsException, MissingFieldsException{
        //variable for counting quotation marks in the movie string
        double quotationCount = 0;
        //for loop that goes through all chars of the string and checks if they're a quotation mark
        for (int i = 0; i < movie.length(); i++) {
            if(movie.charAt(i) == '"')
                quotationCount++;
        }
        //throws an exception if there's a missing quotation mark
        if(quotationCount % 2 != 0)
            throw new MissingQuotesException();
        //throws an exception if the split movie string (array) has a missing field
        if(splitMovie.length < 10)
            throw new MissingFieldsException();
        //variable that represents the amount of extra fields a movie string has
        int difference = 0;
        if(splitMovie.length > 10){
            //checks if the extra fields are justifiable and aren't any extra information
            boolean extraFieldJustifiable;
            if(splitMovie[1].charAt(0) == '"' && splitMovie[1].charAt(splitMovie[1].length() - 1) == '"')
                extraFieldJustifiable = false;
            else if(splitMovie[1].charAt(0) == '"' && splitMovie[2].charAt(splitMovie[2].length() - 1) == '"')
                extraFieldJustifiable = true;
            else {
                extraFieldJustifiable = false;
            }
            //if the extra field is not justifiable, throws an exception
            if(!extraFieldJustifiable){
                throw new ExcessFieldsException();
            }
            //if justifiable, assign difference
            else{
                difference = splitMovie.length - 10;
            }
        }
        //if field is blank, throws an exception
        if(splitMovie[0].isBlank())
            throw new BadYearException(0);
        //try assigning year, if not possible, throws an exception
        int year;
        try {
            String yearString = splitMovie[0].replace("\"", "");
            year = Integer.parseInt(yearString);
        }
        catch(NumberFormatException nfe){
            throw new BadYearException();
        }
        //if year is an unaccepted number, throws an exception
        if(year < 1990 || year > 1999)
            throw new BadYearException();
        //if title is blank, throws an exception
        if(splitMovie[1].isBlank() && splitMovie[1+difference].isBlank())
            throw new BadTitleException();
        //if duration is blank, throws an exception
        if (splitMovie[2+difference].isBlank())
            throw new BadDurationException(0);
        //try assigning duration, if not possible, throws an exception
        int duration;
        try {
            String durationString = splitMovie[2 + difference].replace("\"", "");
            duration = Integer.parseInt(durationString);
        }
        catch (NumberFormatException nfe) {
            throw new BadDurationException();
        }
        //if duration is an unaccepted number, throws an exception
        if (duration < 30 || duration > 300)
            throw new BadDurationException();
        //if genre is blank, throws an exception
        if(splitMovie[3+difference].isBlank())
            throw new BadGenreException(0);
        String[] genresArray = {"musical", "comedy", "animation", "adventure", "drama", "crime", "biography", "horror", "action", "documentary", "fantasy", "mystery", "sci-fi", "family", "romance", "thriller", "western"};
        boolean validGenre = false;
        //checks if genre is an accepted genre type
        for (int i = 0; i < genresArray.length; i++) {
            if(splitMovie[3+difference].replace("\"", "").equalsIgnoreCase(genresArray[i])){
                validGenre = true;
                break;
            }
        }
        //if it's not a valid type, throws an exception
        if(!validGenre)
            throw new BadGenreException();
        //if rating is blank, throws an exception
        if(splitMovie[4+difference].isBlank())
            throw new BadRatingException(0);
        String[] ratingsArray = {"PG", "Unrated", "G", "R", "PG-13", "NC-17"};
        boolean validRating = false;
        //check if rating is an accepted rating type
        for (int i = 0; i < ratingsArray.length; i++) {
            if(splitMovie[4+difference].replace("\"", "").equals(ratingsArray[i])){
                validRating = true;
                break;
            }
        }
        //if not an accepted type, throws an exception
        if(!validRating)
            throw new BadRatingException();
        //if score is blank, throws an exception
        if(splitMovie[5+difference].isBlank())
            throw new BadScoreException(0);
        //tries assigning score, if not possible, throws an exception
        double score;
        try {
            String doubleString = splitMovie[5 + difference].replace("\"", "");
            score = Double.parseDouble(doubleString);
        }
        catch (NumberFormatException nfe) {
            throw new BadScoreException();
        }
        //if score is an unaccepted number, throws an exception
        if(score <= 0 || score > 10){
            throw new BadScoreException();
        }
        //if any of the names are blank, throws an exception
        if(splitMovie[6+difference].isBlank() || splitMovie[7+difference].isBlank() || splitMovie[8+difference].isBlank() || splitMovie[9+difference].isBlank())
            throw new BadNameException();
    }
}