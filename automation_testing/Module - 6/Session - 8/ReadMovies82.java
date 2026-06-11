package session.s8;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadMovies82 {
    public static void main(String[] args) {

        try {
            // FileReader opens the file
            // BufferedReader reads line by line efficiently
            FileReader     fr = new FileReader("fav_movies.txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.println("🎬 My Favourite Movies:");
            System.out.println("------------------------");

            String line;
            int count = 1;

            // readLine() returns null when file ends
            while ((line = br.readLine()) != null) {
                System.out.println(count + ". " + line);
                count++;
            }

            System.out.println("------------------------");
            br.close();   // always close BufferedReader

        } catch (IOException e) {
            System.out.println("❌ File not found or error: " + e.getMessage());
        }
    }
}
