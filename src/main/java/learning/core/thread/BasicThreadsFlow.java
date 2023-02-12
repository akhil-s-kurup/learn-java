package learning.core.thread;

public class BasicThreadsFlow {

	
	
	class A extends Thread
	{
		public void run()
		{
			System.out.println("Class B");
		}
	}
	
	
	class B implements Runnable
	{

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		BasicThreadsFlow a=new BasicThreadsFlow();
		a.new A().start();
		Runnable r=a.new B();
		Thread thread = new Thread(r);
		thread.setName("IThread");
		thread.start();
		
		new Thread(()-> {
			System.out.println("Anon Thread");
		}).start();
		
	}

}
