public class CookieDistributor {
 
  private int numPeople;
  private int numCookies;

  public CookieDistributor() {
    this.numPeople = 0;
    this.numCookies = 0;
  }

  public CookieDistributor(int numCookies, int numPeople) {
    if(numCookies < 0 || numPeople < 0) {
      System.out.println("Cookies and/or People must be greater than 0");
      return;
    }
    this.numCookies = numCookies;
    this.numPeople = numPeople;
  }

  public int getNumCookiesPerPerson() throws NoPeopleException, NotEnoughCookiesException {
    int numCookiesPerPerson;
		if(numPeople == 0){
			throw new NoPeopleException(" there are zero people to feed");
		}
		else if(numCookies < numPeople){
			String message = "there are only "+numCookies+" cookies, but "+numPeople+" people";
			message += "\nBake at least "+(numPeople-numCookies)+" more cookies";
			throw new  NotEnoughCookiesException(message);
		}
		else{
			numCookiesPerPerson= numCookies / numPeople;
		}
		return numCookiesPerPerson;
    // int numCookiesPerPerson;
    // if(numPeople == 0) {
    //   throw new NoPeopleException("there are zero people to feed");
    // } else {
    //   numCookiesPerPerson = numCookies/numPeople;
    // }
    // return numCookiesPerPerson;
  }

  public int getNumPeople() {
    return this.numPeople;
  }

  public int getNumCookies() {
    return this.numCookies;
  }

  public void setNumPeople(int numPeople) {
    this.numPeople = numPeople;
  }

  public void setNumCookies(int numCookies) {
    this.numCookies = numCookies;
  }

  public void increaseNumPeople() {
    this.numPeople++;
  }

  public void increaseNumPeople(int people) {
    this.numPeople = this.numPeople + people;
  }

  public void increaseNumCookies() {
    this.numCookies = this.numCookies + 1;
  }

  public void increaseNumCookies(int cookies) {
    this.numCookies = this.numCookies + cookies;
  }

  @Override
  public String toString() {
    return "CookieSplitter[numPeople=" + numPeople + ", numCookies=" + numCookies + "]";
  }
}
