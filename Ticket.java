package ticketBookingSystem;

public class Ticket {
private int ticketNo;
private int seatno;
private String boardingPoint;
private String destinationPoint;
private int cost;
public Ticket()
{
	
}
public Ticket(int ticketNo, int seatno, String boardingPoint, String destinationPoint, int cost) {
	super();
	this.ticketNo = ticketNo;
	this.seatno = seatno;
	this.boardingPoint = boardingPoint;
	this.destinationPoint = destinationPoint;
	this.cost = cost;
}
public int getTicketNo() {
	return ticketNo;
}
public void setTicketNo(int ticketNo) {
	this.ticketNo = ticketNo;
}
public int getSeatno() {
	return seatno;
}
public void setSeatno(int seatno) {
	this.seatno = seatno;
}
public String getBoardingPoint() {
	return boardingPoint;
}
public void setBoardingPoint(String boardingPoint) {
	this.boardingPoint = boardingPoint;
}
public String getDestinationPoint() {
	return destinationPoint;
}
public void setDestinationPoint(String destinationPoint) {
	this.destinationPoint = destinationPoint;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public void ticketDetails()
{
	System.out.println("Ticket no: "+getTicketNo());
	System.out.println("Seat no: "+getSeatno());
	System.out.println("Boarding Point: "+getBoardingPoint());
	System.out.println("Destination Point: "+getDestinationPoint());
	System.out.println("Cost: "+getCost());
}
}
