// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;
/**
 * This is an exception class specified for the title of a movie.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani
 */
public class BadTitleException extends Exception {
    /**
     * Default constructor specified for missing titles.
     */
    public BadTitleException(){
        super("Semantic Error; missing title.");
    }
}
