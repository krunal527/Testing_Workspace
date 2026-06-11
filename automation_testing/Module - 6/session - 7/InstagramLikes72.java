package sessiion.s7;

import java.util.HashSet;

public class InstagramLikes72 {
    public static void main(String[] args) {

        // HashSet automatically removes duplicates
        HashSet<String> likedBy = new HashSet<>();

        // Adding usernames — including duplicates intentionally
        likedBy.add("krunal_dev");
        likedBy.add("riya.sharma");
        likedBy.add("rohit_99");
        likedBy.add("krunal_dev");    // duplicate ❌ — will be ignored
        likedBy.add("priya_official");
        likedBy.add("riya.sharma");   // duplicate ❌ — will be ignored
        likedBy.add("dev_monk");

        System.out.println("❤️  Unique Users Who Liked This Post:");
        System.out.println("---------------------------------------");

        for (String user : likedBy) {
            System.out.println("👤 " + user);
        }

        System.out.println("---------------------------------------");
        System.out.println("Total Unique Likes: " + likedBy.size());
    }
}