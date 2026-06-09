package session.s9;

import java.util.List;
import java.util.ArrayList;

public class ZomatoUtils95 {

    // -------------------------------------------------------
    // Method 1: validateRestaurantRating(double rating)
    // Checks if a displayed rating is within valid range (1.0–5.0)
    // Used in test: verify ratings shown on restaurant cards
    // -------------------------------------------------------
    static boolean validateRestaurantRating(double rating) {
        boolean isValid = (rating >= 1.0 && rating <= 5.0);
        System.out.println("⭐ Rating " + rating
                         + " → " + (isValid ? "Valid ✅" : "Invalid ❌"));
        return isValid;
    }

    // -------------------------------------------------------
    // Method 2: isDeliveryTimeAcceptable(int minutes)
    // Checks if estimated delivery time is within 90 minutes
    // Used in test: verify delivery time displayed on UI
    // -------------------------------------------------------
    static boolean isDeliveryTimeAcceptable(int minutes) {
        boolean isOk = (minutes > 0 && minutes <= 90);
        System.out.println("🕐 Delivery in " + minutes + " min → "
                         + (isOk ? "Acceptable ✅" : "Too Long ❌"));
        return isOk;
    }

    // -------------------------------------------------------
    // Method 3: calculateDiscountedPrice(double price, int percent)
    // Calculates final price after applying coupon/discount
    // Used in test: verify promo code discount applied correctly
    // -------------------------------------------------------
    static double calculateDiscountedPrice(double price, int discountPercent) {
        double discount = (price * discountPercent) / 100;
        double finalPrice = price - discount;
        System.out.println("💰 ₹" + price + " - " + discountPercent
                         + "% off → Final: ₹" + finalPrice);
        return finalPrice;
    }

    // -------------------------------------------------------
    // Run all 3 utility methods to demo usage
    // -------------------------------------------------------
    public static void main(String[] args) {

        System.out.println("🍽️  ZomatoUtils — Test Automation Utilities");
        System.out.println("============================================");

        // Test Method 1 — Rating validation
        System.out.println("\n📌 Method 1: validateRestaurantRating()");
        ZomatoUtils.validateRestaurantRating(4.2);
        ZomatoUtils.validateRestaurantRating(0.5);
        ZomatoUtils.validateRestaurantRating(5.0);

        // Test Method 2 — Delivery time check
        System.out.println("\n📌 Method 2: isDeliveryTimeAcceptable()");
        ZomatoUtils.isDeliveryTimeAcceptable(35);
        ZomatoUtils.isDeliveryTimeAcceptable(100);
        ZomatoUtils.isDeliveryTimeAcceptable(0);

        // Test Method 3 — Discount calculator
        System.out.println("\n📌 Method 3: calculateDiscountedPrice()");
        ZomatoUtils.calculateDiscountedPrice(500, 20);
        ZomatoUtils.calculateDiscountedPrice(999, 10);
        ZomatoUtils.calculateDiscountedPrice(1200, 30);
    }
}