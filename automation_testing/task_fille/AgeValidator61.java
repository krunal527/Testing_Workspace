package session.a6;

public class AgeValidator61 {

    // Method to convert String input to integer age
    static int getUserAge(String input) {
        try {
            int age = Integer.parseInt(input);  // May throw NumberFormatException
            System.out.println("✅ Valid age entered: " + age);
            return age;
        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid age entered");
            return -1;
        }
    }

    public static void main(String[] args) {

        // Test 1 — valid number
        getUserAge("25");

        // Test 2 — invalid string
        getUserAge("abc");

        // Test 3 — special characters
        getUserAge("@21");
    }
}