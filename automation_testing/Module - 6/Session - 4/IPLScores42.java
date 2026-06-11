package session.a4;

public class IPLScores42 
{
	public static void main(String[] args) {

        // 3 teams x 4 matches — 2D array
        //                  M1   M2   M3   M4
        int[][] matchScores = {
            {185, 172, 200, 165},   // Team: Mumbai Indians
            {160, 190, 175, 210},   // Team: CSK
            {178, 155, 195, 180}    // Team: RCB
        };

        String[] teamNames = {"Mumbai Indians", "CSK", "RCB"};

        System.out.println("🏏 IPL Team Total Scores:");
        System.out.println("---------------------------");

        // Loop through each team (row)
        for (int i = 0; i < matchScores.length; i++) {
            int total = 0;

            // Loop through each match score (column)
            for (int j = 0; j < matchScores[i].length; j++) {
                total += matchScores[i][j];
            }

            System.out.println(teamNames[i] + " → Total Runs: " + total);
        }
    }

}
