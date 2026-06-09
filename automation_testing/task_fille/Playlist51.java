package sessioin.a5;

public class Playlist51 
{
	// Properties
    String playlistName;
    int totalSongs;

    // Constructor — initializes values
    void Playlist(String playlistName, int totalSongs) {
        this.playlistName = playlistName;
        this.totalSongs   = totalSongs;
    }

    // Display method
    void showDetails() {
        System.out.println("🎵 Playlist : " + playlistName);
        System.out.println("🎶 Total Songs : " + totalSongs);
    }

    public static void main(String[] args) {

        // Creating objects using constructor
        Playlist p1 = new Playlist("Bollywood Hits", 25);
        Playlist p2 = new Playlist("Lo-Fi Study", 40);

        p1.showDetails();
        System.out.println("-------------------");
        p2.showDetails();
    }

}
