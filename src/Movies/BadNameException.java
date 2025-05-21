// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;
/**
 * This is an exception class specified for the director's name and actors' names of a movie.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani
 */
public class BadNameException extends Exception {
    /**
     * Default constructor specified for missing names.
     */
    public BadNameException(){
        super("Semantic Error; missing name.");
    }
}
