/**
 * Week 1 Homework Problem #2
 * V19FA CIS-2272-VO01
 * TicketSeller
 * @author Ron Stearns
 * 
 */

public class TicketSeller {

	private String event;
	private double ticketPrice;
	private char seatRow;
	private static int seatNumber;


	public TicketSeller(String name, double price, char row, int seat) {
		event = name;
		ticketPrice = price;
		seatRow = row;
		seatNumber = seat;
	}

	public static void main(String[] args) {
		
		TicketSeller myEvent = new TicketSeller("Red Sox vs. Yankees", 120.00, 'B', 2);

		int stop = 42;
		for(seatNumber = 1; seatNumber <= stop; seatNumber++){

			if( seatNumber % 2 == 0){
				System.out.printf("*********\nTICKET\n" + myEvent.event + "\n" + "$" + String.format("%.2f", myEvent.ticketPrice) + "\n" + "Seat "  + myEvent.seatRow + "-" + TicketSeller.seatNumber + "\n*********\n");
			}
		
		}
	
	}

}

