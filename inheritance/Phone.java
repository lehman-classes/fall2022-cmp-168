// abstract classes
abstract class Phone {
// base class - a.k.a. parent

  String battery;
  String chargingPort;
  String key;
  String screen;

  // constructor
  Phone(String battery, String chargingPort, String key, String screen) {
    this.battery = battery;
    this.chargingPort = chargingPort;
    this.key = key;
    this.screen = screen;
  }

  abstract void charging(); 

  @Override
  public String toString() {
    return "battery: " + this.battery
      + " chargingPort: " + this.chargingPort
      + " key: " + this.key
      + " screen: " + this.screen
    ;
  }
}
