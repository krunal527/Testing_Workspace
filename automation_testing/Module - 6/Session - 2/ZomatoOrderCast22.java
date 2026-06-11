package session.s2;
public class ZomatoOrderCast22 {
    public static void main(String[] args) {

        // Original order total — double (with paise/decimal)
        double orderTotal = 349.75;

        // Explicit casting — double → int
        // Decimal part is TRUNCATED (not rounded)
        int orderTotalInt = (int) orderTotal;

        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║   🍕 Zomato Coupon Eligibility   ║");
        System.out.println("╚══════════════════════════════════╝");

        System.out.println("Original Order Total (double) : ₹" + orderTotal);
        System.out.println("Casted Order Total   (int)    : ₹" + orderTotalInt);

        System.out.println();

        // Use int value for coupon check
        int couponMinimum = 300;
        if (orderTotalInt >= couponMinimum) {
            System.out.println("✅ Eligible for coupon! "
                             + "(₹" + orderTotalInt + " >= ₹" + couponMinimum + ")");
        } else {
            System.out.println("❌ Not eligible for coupon.");
        }
    }
}