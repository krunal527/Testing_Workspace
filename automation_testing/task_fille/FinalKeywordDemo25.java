package session.s2;

public class FinalKeywordDemo25
{
    public static void main(String[] args) {

        // ── The Code in Question ───────────────────────────
        final int MAX_LIMIT = 10;

        System.out.println("MAX_LIMIT = " + MAX_LIMIT);

        // ── What final does ────────────────────────────────
        // Trying to change it → COMPILE ERROR ❌
        // MAX_LIMIT = 20;
        // Error: cannot assign a value to final variable MAX_LIMIT

        // ── Real use: OTP attempt limit ───────────────────
        final int MAX_OTP_ATTEMPTS = 3;
        int currentAttempts        = 0;

        System.out.println("\n🔐 OTP Login Simulation:");

        while (currentAttempts < MAX_OTP_ATTEMPTS) {
            currentAttempts++;
            System.out.println("Attempt " + currentAttempts
                             + " of " + MAX_OTP_ATTEMPTS);
        }
        System.out.println("❌ Max OTP attempts reached. Account locked.");
    }
}
