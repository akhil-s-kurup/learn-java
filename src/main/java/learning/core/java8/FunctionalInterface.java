package learning.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

interface FunctionalSample
{
	public void accept(Object t);
}

class MyList
{
	List<Object> list=new  ArrayList<>();
	
	public void forEach(FunctionalSample f)
	{
		Objects.requireNonNull(f);// throw null pointer exception
		f.accept(list.get(1));
	}
	
	public void add(Object o)
	{
		list.add(o);
	}
}


public class FunctionalInterface {
	public static void main(String[] args) {
		MyList myList=new MyList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		
		FunctionalSample f=new FunctionalSample() {
			
			@Override
			public  void accept(Object t) {
				// TODO Auto-generated method stub
				
			}
		};
		
		myList.forEach((i)->{System.out.println(i);});
		myList=null;
		myList.forEach((i)->{System.out.println(i);});
	}

}
