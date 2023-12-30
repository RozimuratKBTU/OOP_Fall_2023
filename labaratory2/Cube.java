package lab2;

public class Cube extends ThreeDshape {
	String name = "Cube";
	double a;
	
	Cube(double a){
		this.a = a;
	}
	double findArea() {
		return 6*a*a;
	}
	
	double findVolume() {
		return a*a*a;
	}
	

}
