// Class -> return
// Checked Exception Class -> throw
// Unchecked Exception Class -> throw
public class InvalidParameterException extends Exception { // Checked Exception
  public InvalidParameterException(String message){
    super(message);
  }
}
