package task.assignment6;

import java.util.Scanner;

public class PrimeOfferCheck35 
{
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter membership type (Prime / Regular): ");
        String membership = sc.nextLine();

        System.out.print("Enter loyalty points: ");
        int points = sc.nextInt();

        // Outer if — check membership
        if (membership.equals("Prime")) {

            // Inner if — check loyalty points
            if (points > 500) {
                System.out.println("🎉 Eligible for Special Offer!");
            } else {
                System.out.println("❌ Not Eligible — Need more than 500 loyalty points.");
            }

        } else {
            System.out.println("❌ Not Eligible — Prime membership required.");
        }

        sc.close();
    }


}
