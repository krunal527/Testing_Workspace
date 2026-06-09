package session.s9;

//File 1: ValidationUtils.java
//Reusable utility class — can be used by any test class
class ValidationUtils94 {

 // Static method — no object needed
 // Returns true if username is 6+ characters
 static boolean isValidUsername(String username) {
     return username.length() >= 6;
 }

 // Bonus — also add password validation
 static boolean isValidPassword(String password) {
     return password.length() >= 8;
 }
}


//File 2: LoginTest.java
//Clean test class — no logic here, just calls utility
public class LoginTest {
 public static void main(String[] args) {

     // Test usernames
     String[] usernames = {"testuser", "ab", "krunal_qa", "usr"};

     System.out.println("👤 Username Validation Results:");
     System.out.println("--------------------------------");

     for (String username : usernames) {

         // Call moved to ValidationUtils — clean separation ✅
         if (ValidationUtils.isValidUsername(username)) {
             System.out.println("✅ '" + username + "' → Valid username");
         } else {
             System.out.println("❌ '" + username
                              + "' → Invalid (min 6 chars required)");
         }
     }
 }
}
