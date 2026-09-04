package DAY3.HomeWork;
@FunctionalInterface
interface Operation {
	int calculate(int num1 , int num2);
}

public class LambdaExpression {
	public static void main(String[] args) {
		Operation addition = ( num1 , num2) -> num1 + num2;
		Operation multiplication = ( num1, num2) -> num1 * num2;

		System.out.println("Addition: " + addition.calculate(10, 5));
		System.out.println("Multiplication: " + multiplication.calculate(10, 5));
	}
}