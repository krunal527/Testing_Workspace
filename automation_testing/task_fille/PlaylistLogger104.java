package session.s10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PlaylistLogger104 {

    static final String LOG_FILE = "playlist_log.txt";

    // Log action to file with timestamp
    static void logAction(String action, String songName) {

        String timestamp = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String logEntry = "[" + timestamp + "] "
                        + action.toUpperCase()
                        + " → " + songName;

        // Append mode = true (don't overwrite old logs)
        try (BufferedWriter bw = new BufferedWriter(
                                     new FileWriter(LOG_FILE, true))) {
            bw.write(logEntry);
            bw.newLine();
            System.out.println("📝 Logged: " + logEntry);

        } catch (IOException e) {
            System.out.println("❌ Logging failed: " + e.getMessage());
        }
    }

    // Updated addSong — now also logs
    static void addSong(String songName) {
        PlaylistManager.playlist.add(songName);
        System.out.println("✅ Added: '" + songName + "'");
        logAction("ADD", songName);           // log to file ✅
        PlaylistManager.viewPlaylist();
    }

    // Updated removeSong — now also logs
    static void removeSong(String songName) {
        if (!PlaylistManager.playlist.contains(songName)) {
            throw new IllegalArgumentException(
                "Song not found: '" + songName + "'"
            );
        }
        PlaylistManager.playlist.remove(songName);
        System.out.println("🗑️  Removed: '" + songName + "'");
        logAction("REMOVE", songName);        // log to file ✅
        PlaylistManager.viewPlaylist();
    }

    public static void main(String[] args) {

        // Test logging
        addSong("Kesariya");
        addSong("Raataan Lambiyan");
        addSong("Apna Bana Le");

        try {
            removeSong("Kesariya");
            removeSong("Tum Se Hi");   // does not exist → exception
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
            logAction("REMOVE_FAILED", "Tum Se Hi");
        }
    }
}