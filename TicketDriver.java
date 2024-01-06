package ticketBookingSystem;
import java.util.Scanner;
public class TicketDriver {
public static void main(String[] args) {
	User u1;
Scanner sc=new Scanner(System.in);
System.out.println("----User Registration----");
System.out.println("Enter Your Name");
String PName=sc.next();
System.out.println("Enter Your Phone no");
int phno=sc.nextInt();
System.out.println("Enter Your Age");
int age=sc.nextInt();
System.out.println("Enter Your Gender");
String gender=sc.next();
u1=new User(null, PName, phno, age, gender);
boolean start=true;
while(start)
{
	System.out.println("Enter the Choice:\n 1.Book Ticket \n 2.Cancel Ticket \n 3.Change Boarding Point \n 4.Change Destination Point \n 5.Jounery Details \n 6.exit");
int ch=sc.nextInt();
switch(ch)
{
case 1:
{
	System.out.println("Enter Ticket no: ");
	int ticketNo=sc.nextInt();
	System.out.println("Enter Seat no: ");
	int seatno=sc.nextInt();
	System.out.println("Enter Boarding Point: ");
	String boardingPoint=sc.next();
	System.out.println("Enter Destination Point: ");
	String destinationPoint=sc.next();
	System.out.println("Enter Cost: ");
	int cost=sc.nextInt();
	u1=new User((new Ticket(ticketNo,seatno,boardingPoint,destinationPoint,cost)), PName, phno, age, gender);
	u1.bookTicket((new Ticket(ticketNo,seatno,boardingPoint,destinationPoint,cost)));
}
break;
case 2:
{
	System.out.println("Enter your ticket no:");
	int ticketNo=sc.nextInt();
	u1.cancelTicket(ticketNo);
}
break;
case 3:
{
	System.out.println("Enter your Boarding point");
	String boardingPoint1=sc.next();
	System.out.println("Enter your New Boarding point");
	String boardingPoint2=sc.next();
	u1.changeBoadingPoint(boardingPoint1, boardingPoint2);
}
break;
case 4:
{
	System.out.println("Enter your Destination point");
	String destinationPoint1=sc.next();
	System.out.println("Enter your New Destination point");
	String destinationPoint2=sc.next();
	u1.changeDestinationPoint(destinationPoint1, destinationPoint2);
	
}
break;
case 5:
{
	u1.journeyDetails();
}
break;
case 6:
{
	start = false;
	System.out.println("Thank you..visit again.. :)");
}
break;
default:System.out.println("Enter valid Choice");
}
}
}
}
