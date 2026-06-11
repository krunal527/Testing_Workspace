package task.assignment6;

import java.util.Scanner;

public class ZomatoPayment32 
{
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Select Payment Method (Paytm / PhonePe / UPI / Credit Card): ");
	        String method = sc.nextLine();

	        switch (method) {
	            case "Paytm":
	                System.out.println("Payment initiated via Paytm Wallet. ✅");
	                break;
	            case "PhonePe":
	                System.out.println("Redirecting to PhonePe app for payment. 📱");
	                break;
	            case "UPI":
	                System.out.println("Enter your UPI ID to complete payment. 💳");
	                break;
	            case "Credit Card":
	                System.out.println("Enter your Credit Card details securely. 🔒");
	                break;
	            default:
	                System.out.println("Invalid payment method selected. ❌");
	        }

	        sc.close();
	    }

}
