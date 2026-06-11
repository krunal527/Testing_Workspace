package session.s8;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ZomatoOrderLog83
{

    // Method — appends order entry with timestamp
    static void logOrder(String orderDetails) {

        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter
            = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = now.format(formatter);

        // Full log line
        String logEntry = timestamp + " - Ordered: " + orderDetails + "\n";

        try {
            // true = APPEND mode — adds to file without deleting old data
            FileWriter fw = new FileWriter("zomato_orders.log", true);
            fw.write(logEntry);
            fw.close();
            System.out.println("✅ Order logged: " + logEntry.trim());

        } catch (IOException e) {
            System.out.println("❌ Error logging order: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Simulate 3 order entries
        logOrder("Paneer Tikka");
        logOrder("Veg Biryani + Raita");
        logOrder("Butter Naan x2 + Dal Makhani");
    }
}
