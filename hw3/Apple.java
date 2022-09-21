
class Apple {

  /*
  Apple

  - year: int
  - sweet: boolean  // no setter

  + Apple() // default values to year=2020 and sweet=true
  + Apple(int y, boolean s) // set values of year=y and sweet=s

  + setYear(int y) // setter for year
  + isSweet() // return value of sweet
  */
  int year;
  boolean sweet;

  Apple() {
    this.year = 2020;
    this.sweet = true;
  }

  Apple(int y, boolean s) {
    this.year = y;
    this.sweet = s;
  }

  public void setYear(int y) {
    this.year = y;
  }

  public boolean isSweet() {
    return this.sweet;
  }
}
