
package final222;


public class InvalidPickException extends RuntimeException {

    public InvalidPickException() {
        System.out.println("Invalid pick; must be 1-5");
    }

    public InvalidPickException(String message) {
        super(message);
    }
    
    
}
