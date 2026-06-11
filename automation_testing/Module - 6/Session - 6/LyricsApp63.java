package session.a6;

//Step 1 — Create Custom Exception class
class LyricsNotFoundException extends Exception {
 LyricsNotFoundException(String message) {
     super(message);   // passes message to parent Exception class
 }
}

public class LyricsApp63 {

 // Step 2 — Method that always throws custom exception
 // 'throws' keyword declares it in method signature
 static void fetchSongLyrics(String songName) throws LyricsNotFoundException {
     // Simulating — lyrics not found in database
     throw new LyricsNotFoundException(
         "Lyrics not found for this song: " + songName
     );
 }

 public static void main(String[] args) {

     // Test 1
     try {
         fetchSongLyrics("Kesariya");
     } catch (LyricsNotFoundException e) {
         System.out.println("❌ " + e.getMessage());
     }

     System.out.println();

     // Test 2
     try {
         fetchSongLyrics("Tum Se Hi");
     } catch (LyricsNotFoundException e) {
         System.out.println("❌ " + e.getMessage());
     }
 }
}