
public abstract class Expression {
	
	
	public abstract double calculate();
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Expression)) {
			return false;
		}
		 return this.calculate() == ((Expression)other).calculate() ;
	}
	
	
}
