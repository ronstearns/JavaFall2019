/**
 * Week 1 Homework Problem #1
 * V19FA CIS-2272-VO01
 * Ticket
 * @author Ron Stearns
 * 
 */

public class Ticket {
 
  private String event;
  private double ticketPrice;
  private char seatRow;
  private int seatNumber;
  
  
  public Ticket(String name, double price, char row, int seat) {
	  event = name;
	  ticketPrice = price;
	  seatRow = row;
	  seatNumber = seat;
  }

  public static void main(String[] args) {
    Ticket myEvent = new Ticket("Beyonce", 75.50, 'J', 32);
    System.out.printf("*********\nTICKET\n" + myEvent.event + "\n" + "$" + String.format("%.2f", myEvent.ticketPrice) + "\n" + "Seat "  + myEvent.seatRow + "-" + myEvent.seatNumber + "\n*********\n");
  }
}
