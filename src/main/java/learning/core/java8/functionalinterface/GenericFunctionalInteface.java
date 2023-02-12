package learning.core.java8.functionalinterface;

interface Action<T>
{
	T showData(T t);
}

public class GenericFunctionalInteface {

	public static void main(String[] args) {
		
	Action<Integer> action=(inte)->{
		System.out.println(inte);
		return inte;
		
	};
		
	
	action.showData(3);
	}
	
	
}
