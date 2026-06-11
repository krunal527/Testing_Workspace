package sessioin.a5;

public class InputValidator52
{
	 // Method 1 — validates String username (min 4 chars)
    boolean validateInput(String username) {
        if (username.length() >= 4) {
            return true;
        } else {
            return false;
        }
    }

    // Method 2 — validates int age (18 or above)
    // SAME method name, DIFFERENT parameter type = Overloading ✅
    boolean validateInput(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        InputValidator iv = new InputValidator();

        // Test username
        System.out.println("Username 'Kr'     → Valid: " + iv.validateInput("Kr"));
        System.out.println("Username 'Krunal' → Valid: " + iv.validateInput("Krunal"));

        System.out.println();

        // Test age
        System.out.println("Age 15 → Valid: " + iv.validateInput(15));
        System.out.println("Age 21 → Valid: " + iv.validateInput(21));
    }

}
