
public class AtomicExpression extends Expression{

	private double atomicNum;
	
	
	
	public AtomicExpression(double atomicNum) {
		this.atomicNum = atomicNum;
	}
	
	@Override
	public String toString() {
		return String.valueOf(atomicNum);
	}

	@Override
	public double calculate() {
		return atomicNum;
	}
	
	
}
