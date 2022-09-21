public class PhoneV2 extends Phone{

  private String eSim;

  PhoneV2(String battery, String chargingPort, String key, String screen) {

    super(battery, chargingPort, key, screen);
  }

  public void seteSim(String value) {
    this.eSim = value;
  }

  public String geteSim() {
    return this.eSim;
  }

  @Override
  public String toString() {
    return super.toString() + " eSim: " + this.eSim;
  }
 
}
