package learning.core.java8.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InbuiltFunctionalInterface {

	public static void main(String[] args) {

		new RunnableLamda().getThreadUsingLamda();
		new CallableLamda().getCallableLamda();
		new ComparatorLamda().sortUsingComparator();
		//comparable can't show no sorting for colections using comparable

		
	}

}

class ComparableLamda {

}

class ComparatorLamda {

	class Student {
		int rollNo;

		public Student(int rollNo, String name) {
			super();
			this.rollNo = rollNo;
			this.name = name;
		}

		String name;

		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public void sortUsingComparator() {
		Student student1 = new Student(13, "Akhil");
		Student student2 = new Student(2, "Abin");
		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		System.out.println("BeforSort ===" + list);
		list.sort((s1, s2) -> {
			if (s1.getRollNo() > s2.getRollNo()) {
				return 1;
			} else {
				return -1;
			}
		});
		System.out.println("AfterSort ===" + list);
	}

}

class CallableLamda {
	public void getCallableLamda() {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Integer> feature = executorService.submit(() -> {
			return 5 * 5;
		});
		try {
			Integer result = feature.get();
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}

	}

}

class RunnableLamda {

	public void getThreadUsingLamda() {
		// Runnable Functional Interface
		new Thread(() -> {
			int i = 0;
			int j = 1;
			System.out.println(i * j);
		}).start();
	}
}
