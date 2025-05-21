// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;
/**
 * This is an exception class specified for the rating of a movie.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani
 */
public class BadRatingException extends Exception {
    /**
     * Default constructor specified for invalid ratings.
     */
    public BadRatingException(){
        super("Semantic Error; invalid rating.");
    }
    /**
     * Constructor specified for missing ratings.
     * @param x This parameter is used to differentiate itself from the default constructor.
     */
    public BadRatingException(int x){
        super("Semantic Error; missing rating.");
    }
}
