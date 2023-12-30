package lab2;

public class Series extends Circuit{
	Circuit r1;
	Circuit r2;
	Series(Circuit r1, Circuit r2){
		this.r1 = r1;
		this.r2 = r2;
		
	}

	
	public double getResistance() {

		return r1.getResistance()+r2.getResistance();
	}

	
	public double getPotentialDiff() {
		return r1.getPotentialDiff() + r2.getPotentialDiff();
	}

	
	public void applyPotentialDiff(double V) {
		System.out.print("It is already computed.You can only change exact for resistor.");
		
	}
}
