// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;

/**
 * This is an exception class specified for the duration of a movie.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani
 */
public class BadDurationException extends Exception {
    /**
     * Default constructor specified for invalid durations.
     */
    public BadDurationException(){
        super("Semantic Error; invalid duration.");
    }

    /**
     * Constructor specified for missing durations.
     * @param x This parameter is used to differentiate itself from the default constructor.
     */
    public BadDurationException(int x){
        super("Semantic Error; missing duration.");
    }
}
