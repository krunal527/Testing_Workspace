package session.s10;

import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistManager102 {

    // ArrayList to store song names
    static ArrayList<String> playlist = new ArrayList<>();

    // Display full playlist
    static void viewPlaylist() {
        System.out.println("\n🎵 Your Playlist:");
        System.out.println("------------------");
        if (playlist.isEmpty()) {
            System.out.println("   (No songs yet)");
        } else {
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + playlist.get(i));
            }
        }
        System.out.println("------------------");
        System.out.println("Total Songs: " + playlist.size() + "\n");
    }

    // Add a song
    static void addSong(String songName) {
        playlist.add(songName);
        System.out.println("✅ Added: '" + songName + "'");
        viewPlaylist();
    }

    // Remove a song by name
    static void removeSong(String songName) {
        if (!playlist.contains(songName)) {
            // Task 3 — exception handling added here
            throw new IllegalArgumentException(
                "Song not found in playlist: '" + songName + "'"
            );
        }
        playlist.remove(songName);
        System.out.println("🗑️  Removed: '" + songName + "'");
        viewPlaylist();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║   🎵 PlaylistManager v1.0    ║");
        System.out.println("╚══════════════════════════════╝");

        while (running) {
            System.out.println("1. Add Song");
            System.out.println("2. View Playlist");
            System.out.println("3. Remove Song");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter song name: ");
                    String addName = sc.nextLine().trim();
                    addSong(addName);
                    break;

                case "2":
                    viewPlaylist();
                    break;

                case "3":
                    System.out.print("Enter song to remove: ");
                    String removeName = sc.nextLine().trim();

                    // Task 3 — try-catch for missing song
                    try {
                        removeSong(removeName);
                    } catch (IllegalArgumentException e) {
                        System.out.println("❌ Error: " + e.getMessage() + "\n");
                    }
                    break;

                case "4":
                    System.out.println("👋 Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("⚠️  Invalid option. Try again.\n");
            }
        }
        sc.close();
    }
}