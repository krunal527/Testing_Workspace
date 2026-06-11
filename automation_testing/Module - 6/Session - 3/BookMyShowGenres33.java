package task.assignment6;

public class BookMyShowGenres33 
{
	 public static void main(String[] args) {

	        // String array of movie genres
	        String[] genres = {"Action", "Comedy", "Drama", "Horror", "Sci-Fi"};

	        System.out.println("---- Available Movie Genres ----");

	        // for loop to print all genres
	        for (int i = 0; i < genres.length; i++) {
	            System.out.println((i + 1) + ". " + genres[i]);
	        }

	        System.out.println("--------------------------------");
	    }

}
