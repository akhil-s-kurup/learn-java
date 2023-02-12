package learning.core.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8InternelLoops {

	List<Integer> intList=new ArrayList<>();
	
	public void itrateList()
	{
		intList.forEach((i)->{
			 System.out.println(i);
		});
	}
	
	public void addTointList(int i)
	{
		intList.add(i);
	}
	
	public static void main(String[] args) {
		Java8InternelLoops j=new Java8InternelLoops();
		j.addTointList(1); 	j.addTointList(2);	j.addTointList(3);	j.addTointList(4);
		j.itrateList();
	}
}
