package learning.core.java8.methodrefference;

interface OutputI
{
	public void say();
}

public class InstanceMethodRefference {

	private String result="abc";
	
	public void getData()
	{
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		InstanceMethodRefference im=new InstanceMethodRefference();
		OutputI o=im::getData;
		o.say();
	}
	
}
