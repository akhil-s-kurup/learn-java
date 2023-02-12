package learning.core.java8;

public class Java8Lamda {
	interface J{
		public void get();
	}
	
	
	public static void main(String[] args) {
		
		new J() {

			@Override
			public void get() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		
		J j=()->{System.out.println("ok");};
		j.get();
		
	}

}
