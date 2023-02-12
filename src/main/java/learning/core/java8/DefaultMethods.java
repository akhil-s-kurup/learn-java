package learning.core.java8;


interface DefaultS
{
   public void getData();
   default void getData(int i)
   {
	   System.out.print(i*i);
   }
   
   default void getData2(int i)
   {
	   System.out.println(i*i);
   }
   
   static void getAge()
   {
	   System.out.println("Age is printing");
   }
	
}
public class DefaultMethods implements DefaultS {
	
	public static void main(String[] args) {
		new DefaultMethods().getData();
		DefaultS d=()->{System.out.println("xyz");};
		d.getData();
		d.getData(1);
		d.getData2(2);
		DefaultS.getAge();
		
	}

	@Override
	public void getData() {
		System.out.println("sss");
		
	}

}
