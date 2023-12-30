package lab2;

public class Parallel extends Circuit{
	Circuit r1;
	Circuit r2;
	Parallel(Circuit r1, Circuit r2){
		this.r1 =  r1;
		this.r2 = r2;
	}
	
	public double getResistance() {
		return 1/(1/r1.getResistance() + 1/r2.getResistance());
		}

	
	public double getPotentialDiff() {
		return r1.getPotentialDiff();
	}

	
	public void applyPotentialDiff(double V) {
		r1.applyPotentialDiff(V);
		
	}
	
	public double getCurrent() {
		return r1.getCurrent()+r2.getCurrent();
	}
}
