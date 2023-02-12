package learning.core.java8;


/*
 * if class and intedrface have same methods then class will get more priority
 * 
 */

interface I
{
	public void print();
	default void test() {
		System.out.println("TestI");
	}
	static void test1() {
		System.out.println("ïnside static");
	}
}


public class Java8Interfaces implements I {

	public static void main(String[] args) {
		Java8Interfaces j=new Java8Interfaces();
		j.print();
		j.test();
		I.test1();

	}

	@Override
	public void print() {
		System.out.println("print");
		
	}

}
