package learning.core.java8.methodrefference;


interface Output
{
	public void print();
}

public class StaticMethodRefference {
	
	public static void main(String[] args) {
		Output i=StaticMethodRefference::say;
		i.print();
		
	}

	public static void say()
	{
		System.out.println("say");
	}
}
