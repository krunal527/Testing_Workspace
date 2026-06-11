package session.s8;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestResultLogger85 {

    // Method — logs test name + status to file
    static void logTestResult(String testName, String status) {

        String timestamp = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String result = "[" + timestamp + "] "
                      + "Test: " + testName
                      + " | Status: " + status + "\n";

        try {
            // Append mode — keeps all test results
            FileWriter fw = new FileWriter("test_results.txt", true);
            fw.write(result);
            fw.close();

            // Console indicator
            String icon = status.equals("PASS") ? "✅" : "❌";
            System.out.println(icon + " " + testName + " → " + status);

        } catch (IOException e) {
            System.out.println("❌ Logging error: " + e.getMessage());
        }
    }

    // Method — reads and prints test_results.txt
    static void verifyResults() {
        System.out.println("\n📋 Verifying test_results.txt:");
        System.out.println("=================================");

        try {
            BufferedReader br = new BufferedReader(
                                    new FileReader("test_results.txt"));
            String line;
            int pass = 0, fail = 0;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                if (line.contains("PASS")) pass++;
                if (line.contains("FAIL")) fail++;
            }

            System.out.println("=================================");
            System.out.println("✅ PASS: " + pass
                             + "  |  ❌ FAIL: " + fail);
            br.close();

        } catch (IOException e) {
            System.out.println("❌ File read error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        System.out.println("🧪 Running Test Suite...\n");

        // Run 3 sample test cases
        logTestResult("TC01_LoginWithValidCredentials",   "PASS");
        logTestResult("TC02_LoginWithInvalidPassword",    "FAIL");
        logTestResult("TC03_SearchProductOnHomePage",     "PASS");

        // Verify file content
        verifyResults();
    }
}