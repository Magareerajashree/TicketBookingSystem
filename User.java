package ticketBookingSystem;

import java.util.ArrayList;

public class User {
	boolean status=true;
private Ticket t;
public Ticket t1;
private String PName;
private int phno;
private int age;
private String gender;
public User()
{
	
}

public User(Ticket t, String pName, int phno, int age, String gender) {
	super();
	if(t!=null)
	{
    this.t=t;
	}
	this.PName = pName;
	this.phno = phno;
	this.age = age;
	this.gender = gender;
	System.out.println("**User Registered**");
}

public Ticket getT() {
	return t;
}

public void setT(Ticket t) {
	this.t = t;
}

public String getPName() {
	return PName;
}

public void setPName(String pName) {
	PName = pName;
}

public int getPhno() {
	return phno;
}

public void setPhno(int phno) {
	this.phno = phno;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public ArrayList<Ticket> getL() {
	return l;
}

public void setL(ArrayList<Ticket> l) {
	this.l = l;
}

ArrayList<Ticket> l=new ArrayList();
public void bookTicket(Ticket t)
{
	
	l.add(t);
	System.out.println("Ticket booked Successfully");
}
public void cancelTicket(int ticketNo)
{
	if(t.getTicketNo()==ticketNo)
	{
	l.remove(t);
	status=false;
	System.out.println("Ticket Cancelled Successfully");
	}
}
public void changeBoadingPoint(String BoardingPoint1,String BoardingPoint2)
{
	if(t.getBoardingPoint().equalsIgnoreCase(BoardingPoint1))
	{
		t.setBoardingPoint(BoardingPoint2);
		System.out.println("Boarding Point Changed Successfully");
	}
}
public void changeDestinationPoint(String DestinationPoint1,String DestinationPoint2)
{
	if(t.getDestinationPoint().equalsIgnoreCase(DestinationPoint1))
	{
		t.setDestinationPoint(DestinationPoint2);
		System.out.println("Destination Point Changed Successfully");
	}
}
public void journeyDetails()
{
	System.out.println("Passenger Name: "+PName);
	System.out.println("Phone no: "+phno);
	System.out.println("Age: "+age);
	System.out.println("Gender: "+gender);
	if(status)
	{
		t.ticketDetails();
	}
	else {
		System.out.println("You haven't booked for a journey with us"); 
	}
}
}
