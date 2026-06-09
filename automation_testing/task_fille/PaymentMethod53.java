package sessioin.a5;

//Base class
class PaymentMethod53 {

 // Parent pay() method
 void pay() {
     System.out.println("Processing payment...");
 }
}

//Subclass 1 — UPI Payment
class UpiPayment extends PaymentMethod {

 // Override parent pay() method
 @Override
 void pay() {
     System.out.println("✅ Payment of ₹500 done via UPI (PhonePe). Transaction ID: UPI123456");
 }
}

//Subclass 2 — Card Payment
class CardPayment extends PaymentMethod {

 // Override parent pay() method
 @Override
 void pay() {
     System.out.println("💳 Payment of ₹500 done via Credit Card ending in **9876. OTP verified.");
 }
}

public class PaymentDemo {
 public static void main(String[] args) {

     PaymentMethod pm;   // Parent reference

     // UPI object
     pm = new UpiPayment();
     pm.pay();

     System.out.println();

     // Card object
     pm = new CardPayment();
     pm.pay();
 }
}