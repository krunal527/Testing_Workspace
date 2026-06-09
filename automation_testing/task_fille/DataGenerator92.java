package session.s9;
import java.util.Random;

public class DataGenerator92 {

    // Static — no object needed to call these methods
    static Random random = new Random();

    // Method 1 — generate random username
    static String generateUsername() {

        String[] prefixes = {"user", "test", "flipkart", "buyer", "shopper"};
        String prefix     = prefixes[random.nextInt(prefixes.length)];
        int number        = random.nextInt(9000) + 1000;  // 1000–9999
        return prefix + "_" + number;
    }

    // Method 2 — generate random password
    static String generatePassword() {

        String upper   = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower   = "abcdefghijklmnopqrstuvwxyz";
        String digits  = "0123456789";
        String special = "@#$!";
        String all     = upper + lower + digits + special;

        StringBuilder password = new StringBuilder();

        // Guarantee 1 of each type
        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(special.charAt(random.nextInt(special.length())));

        // Fill remaining 4 chars randomly
        for (int i = 0; i < 4; i++) {
            password.append(all.charAt(random.nextInt(all.length())));
        }

        return password.toString();
    }

    public static void main(String[] args) {

        System.out.println("🔐 Flipkart Test Credentials Generator");
        System.out.println("=======================================");

        // Generate 3 sets of test credentials
        for (int i = 1; i <= 3; i++) {
            System.out.println("Test User " + i + ":");
            System.out.println("  Username : " + generateUsername());
            System.out.println("  Password : " + generatePassword());
            System.out.println();
        }
    }
}