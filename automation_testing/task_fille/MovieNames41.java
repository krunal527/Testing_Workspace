package session.a4;

public class MovieNames41 
{
	public static void main(String[] args) {

        // String array with 5 favorite movies
        String[] movieNames = {
            "RRR",
            "KGF Chapter 2",
            "Pushpa",
            "Pathaan",
            "Animal"
        };

        System.out.println("🎬 My Favorite Movies:");
        System.out.println("------------------------");

        // Print each movie on new line
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println((i + 1) + ". " + movieNames[i]);
        }
    }

}
