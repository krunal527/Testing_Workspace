package session.a4;

public class MyAppsList45 
{
	 public static void main(String[] args) {

	        // Step 1 — Build comma-separated list using StringBuilder
	        StringBuilder sb = new StringBuilder();

	        sb.append("WhatsApp");
	        sb.append(", ");
	        sb.append("Instagram");
	        sb.append(", ");
	        sb.append("Zomato");
	        sb.append(", ");
	        sb.append("Flipkart");

	        System.out.println("📱 My Most Used Apps:");
	        System.out.println(sb.toString());

	        System.out.println();

	        // Step 2 — Replace "Flipkart" with "Spotify"
	        int start = sb.lastIndexOf("Flipkart");
	        int end   = start + "Flipkart".length();

	        sb.replace(start, end, "Spotify");

	        System.out.println("🎵 Updated App List:");
	        System.out.println(sb.toString());
	    }

}
