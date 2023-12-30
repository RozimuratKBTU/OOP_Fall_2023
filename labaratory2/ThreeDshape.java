package lab2;

public abstract class ThreeDshape {
	String name;
	double volume;
	double surfaceArea;
	private String color;
	int faces=0;
	int edges=0;
	
	abstract double findArea();  //showing abstract methods
	abstract double findVolume();
	
	String howManyVertices() {    //showing non-abstract method
		if(faces > 0 && edges > 0) {
			return "There are "+ (2-faces+edges) + " vertices";
		}
		else {
			return "It is impossible to count number of vertices for your shape";
		}
	}
	
	public String getColor() {
		return color;
	}
	
	
	public void setColor(String color) {   //method overloading
		this.color = color;
	}
	public void setColor(ThreeDshape shape) {
		this.color= shape.color;
	}
	
	
	
	public String toString() {   
		return "This is " + this.getClass().getSimpleName() + " . "+ "Area: "+ findArea()+ " Volume: "+ findVolume()+"\n"; 
	}
	
	
}
