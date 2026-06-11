package session.a6;

public class FlipkartPayment64 {

    // Method — divides 1000 by amount
    static void processPayment(int amount) {
        try {
            int result = 1000 / amount;   // ArithmeticException if amount = 0
            System.out.println("✅ Payment processed. Value: " + result);

        } catch (ArithmeticException e) {
            System.out.println("❌ Payment failed: Cannot divide by zero! " + e.getMessage());

        } finally {
            // Runs ALWAYS — success or failure
            System.out.println("📋 Payment attempt finished.");
        }
    }

    public static void main(String[] args) {

        // Test 1 — valid amount
        System.out.println("--- Test 1: amount = 200 ---");
        processPayment(200);

        System.out.println();

        // Test 2 — amount = 0 (triggers exception)
        System.out.println("--- Test 2: amount = 0 ---");
        processPayment(0);

        System.out.println();

        // Test 3 — valid amount
        System.out.println("--- Test 3: amount = 50 ---");
        processPayment(50);
    }
}