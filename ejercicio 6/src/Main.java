public class Main {
    public static void main(String[] args) {
        TaxStrategy usaTaxStrategy = new USATaxStrategy();
        TaxCalculator usaTaxCalculator = new TaxCalculator(usaTaxStrategy);
        System.out.println("Impuesto en USA: " + usaTaxCalculator.calculateTax());

        TaxStrategy ukTaxStrategy = new UKTaxStrategy();
        TaxCalculator ukTaxCalculator = new TaxCalculator(ukTaxStrategy);
        System.out.println("Impuesto en UK: " + ukTaxCalculator.calculateTax());
    }
}
