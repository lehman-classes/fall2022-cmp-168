public class NoPeopleException extends Exception {
  
  public NoPeopleException() {
    super("NoPeopleException");
  }

  public NoPeopleException(String message) {
    super("NoPeopleException: " + message);
  }
}
