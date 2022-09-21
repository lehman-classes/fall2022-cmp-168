public class Runner {
  public static void main(String[] args) {
    
    Phone iPhoneV1 = new Phone("B1", "P1", "K1", "S1" );
    System.out.println(iPhoneV1);

    PhoneV2 iPhoneV2 = new PhoneV2("B2", "P2", "k2", "S2");
    iPhoneV2.seteSim("cool");
    System.out.println(iPhoneV2);
    
  }
}
