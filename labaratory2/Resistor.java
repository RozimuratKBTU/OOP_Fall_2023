package lab2;

public class Resistor extends Circuit{
	private double resistance;
	private double V;
	
	Resistor(double resistance){
		this.resistance = resistance;
	}
	public double getResistance() {
		
		return resistance;
	}


	public double getPotentialDiff() {
		
		return V;
	}

	
	public void applyPotentialDiff(double V) {
		
		this.V = V;
		
	}


	public void setResistance(double resistance) {
		this.resistance = resistance;
	}

}
