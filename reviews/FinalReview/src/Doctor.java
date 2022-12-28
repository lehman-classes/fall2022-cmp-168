
public class Doctor {

    Insurance insurance;

    int[][] invoices = new int[10000][10000];

    public int[][] getInvoices() {
        return invoices;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Doctor() {
        insurance = new Insurance();
    }

}
