public class TaxUtil {

    public double calculateTax(double amount,double rate) {
        return amount * rate;
    }


    public static void main(String[] args) {
        TaxUtil obj = new TaxUtil();
        System.out.println(obj.calculateTax(100,10));
    }
}
