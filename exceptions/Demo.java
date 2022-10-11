public class Demo {


  public static boolean isAnInt(String input) throws NotANumberException, NumberTooLowException {
    for (char c : input.toCharArray()) {
     // System.out.println(c); 
      int value = (String.valueOf(c)).codePointAt(0);
      // System.out.println("value: " + value);
      if(value < 48 || value > 57 ) {
        throw new NotANumberException("Not a valid number");
        // return false;
      }
      if(value < 53) {
        int realValue = Character.digit(value, 10);
        throw new NumberTooLowException("Number: " + realValue + " is too low");
      }
    }
    return true;
  }

  /// This app allows the user to call this program with a number as argument
  public static void main(String[] args) {
    
    System.out.println("1");
    System.out.println("2");
    System.out.println("3");

    String input = "";
    try {
      input = args[0];
      System.out.println("abc");
      // int i = Integer.parseInt(args[0],10);
      if(isAnInt(input)) {
        // double y = 2/i;
        System.out.println("xyz");
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Hey you must provide an number as argument.");
      System.out.println(ex);
    } catch (NumberFormatException e) {
      System.out.println("Hey " + input + " is not a number. Please run again with a number as argument.");
      System.out.println(e);
    } catch (Exception e) {
      System.err.println("Not sure what happened. Please try again.");
      System.err.println(e);
    } finally {
      System.out.println("FINALLY - good place to write cleaning up code");
      System.out.println("like freeing up resources");
    }
   
    // if (args.length == 1) {
    //   String input = args[0];
    //
    //   System.out.println(input.codePointAt(0));
    //
    //   System.out.println(isAnInt(input));
    //
    //   if (isAnInt(input)) {
    //     int i = Integer.parseInt(args[0],10);
    //     System.out.println(i);
    //   }
    // }

    System.out.println("4");
  }
}
