import java.util.List;

public class OrderCalculator {
    public double calculateTotal(List<String> items) {
        double total = 0.0;
        for (String item : items) {
            total += getItemCost(item);
        }
        return total;
    }

    private double getItemCost(String item) {
        return 10.0;
    }
}
