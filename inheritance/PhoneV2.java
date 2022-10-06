public class PhoneV2 extends Phone{
  // derived class - a.k.a. child

  // new feature
  private String eSim;

  // constructor
  PhoneV2(String battery, String chargingPort, String key, String screen) {
    super(battery, chargingPort, key, screen);
    this.eSim = "new-esim";
  }

  public void charging() {

    // charging from PhoneV2
    System.out.println("charging from V2");
  }

  // setter
  public void seteSim(String value) {
    this.eSim = value;
  }

  // getter 
  public String geteSim() {
    return this.eSim;
  }

  @Override
  public String toString() {
    return super.toString() + " eSim: " + this.eSim;
  }
 
}
