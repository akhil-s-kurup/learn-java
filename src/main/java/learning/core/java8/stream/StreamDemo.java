package learning.core.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		new TerminalOperations();
		new IntermediateOperations();
	}

}

class TerminalOperations {

	public TerminalOperations() {
		// return true if condition met for 1 ekement
		List<Integer> list = Arrays.asList(1, 4, 2, 3, 6, 9, 0, 1);
		boolean anyMatch = list.stream().anyMatch(i -> i == 1);
		System.out.println(anyMatch);

		// return true only if all condition met
		boolean allMatch = list.stream().allMatch(i -> i % 2 == 0);
		System.out.println(allMatch);

		// return true only if all condition not met
		boolean nonMatch = list.stream().noneMatch(i -> i % 2 == 0);
		System.out.println(nonMatch);

		long count = list.stream().count();
		System.out.println(count);

		Stream<Integer> distinct = list.stream().distinct();
		distinct.forEach(i -> System.out.print(i));

		boolean parallel = list.stream().isParallel();
		System.out.println(parallel);

		boolean parallel2 = list.parallelStream().isParallel();
		System.out.println(parallel2);

		Optional<Integer> findFirst = list.stream().findFirst();
		System.out.println(findFirst.get());

		Optional<Integer> findAny = list.stream().findAny();
		System.out.println(findAny.get());

		Optional<Integer> min = list.stream().min((i, j) -> {
			return i > j ? 1 : -1;
		});
		System.out.println(min.get());

		Optional<Integer> max = list.stream().max((i, j) -> {
			return i > j ? 1 : -1;
		});
		System.out.println(max.get());

		List<Integer> collect = list.stream().collect(Collectors.toList());
		System.out.println(collect);

	}

}

class IntermediateOperations {

	public IntermediateOperations() {
		List<Integer> list = Arrays.asList(1, 4, 2, 3, 6, 9, 0);
		Stream<Integer> skip = list.stream().skip(2);
		skip.forEach(System.out::println);
		System.out.println("################################################################");
		Stream<Integer> limit = list.stream().limit(3);
		limit.forEach(System.out::println);
		System.out.println("################################################################");
		list.stream().filter(i -> {
			return i % 2 == 0;
		}).forEach(System.out::println);

		System.out.println("################################################################");
		list.stream().sorted().forEach(System.out::println);

		System.out.println("################################################################");
		Consumer<Integer> c = (i) -> {
			i = i + i;
		};
		list.stream().peek(c).forEach(System.out::println);
		System.out.println("################################################################");
		Set<Integer> collect = list.stream().sorted((i, j) -> i < j ? 1 : -1).collect(Collectors.toSet());
		System.out.println(collect);
		System.out.println("################################################################");
		Map<Integer, Integer> collect2 = list.stream().collect(Collectors.toMap(i -> i, j -> j * 2));
		System.out.println(collect2);

	}
}