// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;
/**
 * This is an exception class specified for the genre of a movie.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani
 */
public class BadGenreException extends Exception {
    /**
     * Default constructor specified for invalid genres.
     */
    public BadGenreException(){
        super("Semantic Error; invalid genre.");
    }
    /**
     * Constructor specified for missing genres.
     * @param x This parameter is used to differentiate itself from the default constructor.
     */
    public BadGenreException(int x){
        super("Semantic Error; missing genre.");
    }
}
