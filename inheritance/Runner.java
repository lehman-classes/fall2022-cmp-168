public class Runner {
  public static void main(String[] args) {
    
    // Phone iPhoneV1 = new Phone("B1", "P1", "K1", "S1" );
    // System.out.println(iPhoneV1);

    PhoneV2 iPhoneV2 = new PhoneV2("B2", "P2", "k2", "S2");
    System.out.println(iPhoneV2);
    
    PhoneV3 iPhoneV3 = new PhoneV3("B3", "P3", "k3", "S3");
    iPhoneV3.writing();
    System.out.println(iPhoneV3);

    Charger.charge(iPhoneV2);
    Charger.charge(iPhoneV3);
  }
}
