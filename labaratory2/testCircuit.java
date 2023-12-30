package lab2;

public class testCircuit {

	public static void main(String[] args) {
		Circuit a = new Resistor(1.0);
		Circuit b = new Resistor(2.0);
		Circuit c = new Resistor(10.0);
		
		Circuit g = new Parallel(a,b);
		Circuit h = new Parallel(g,c );
		
		double R = h.getResistance();
		System.out.print(R);
	}

}
