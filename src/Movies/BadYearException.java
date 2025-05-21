// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;
/**
 * This is an exception class specified for the release year of a movie.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani
 */
public class BadYearException extends Exception {
    /**
     * Default constructor specified for invalid years.
     */
    public BadYearException(){
        super("Semantic Error; invalid year.");
    }
    /**
     * Constructor specified for missing years.
     * @param x This parameter is used to differentiate itself from the default constructor.
     */
    public BadYearException(int x){
        super("Semantic Error; missing year.");
    }
}
