package lab2;

public class Cylinder extends ThreeDshape{
	int height;
	int radius;
	
	double findArea() {
		return 2*(Math.PI*radius*radius + Math.PI* radius* height)   ;
	}
	
	double findVolume() {
		return Math.PI*radius * radius * height;
	}
	
	
	
	
}
