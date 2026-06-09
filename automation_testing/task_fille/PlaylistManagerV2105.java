package session.s10;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// ─────────────────────────────────────────
// Song class — represents a single song
// ─────────────────────────────────────────
class Song {
    String title;
    String artist;

    // Constructor
    Song(String title, String artist) {
        this.title  = title;
        this.artist = artist;
    }

    // Display format
    @Override
    public String toString() {
        return "\"" + title + "\" by " + artist;
    }
}

// ─────────────────────────────────────────
// Refactored PlaylistManager — stores Song objects
// ─────────────────────────────────────────
public class PlaylistManagerV2105 {

    static ArrayList<Song> playlist = new ArrayList<>();
    static final String LOG_FILE    = "playlist_log.txt";

    // ── View Playlist ──────────────────────
    static void viewPlaylist() {
        System.out.println("\n🎵 Your Playlist:");
        System.out.println("---------------------------");
        if (playlist.isEmpty()) {
            System.out.println("   (No songs yet)");
        } else {
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + playlist.get(i));
            }
        }
        System.out.println("---------------------------");
        System.out.println("Total Songs: " + playlist.size() + "\n");
    }

    // ── Add Song ───────────────────────────
    static void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        playlist.add(newSong);
        System.out.println("✅ Added: " + newSong);
        logAction("ADD", newSong.toString());
        viewPlaylist();
    }

    // ── Remove Song by Title ───────────────
    static void removeSong(String title) {
        Song found = null;

        // Search for song by title (case-insensitive)
        for (Song s : playlist) {
            if (s.title.equalsIgnoreCase(title)) {
                found = s;
                break;
            }
        }

        // Throw exception if not found
        if (found == null) {
            throw new IllegalArgumentException(
                "Song not found: '" + title + "'"
            );
        }

        playlist.remove(found);
        System.out.println("🗑️  Removed: " + found);
        logAction("REMOVE", found.toString());
        viewPlaylist();
    }

    // ── Log to File ────────────────────────
    static void logAction(String action, String detail) {
        String timestamp = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String entry = "[" + timestamp + "] " + action + " → " + detail;

        try (BufferedWriter bw = new BufferedWriter(
                                     new FileWriter(LOG_FILE, true))) {
            bw.write(entry);
            bw.newLine();
            System.out.println("📝 Logged: " + entry);
        } catch (IOException e) {
            System.out.println("❌ Log error: " + e.getMessage());
        }
    }

    // ── Main Menu ──────────────────────────
    public static void main(String[] args) {

        Scanner sc      = new Scanner(System.in);
        boolean running = true;

        System.out.println("╔════════════════════════════════╗");
        System.out.println("║   🎵 PlaylistManager v2.0      ║");
        System.out.println("║   (Now with Song Objects!)     ║");
        System.out.println("╚════════════════════════════════╝\n");

        while (running) {
            System.out.println("1. Add Song");
            System.out.println("2. View Playlist");
            System.out.println("3. Remove Song");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            String choice = sc.nextLine().trim();

            switch (choice) {

                case "1":
                    System.out.print("Enter song title  : ");
                    String title = sc.nextLine().trim();
                    System.out.print("Enter artist name : ");
                    String artist = sc.nextLine().trim();
                    addSong(title, artist);
                    break;

                case "2":
                    viewPlaylist();
                    break;

                case "3":
                    System.out.print("Enter song title to remove: ");
                    String removeTitle = sc.nextLine().trim();
                    try {
                        removeSong(removeTitle);
                    } catch (IllegalArgumentException e) {
                        System.out.println("❌ Error: " + e.getMessage());
                        logAction("REMOVE_FAILED", removeTitle);
                        System.out.println();
                    }
                    break;

                case "4":
                    System.out.println("👋 Goodbye! Happy Listening 🎧");
                    running = false;
                    break;

                default:
                    System.out.println("⚠️  Invalid option.\n");
            }
        }
        sc.close();
    }
}