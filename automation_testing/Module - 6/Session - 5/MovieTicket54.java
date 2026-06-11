package sessioin.a5;

public class MovieTicket54 
{
	  // Private fields — cannot be accessed directly from outside
    private String movieName;
    private int seatNumber;

    // Getter — movieName
    public String getMovieName() {
        return movieName;
    }

    // Setter — movieName
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    // Getter — seatNumber
    public int getSeatNumber() {
        return seatNumber;
    }

    // Setter — seatNumber (with validation)
    public void setSeatNumber(int seatNumber) {
        if (seatNumber > 0) {
            this.seatNumber = seatNumber;
        } else {
            System.out.println("❌ Invalid seat number!");
        }
    }

    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket();

        // Set values using setters
        ticket.setMovieName("KGF Chapter 2");
        ticket.setSeatNumber(15);

        // Get values using getters
        System.out.println("🎬 Movie   : " + ticket.getMovieName());
        System.out.println("💺 Seat No : " + ticket.getSeatNumber());

        System.out.println();

        // Test invalid seat number
        ticket.setSeatNumber(-5);
    }

}
