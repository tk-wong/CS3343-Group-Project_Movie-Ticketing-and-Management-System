package release.exception;

/**
 * InvalidMovieTicketException class
 * It is used to represent the exception when the movie ticket is invalid
 */
public class InvalidMovieTicketException extends Exception {
  public InvalidMovieTicketException() {
        super("Invalid movie ticket");
    }
}
