package session.a4;

public class PaymentCheck43 
{
	 public static void main(String[] args) {

	        String expectedMessage = "Payment Successful";
	        String actualMessage   = "payment successful";

	        System.out.println("Expected : " + expectedMessage);
	        System.out.println("Actual   : " + actualMessage);
	        System.out.println("----------------------------------");

	        // equalsIgnoreCase() — ignores UPPER/lower case difference
	        if (expectedMessage.equalsIgnoreCase(actualMessage)) {
	            System.out.println("✅ Messages MATCH (case ignored)");
	        } else {
	            System.out.println("❌ Messages DO NOT match");
	        }
	    }

}
