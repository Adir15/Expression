
public class AdditionExpression extends CompoundExpression{
	
	public AdditionExpression(Expression leftExpression, Expression rightExpression ) {
		super(leftExpression, rightExpression);
	}

	@Override
	public double calculate() {
		return leftExpression.calculate() + rightExpression.calculate();
	}
	
	@Override
	public String toString() {
		return "("+leftExpression +" + " + rightExpression+")";
	}

}
