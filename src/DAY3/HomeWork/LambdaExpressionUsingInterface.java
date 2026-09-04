package DAY3.HomeWork;
@FunctionalInterface
interface Greeting {
	void sayHello(String name);
}

public class LambdaExpressionUsingInterface {
	public static void main(String[] args) {
		Greeting greeting = name -> System.out.println("Hello, " + name);
		greeting.sayHello("Java");
	}
}