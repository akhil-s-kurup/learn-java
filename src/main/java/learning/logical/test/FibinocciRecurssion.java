package learning.logical.test;

public class FibinocciRecurssion {
	
	//method 1
	public static void doPrint(int i,int j,int k)
	{
		System.out.print(i  +" ,");
		i=j;
		j=k;
		k=i+j;
		if(k<100)
		doPrint(i, j, k);
	}
	
	public static void main(String[] args) {
		
		//call method 1
		  int i=0,j=1,k=1;
		  doPrint(i,j,k);
		
		  
		  
		  // call method 2
		  
		  int seqLength = 10;

	    	System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");

	    	for (int m = 0; m < seqLength; m++) {
	      	    System.out.print(fibonacci(m) + " ");
	    	}
	}
	
	
	//method 2 
	  public static int fibonacci(int count) {
			if (count <= 1)
				return count;

			return fibonacci(count - 1) + fibonacci(count - 2);
		}

}
