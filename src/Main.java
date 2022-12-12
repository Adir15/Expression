import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Expression> expressions = new ArrayList<Expression>(); 
		
		AtomicExpression atomic1 = new AtomicExpression(random.nextInt(50));
		AtomicExpression atomic2 = new AtomicExpression(random.nextInt(50));
		AtomicExpression atomic3 = new AtomicExpression(random.nextInt(50));
		AdditionExpression addition1 = new AdditionExpression(atomic1, atomic2);
		SubtractionExpression subtraction1 = new SubtractionExpression(atomic3, addition1);
		AdditionExpression addition2 = new AdditionExpression(addition1, subtraction1);
		
		expressions.add(atomic1);
		expressions.add(atomic2);
		expressions.add(atomic3);
		expressions.add(addition1);
		expressions.add(subtraction1);
		expressions.add(addition2);

		
		for(Expression expression : expressions) {
			System.out.println(expression + " = " + expression.calculate());
		}
		
		for(Expression expression : expressions) {
			for(Expression otherExpression: expressions) {
				if(expression.equals(otherExpression)) {
					System.out.println( expression + " == " + otherExpression);
				}
				else {
					System.out.println(expression + " != " + otherExpression);
				}
			}
		}
	}
}
