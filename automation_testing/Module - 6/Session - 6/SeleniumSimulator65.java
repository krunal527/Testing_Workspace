package session.a6;

public class SeleniumSimulator65 {

    // Method — throws RuntimeException if element not present
    static void simulateElementClick(boolean isElementPresent) {
        if (!isElementPresent) {
            throw new RuntimeException(
                "NoSuchElementException: Element not located on page!"
            );
        }
        System.out.println("✅ Element found. Click action performed successfully.");
    }

    public static void main(String[] args) {

        // Test 1 — element present
        System.out.println("--- Test 1: Element Present ---");
        try {
            simulateElementClick(true);
        } catch (RuntimeException e) {
            System.out.println("❌ Element not found, automation failed.");
            System.out.println("   Reason: " + e.getMessage());
        }

        System.out.println();

        // Test 2 — element NOT present (triggers exception)
        System.out.println("--- Test 2: Element NOT Present ---");
        try {
            simulateElementClick(false);
        } catch (RuntimeException e) {
            System.out.println("❌ Element not found, automation failed.");
            System.out.println("   Reason: " + e.getMessage());
        }
    }
}