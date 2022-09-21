class Phone {
// base class - a.k.a. parent class


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

  @Override
  public String toString() {
    return "battery: " + this.battery
      + " chargingPort: " + this.chargingPort
      + " key: " + this.key
      + " screen: " + this.screen
    ;
  }
}
