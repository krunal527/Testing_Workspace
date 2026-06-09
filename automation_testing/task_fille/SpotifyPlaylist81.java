package session.s8;

import java.io.FileWriter;
import java.io.IOException;

public class SpotifyPlaylist81 {
    public static void main(String[] args) {

        // 5 song names to write
        String[] songs = {
            "Kesariya - Arijit Singh",
            "Tum Se Hi - Mohit Chauhan",
            "Raataan Lambiyan - Jubin Nautiyal",
            "Apna Bana Le - Arijit Singh",
            "Phle Pyaar Ka Pehla Gham - KK"
        };

        try {
            // FileWriter — creates file if not exists
            // false = overwrite mode (default)
            FileWriter fw = new FileWriter("my_playlist.txt", false);

            fw.write("🎵 My Spotify Playlist\n");
            fw.write("========================\n");

            for (int i = 0; i < songs.length; i++) {
                fw.write((i + 1) + ". " + songs[i] + "\n");
            }

            fw.close();   // always close after writing
            System.out.println("✅ my_playlist.txt created successfully!");

        } catch (IOException e) {
            System.out.println("❌ Error writing file: " + e.getMessage());
        }
    }
}
