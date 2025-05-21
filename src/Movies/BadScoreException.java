// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;
/**
 * This is an exception class specified for the score of a movie.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani
 */
public class BadScoreException extends Exception {
    /**
     * Default constructor specified for invalid scores.
     */
    public BadScoreException(){
        super("Semantic Error; invalid score.");
    }
    /**
     * Constructor specified for missing scores.
     * @param x This parameter is used to differentiate itself from the default constructor.
     */
    public BadScoreException(int x){
        super("Semantic Error; missing score.");
    }
}
