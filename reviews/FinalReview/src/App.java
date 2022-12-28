public class App {
    public static void main(String[] args) throws Exception {
        Patient p = new Patient("name", 1, "");
        // Patient copy = p.getCopy();
        Patient copy = (Patient) p.clone();

        System.out.println(p.getName());
        System.out.println(copy.getName());

        System.out.println(p.getHospital().getDoctor().getInvoices().length);
        System.out.println(copy.getHospital().getDoctor().getInvoices().length);


        System.out.println(p.getClass());
        System.out.println(copy.getClass());

        System.out.println(p.hashCode());
        System.out.println(copy.hashCode());

        System.out.println(p.equals(copy));
        p.equals(copy);

    }
}
