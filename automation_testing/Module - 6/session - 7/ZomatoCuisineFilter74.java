package sessiion.s7;

import java.util.ArrayList;

public class ZomatoCuisineFilter74 {
    public static void main(String[] args) {

        // Expected options — what SHOULD be in the dropdown
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Indian");
        expected.add("Chinese");
        expected.add("Italian");
        expected.add("Mexican");
        expected.add("Continental");

        // Actual options — what UI is SHOWING (simulated)
        ArrayList<String> actual = new ArrayList<>();
        actual.add("Indian");
        actual.add("Chinese");
        actual.add("Italian");
        actual.add("Thai");           // extra — not in expected ❌
        // Mexican is missing          // missing from actual ❌
        // Continental is missing      // missing from actual ❌

        System.out.println("📋 Expected Options : " + expected);
        System.out.println("📋 Actual Options   : " + actual);
        System.out.println("--------------------------------------------");

        // Check 1 — does actual contain ALL expected?
        if (expected.containsAll(actual) && actual.containsAll(expected)) {
            System.out.println("✅ Dropdown options match perfectly!");
        } else {
            System.out.println("❌ Mismatch found in dropdown options!");
        }

        System.out.println();

        // Check 2 — find MISSING options (in expected but not in actual)
        ArrayList<String> missing = new ArrayList<>(expected);
        missing.removeAll(actual);   // removes all that exist in actual
        System.out.println("🔴 Missing from UI  : " + missing);

        // Check 3 — find EXTRA options (in actual but not in expected)
        ArrayList<String> extra = new ArrayList<>(actual);
        extra.removeAll(expected);   // removes all that exist in expected
        System.out.println("🟡 Extra in UI      : " + extra);
    }
}