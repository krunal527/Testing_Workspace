package session.a4;

public class FormatUserName44 
{
	 // Method — takes name, returns UPPERCASE + character count
    static String formatUserName(String name) {
        String upper = name.toUpperCase();
        int count    = name.length();
        return upper + " (" + count + ")";
    }

    public static void main(String[] args) {

        // Test with different names
        System.out.println(formatUserName("Virat"));
        System.out.println(formatUserName("Krunal"));
        System.out.println(formatUserName("Dhoni"));
        System.out.println(formatUserName("Rohit Sharma"));
    }

}
