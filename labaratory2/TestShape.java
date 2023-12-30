package lab2;

import java.util.Iterator;
import java.util.Vector;

public class TestShape {

	public static void main(String[] args) {
		Vector <ThreeDshape> shapes = new Vector <ThreeDshape>();
		shapes.add(new Cube(3));
		shapes.add(new Sphere(4));
		Iterator<ThreeDshape> value = shapes.iterator() ; 
		  
	    while (value.hasNext()) {
	    	ThreeDshape cur = value.next();
	    	System.out.print(cur);
	    }
	}

}
