package lab2;
import java.util.*;
public class Phone {

	int number;
	
	private Map <Integer, String> messages = new HashMap <Integer,String>();
	String color= "none";
	int weight;
	GregorianCalendar calendar = new GregorianCalendar();
	
	Phone(){
		number= -1;
		color = "undefined";
		weight= -1;
	}
	
	Phone(int number){
		this();
		this.number= number;
	}
	
	Phone(int number, String color){
		this(number);
		this.color = color;
	}
	
	Phone(int number,String color, int weight){
		this(number,color);
		this.weight = weight;
	}
	
	public void addNewMessage(Integer contact, String message) {
		messages.put(contact, message);
	}
	
	
	void call(int number) {
		System.out.print("* calling " + number + "  *");
	}
	
	
	public Map <Integer, String> getMessages() {
		return messages;
	}
	

	public void showDate() {
		
	   System.out.println("Ãמה: " + calendar.get(Calendar.YEAR));
	   System.out.println("Ìוסÿצ: " + calendar.get(Calendar.MONTH));
	   System.out.println("×טסכמ: " + calendar.get(Calendar.DAY_OF_MONTH));
	}
	
	public boolean equals(Object o) {
		if( this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Phone p = (Phone)o;
		return number == p.number  
				&& messages.equals(p.messages) && color.equals(p.color) && weight== p.weight; 
	}
	
	public int hashCode() {
		int res = 17;
		res += 31*res + number;  
		
		res += 31*res + messages.hashCode();   //map
		res += 31*res + weight;   //integer
		res += 31*res + color.hashCode();   //COLOR IS STRING
		
		return res;
		
	}
	
	public String toString() {
		return "This is " + this.getClass().getSimpleName() + " with number " + number ;
	}
	
	
}

