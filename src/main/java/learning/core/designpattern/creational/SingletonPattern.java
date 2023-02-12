package learning.core.designpattern.creational;

public class SingletonPattern {

	
	private SingletonPattern() {}
	
	private static SingletonPattern singletonPattern;
	
	public static SingletonPattern getInstance() {
		if(null==singletonPattern) {
			singletonPattern= new SingletonPattern();
		}
		return singletonPattern;
	}
	
	
	public static void main(String[] args) {
		System.out.println(SingletonPattern.getInstance().equals(SingletonPattern.getInstance()));
		SingletonPattern instance1 = SingletonPattern.getInstance(); 
		SingletonPattern instance2 = SingletonPattern.getInstance();
		System.out.println(instance1==instance2);
	}
}
