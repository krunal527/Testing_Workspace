package session.s2;

public class FlipkartLoginData21 {
    public static void main(String[] args) {

        // ── Variable Declarations ──────────────────────────
        String  username           = "krunal_test";   // String
        String  password           = "Flip@1234";     // String
        boolean isRememberMeChecked = true;           // boolean
        int     loginAttempts      = 1;               // int

        // ── Print All Variables ────────────────────────────
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║   🛒 Flipkart Login Test Data    ║");
        System.out.println("╚══════════════════════════════════╝");

        System.out.println("Username             : " + username);
        System.out.println("Password             : " + password);
        System.out.println("Remember Me Checked  : " + isRememberMeChecked);
        System.out.println("Login Attempts       : " + loginAttempts);

        // ── Data Type Info ─────────────────────────────────
        System.out.println("\n📋 Data Types Used:");
        System.out.println("username            → " + ((Object)username).getClass().getSimpleName());
        System.out.println("isRememberMeChecked → boolean");
        System.out.println("loginAttempts       → int");
    }
}
