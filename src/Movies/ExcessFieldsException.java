// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;
/**
 * This is an exception class specified for the case when there is an excess field in a movie record.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani
 */
public class ExcessFieldsException extends Exception {
    /**
     * Default constructor specified for the case when there is an excess field in a movie record.
     */
    public ExcessFieldsException(){
        super("Syntax Error; excess field(s).");
    }
}
