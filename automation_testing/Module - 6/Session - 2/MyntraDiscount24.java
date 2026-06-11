package session.s2;

public class MyntraDiscount24 {
    public static void main(String[] args) {

        // ── Test Data ──────────────────────────────────────
        double  cartValue    = 1799.00;
        boolean isLoggedIn   = true;
        boolean isFirstOrder = true;

        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║   👗 Myntra Discount Checker     ║");
        System.out.println("╚══════════════════════════════════╝");

        System.out.println("Cart Value    : ₹" + cartValue);
        System.out.println("Is Logged In  : " + isLoggedIn);
        System.out.println("Is First Order: " + isFirstOrder);
        System.out.println();

        // ── Arithmetic Operator: cartValue >= 1500 ─────────
        boolean cartCheck   = cartValue >= 1500;      // Relational

        // ── Logical AND: all 3 must be true ───────────────
        boolean isEligible  = cartCheck               // Relational
                           && isLoggedIn              // Logical &&
                           && isFirstOrder;           // Logical &&

        System.out.println("📋 Condition Breakdown:");
        System.out.println("cartValue >= 1500  → " + cartCheck);
        System.out.println("isLoggedIn         → " + isLoggedIn);
        System.out.println("isFirstOrder       → " + isFirstOrder);
        System.out.println();

        System.out.println("🎯 Eligible for Myntra Discount: " + isEligible);

        if (isEligible) {
            System.out.println("✅ Discount Applied: 20% OFF on your first order!");
        } else {
            System.out.println("❌ Not eligible. Check conditions above.");
        }
    }
}