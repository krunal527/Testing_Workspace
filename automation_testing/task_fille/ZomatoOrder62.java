package session.a6;

public class ZomatoOrder62 {

    // Method throws exception if amount is less than 1
    static void placeOrder(String restaurant, int amount) {
        if (amount < 1) {
            throw new IllegalArgumentException(
                "❌ Order amount must be at least ₹1. Invalid amount: ₹" + amount
            );
        }
        System.out.println("✅ Order placed at " + restaurant + " for ₹" + amount);
    }

    public static void main(String[] args) {

        // Test 1 — valid order
        try {
            placeOrder("Dominos", 350);
        } catch (IllegalArgumentException e) {
            System.out.println("Order Error: " + e.getMessage());
        }

        System.out.println();

        // Test 2 — invalid amount (0)
        try {
            placeOrder("McDonald's", 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Order Error: " + e.getMessage());
        }

        System.out.println();

        // Test 3 — negative amount
        try {
            placeOrder("KFC", -100);
        } catch (IllegalArgumentException e) {
            System.out.println("Order Error: " + e.getMessage());
        }
    }
}