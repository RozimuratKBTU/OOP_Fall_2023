package lab2;
import java.util.*;
public class testPhone {


	public static void main(String[] args) {
		HashSet <Phone> phones = new HashSet<Phone>();
		
		Phone p1 = new Phone(87127);
		Phone p2 = new Phone(12933,"red");
		Phone p3 = new Phone(27652, "blue" , 120);
		Phone p4 = new Phone(63432,"green", 100);
		Phone p5= p1;    //same address TO p1
		Phone p6 = new Phone(63432,"green", 100);    //SAME LIKE Phone p4
		MobilePhone m1 = new MobilePhone(2222);
		Phone mp = new MobilePhone(2222);
		//MobilePhone pm= (MobilePhone)p1;
		phones.add(p2);
		phones.add(p3);
		phones.add(p4);   
		phones.add(p5);
		phones.add(p6);  //must not be added!
		phones.add(mp);
		phones.add(m1);
		for(Phone current : phones) {   //Showing that same objects not added
			System.out.print(current);
			System.out.print("\n");
		}
		
		p1.showDate();
		System.out.print("\n");
		m1.showDate();
		System.out.print("\n");
		mp.showDate();
		System.out.print("\n");
		//pm.showDate();
		
	}

}
