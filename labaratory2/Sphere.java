package lab2;

public class Sphere extends ThreeDshape {
	String name = "sphere";
	double r;
	
	Sphere(double r){
		this.r =r;
	}
	double findArea() {
		return 4* r * r * Math.PI;
	}


	double findVolume() {
		
		return 4*Math.PI*r*r/3;
	}
	
	

}
