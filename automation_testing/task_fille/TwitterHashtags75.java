package sessiion.s7;

import java.util.ArrayList;
import java.util.HashSet;

public class TwitterHashtags75 {
    public static void main(String[] args) {

        // Simulated hashtags scraped from trending Twitter feed
        // Same hashtag appears multiple times from different tweets
        String[] rawHashtags = {
            "#IPL2024", "#Bollywood", "#IPL2024",
            "#AI", "#Bollywood", "#Cricket",
            "#IPL2024", "#AI", "#Trending"
        };

        // ❌ Using List — stores duplicates
        ArrayList<String> hashtagList = new ArrayList<>();
        for (String tag : rawHashtags) {
            hashtagList.add(tag);
        }

        // ✅ Using Set — auto-removes duplicates
        HashSet<String> hashtagSet = new HashSet<>();
        for (String tag : rawHashtags) {
            hashtagSet.add(tag);
        }

        System.out.println("Total raw hashtags scraped : " + rawHashtags.length);
        System.out.println();

        System.out.println("📋 Using ArrayList (with duplicates):");
        System.out.println(hashtagList);
        System.out.println("Count: " + hashtagList.size());

        System.out.println();

        System.out.println("✅ Using HashSet (unique only):");
        System.out.println(hashtagSet);
        System.out.println("Count: " + hashtagSet.size());
    }
}
