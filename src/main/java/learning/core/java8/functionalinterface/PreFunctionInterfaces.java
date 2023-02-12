package learning.core.java8.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreFunctionInterfaces {

	public static void main(String[] args) {
		new FunctionDemo();
		new PredicateDemo();
		new ConsumerDemo();
		new SupplierDemo();
	}

}

class FunctionDemo {
	public FunctionDemo() {

		Function<Double, Double> half = (a) -> a / 2;
		Function<Double, Double> twice = (a) -> a * a;

		Function<Double, Double> squareAndThenCube = half.andThen(twice);
		Double result = squareAndThenCube.apply(3d);
		System.out.println("Half and twise andThen for 3 " + result);

		Function<Double, Double> squareComposeCube = half.compose(twice);
		result = squareComposeCube.apply(3d);
		System.out.println("Half and twise compose for 3 " + result);

		// Function which takes in a number and
		// returns it
		Function<Integer, Integer> i = Function.identity();
		System.out.println(i.apply(10));

	}
}

class PredicateDemo {
	public PredicateDemo() {
		Predicate<Integer> lessThan = (i) -> i < 10;
		Predicate<Integer> graterThan = (i) -> i > 5;
		System.out.println(lessThan.test(1));
		System.out.println(lessThan.test(100));

		// chain
		System.out.println("is " + lessThan.and(graterThan).test(7));
	}

}

class ConsumerDemo {
	// accept one argument and do sometghing
	public ConsumerDemo() {
		Consumer<String> consumer = (s) -> {
			System.out.print("Consumer printing " + s);
		};
		consumer.accept("abc");

	}

}

class SupplierDemo {
	// accept no argument and return 1
	public  SupplierDemo() {

		Supplier<Double> supplier = () -> {
			return Math.random();
		};
		System.out.println("Random value fro suppier is " + supplier.get());

	}

}
