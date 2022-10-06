public class PhoneV3 extends Phone implements IntlChina {

  private String speaker;

  // constructor  
  PhoneV3(String battery, String chargingPort, String key, String screen) {
    super(battery, chargingPort, key, screen);
    speaker = "new-speaker";
  }

  public void charging() {
    System.out.println("charging V3");
  }

  public void writing() {
    System.out.println("writing-china-version");
  }

  @Override
  public String toString() {
    return super.toString() + " speaker: " + speaker;
  }
}
