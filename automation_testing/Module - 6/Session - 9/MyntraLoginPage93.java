package session.s9;

public class MyntraLoginPage93 {

    // POM — represents the Login Page of Myntra
    // Each method = one UI action on that page

    // Page URL (would be used in real Selenium)
    String pageUrl = "https://www.myntra.com/login";

    // Method 1 — enter username into username field
    void enterUsername(String username) {
        System.out.println("📝 Entering username: '" + username
                         + "' into the Username field");
    }

    // Method 2 — enter password into password field
    void enterPassword(String password) {
        System.out.println("🔑 Entering password: '****'"
                         + " into the Password field");
    }

    // Method 3 — click the Login button
    void clickLoginButton() {
        System.out.println("🖱️  Clicking the LOGIN button");
    }

    // Bonus — a full login flow method using the 3 methods above
    void login(String username, String password) {
        System.out.println("\n🌐 Navigating to: " + pageUrl);
        System.out.println("----------------------------------------");
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
        System.out.println("----------------------------------------");
        System.out.println("✅ Login action completed\n");
    }

    public static void main(String[] args) {

        // Create page object
        MyntraLoginPage loginPage = new MyntraLoginPage();

        // Test Case 1 — valid login
        System.out.println("=== TC01: Valid Login ===");
        loginPage.login("krunal_dev", "Pass@1234");

        // Test Case 2 — invalid login
        System.out.println("=== TC02: Invalid Login ===");
        loginPage.login("ab", "123");
    }
}
