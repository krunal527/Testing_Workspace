package session.s2;

public class WhatsAppMessages23 {
    public static void main(String[] args) {

        // String representing unread message count
        String unreadStr = "12";

        System.out.println("📱 WhatsApp Unread Messages");
        System.out.println("---------------------------");
        System.out.println("Original count (String) : \"" + unreadStr + "\"");

        // Step 1 — Convert String → int using Integer.parseInt()
        int unreadCount = Integer.parseInt(unreadStr);

        // Step 2 — Add 5 new messages
        int updatedCount = unreadCount + 5;
        System.out.println("New messages received   :  + 5");

        // Step 3 — Convert int → String using String.valueOf()
        String updatedStr = String.valueOf(updatedCount);

        System.out.println("Updated count  (int)    :  " + updatedCount);
        System.out.println("Updated count  (String) : \"" + updatedStr + "\"");

        System.out.println();

        // Show data type proof
        System.out.println("📋 Type Conversion Flow:");
        System.out.println("\"12\" (String)");
        System.out.println("  ↓ Integer.parseInt()");
        System.out.println(" 12  (int) + 5 = 17 (int)");
        System.out.println("  ↓ String.valueOf()");
        System.out.println("\"17\" (String)");
    }
}