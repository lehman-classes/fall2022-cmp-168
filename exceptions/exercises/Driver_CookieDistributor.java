public class Driver_CookieDistributor {

  public static void testCookieDistributor(int numCookies, int numPeople) {

    CookieDistributor cs = new CookieDistributor(numCookies, numPeople);
    int cookiesPerPerson = 0;
    try {
      cookiesPerPerson = cs.getNumCookiesPerPerson();//use risky method
    } catch (NotEnoughCookiesException e) {
      //e.printStackTrace();
      System.out.println("Caught "+e.getMessage());
    } catch (NoPeopleException e) {
      //e.printStackTrace();
      System.out.println("Caught "+e.getMessage());
    } 
    finally{
      System.out.println("cookies="+cs.getNumCookies()+" people="+cs.getNumPeople()+
    "\t cookies per person = "+cookiesPerPerson);
    }


    // CookieDistributor cd = new CookieDistributor(numCookies, numPeople);
    // try {
    //   System.out.println("result [" + cd.getNumCookies() + "/" + cd.getNumPeople() + "] = " + cd.getNumCookiesPerPerson());
    // } catch (NoPeopleException e) {
    //   System.err.println("NoPeopleException thrown. " + cd);
    // } catch (Exception e) {
    //   System.err.println("Something else is wrong.");
    // } finally {
    //   // add something here
    // }
  }
  
  public static void main(String[] args) {

    testCookieDistributor(10, 5);

    testCookieDistributor(10, 4);

    testCookieDistributor(5, 10);

    testCookieDistributor(5, 0);

    testCookieDistributor(0, 5);

    testCookieDistributor(10, 10);

    testCookieDistributor(0, 0);
    
  }
}
