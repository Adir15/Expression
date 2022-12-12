
public class SubtractionExpression extends CompoundExpression{
	
	public SubtractionExpression(Expression leftExpression, Expression rightExpression ) {
		super(leftExpression, rightExpression);
	}

	@Override
	public double calculate() {
		return leftExpression.calculate() - rightExpression.calculate();
	}
	
	@Override
	public String toString() {
		return "("+leftExpression +" - " + rightExpression+")";
	}

}
