package learning.core.java8.optional;

import java.util.Optional;

public class OptionalTest {
	
	
	static class Student
	{
		
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		Optional<Student> st=Optional.ofNullable(student);
		System.out.println(st.isPresent());
		
		Student student2 = st.get();
		
		student=null;
		st=Optional.ofNullable(student);
		System.out.println(st.isPresent());
		//st.get();  --->No such element exception
		
		String[] abc= {"a","b","c","d"};
		Optional<String> op=Optional.ofNullable(abc[3]);
		op.get();
		
	}

}
