package sessiion.s7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FlipkartProducts73 {
    public static void main(String[] args) {

        // HashMap — product name → price
        HashMap<String, Integer> products = new HashMap<>();

        products.put("iPhone 15",       79999);
        products.put("Samsung TV 43\"", 35999);
        products.put("OnePlus Watch 2", 14999);
        products.put("Boat Earbuds",     2999);

        System.out.println("🛒 Flipkart Product Prices:");
        System.out.println("----------------------------");

        // Iterator to loop through HashMap entries
        Iterator<Map.Entry<String, Integer>> iterator
                = products.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("📦 " + entry.getKey()
                             + "  →  ₹" + entry.getValue());
        }

        System.out.println("----------------------------");
        System.out.println("Total Products: " + products.size());
    }
}
