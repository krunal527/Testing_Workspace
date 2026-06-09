package session.s9;

public class ProductRepository91 {

    // Inner class to hold product data
    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name  = name;
            this.price = price;
        }
    }

    // Array of 5 products
    Product[] products = {
        new Product("iPhone 15",        79999.00),
        new Product("Samsung Galaxy S24",65999.00),
        new Product("OnePlus 12",        64999.00),
        new Product("Boat Earbuds",       2999.00),
        new Product("MacBook Air M2",   114999.00)
    };

    // Method — search product by name, return price
    double getProductByName(String name) {

        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                return p.price;
            }
        }
        return -1;   // -1 means product not found
    }

    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        // Test 1 — product exists
        String search1 = "Boat Earbuds";
        double price1  = repo.getProductByName(search1);
        if (price1 != -1) {
            System.out.println("✅ " + search1 + " → ₹" + price1);
        } else {
            System.out.println("❌ Product not found: " + search1);
        }

        // Test 2 — product exists (case-insensitive)
        String search2 = "iphone 15";
        double price2  = repo.getProductByName(search2);
        if (price2 != -1) {
            System.out.println("✅ " + search2 + " → ₹" + price2);
        } else {
            System.out.println("❌ Product not found: " + search2);
        }

        // Test 3 — product does NOT exist
        String search3 = "Google Pixel 8";
        double price3  = repo.getProductByName(search3);
        if (price3 != -1) {
            System.out.println("✅ " + search3 + " → ₹" + price3);
        } else {
            System.out.println("❌ Product not found: " + search3);
        }
    }
}