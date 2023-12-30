package lab2;
import java.util.*;
public class MobilePhone extends Phone {
	String ringtone = "TRRR";
	int power;
	double pixels;
	Vector <String> notes = new Vector<String>();
	MobilePhone(){
		super();
	}
	
	MobilePhone(int number){
		super(number);
	}
	MobilePhone(int number, String color , int weight, int power , int pixels){
		super(number,color,weight);
		this.power = power;
		this.pixels = pixels;
	}
	
	
	public void addNotes(String s) {
		notes.add(s);
	}
	
	
	void changeRingtone(String r) {
		this.ringtone= r;
	}
	
	void listenToRingtone(int n) {
		System.out.print(ringtone.repeat(n));
	}
	
	void charge (int n) {
		this.power += n;
	}
	
	public void showDate() { //OVERRIDEN
		super.showDate();
		System.out.println("Часы: " + calendar.get(Calendar.HOUR));
	   System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
	   System.out.println("Секунды: " + calendar.get(Calendar.SECOND));
	   System.out.println("Миллисекунды: " + calendar.get(Calendar.MILLISECOND));
	   
	}
	
	public boolean equals(Object o) {
        if (! super.equals(o)) return false;
        else {
           MobilePhone p = (MobilePhone)o;
           return ringtone.equals(p.ringtone) && power == p.power &&  pixels == p.pixels && notes.equals(p.notes);
        }
	}
	
	public int hashCode() {
		int ans = super.hashCode();
		ans += 31*ans + ringtone.hashCode();
		ans += 31*ans + (int)pixels;
	    ans += 31*ans + power;
	    ans += 31*ans + notes.hashCode();  //vector
		 
		return ans;
		
	}
	
	public String toString() {
		return super.toString() + " and with power " + power;
	}
	
	

}
