package session.s8;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class IPLScoreFilter84
{
    public static void main(String[] args) {

        // Step 1 — Create sample ipl_scores.txt first
        try {
            FileWriter fw = new FileWriter("ipl_scores.txt");
            fw.write("MI vs CSK - 195\n");
            fw.write("RCB vs KKR - 172\n");
            fw.write("SRH vs DC - 210\n");
            fw.write("GT vs RR - 168\n");
            fw.write("LSG vs PBKS - 185\n");
            fw.write("CSK vs RCB - 220\n");
            fw.write("KKR vs MI - 155\n");
            fw.close();
            System.out.println("✅ ipl_scores.txt created");
        } catch (IOException e) {
            System.out.println("❌ " + e.getMessage());
        }

        System.out.println();

        // Step 2 — Read scores, filter above 180, write to high_scores.txt
        try {
            BufferedReader br = new BufferedReader(
                                    new FileReader("ipl_scores.txt"));
            FileWriter fw     = new FileWriter("high_scores.txt");

            fw.write("🏏 IPL High Scores (Above 180)\n");
            fw.write("================================\n");

            String line;
            int highScoreCount = 0;

            while ((line = br.readLine()) != null) {

                // Extract score — last part after "- "
                String[] parts = line.split("- ");
                int score = Integer.parseInt(parts[1].trim());

                if (score > 180) {
                    fw.write(line + "\n");
                    System.out.println("⭐ High Score: " + line);
                    highScoreCount++;
                } else {
                    System.out.println("   Skipped  : " + line);
                }
            }

            fw.write("================================\n");
            fw.write("Total High Score Matches: " + highScoreCount + "\n");

            br.close();
            fw.close();

            System.out.println("\n✅ high_scores.txt written successfully!");
            System.out.println("Total high score matches: " + highScoreCount);

        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}