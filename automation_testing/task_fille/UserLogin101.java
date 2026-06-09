package session.s10;

import java.util.Scanner;

public class UserLogin101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════╗");
        System.out.println("║     🎵 MusicApp Login     ║");
        System.out.println("╚══════════════════════════╝");

        // Take input
        System.out.print("Enter Username : ");
        String username = sc.nextLine().trim();

        System.out.print("Enter Password : ");
        String password = sc.nextLine().trim();

        // Validate — neither field should be empty
        if (username.isEmpty() && password.isEmpty()) {
            System.out.println("❌ Error: Username and Password cannot be empty!");

        } else if (username.isEmpty()) {
            System.out.println("❌ Error: Username cannot be empty!");

        } else if (password.isEmpty()) {
            System.out.println("❌ Error: Password cannot be empty!");

        } else if (password.length() < 6) {
            System.out.println("❌ Error: Password must be at least 6 characters!");

        } else {
            System.out.println("✅ Login Successful! Welcome, " + username + "!");
        }

        sc.close();
    }
}