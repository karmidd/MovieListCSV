// -----------------------------------------------------
// Assignment #2
// Written by: Karam Midani 40277218
// -----------------------------------------------------
package Movies;
/**
 * This is an exception class specified for the case when there is a missing quotation mark in a field in a movie record.
 * COMP249 Assignment #2
 * Due Date: 27th March
 * @author Karam Midani
 */
public class MissingQuotesException extends Exception {
    /**
     * Default constructor specified for the case when there is a missing quotation mark in a field in a movie record.
     */
    public MissingQuotesException(){
        super("Syntax Error; missing quotation mark(s).");
    }
}
