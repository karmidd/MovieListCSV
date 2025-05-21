// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;
/**
 * This is an exception class specified for the case when there is a missing field in a movie record.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani
 */
public class MissingFieldsException extends Exception {
    /**
     * Default constructor specified for the case when there is a missing field in a movie record.
     */
    public MissingFieldsException(){
        super("Syntax Error; missing field(s).");
    }
}
