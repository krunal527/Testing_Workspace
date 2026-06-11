package sessiion.s7;

import java.util.ArrayList;

public class SwiggyMenu71 {
    public static void main(String[] args) {

        // Create ArrayList and add 5 food items
        ArrayList<String> menuItems = new ArrayList<>();

        menuItems.add("Butter Chicken");
        menuItems.add("Paneer Tikka");
        menuItems.add("Veg Biryani");
        menuItems.add("Masala Dosa");
        menuItems.add("Chocolate Brownie");

        System.out.println("🍽️ Swiggy Menu Items:");
        System.out.println("----------------------");

        // for-each loop to print all items
        for (String item : menuItems) {
            System.out.println("✅ " + item);
        }

        System.out.println("----------------------");
        System.out.println("Total Items: " + menuItems.size());
    }
}