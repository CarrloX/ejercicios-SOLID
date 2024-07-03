import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");

        Order order = new Order(items);

        System.out.println("Order Items:");
        for (String item : order.getItems()) {
            System.out.println("- " + item);
        }
        System.out.println("Total Amount: $" + order.getTotalAmount());

        order.saveToDatabase();
    }
}