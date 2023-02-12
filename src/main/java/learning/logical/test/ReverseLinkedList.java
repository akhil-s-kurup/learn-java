package learning.logical.test;
import java.util.LinkedList;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		LinkedList<Integer> reverseList = reverseList(list);
		reverseList.stream().forEach(System.out::print);
		
	}	

	static LinkedList reverseList(LinkedList<Integer> list)
	{
		LinkedList<Integer> reverseList=new LinkedList<Integer>();
		list.descendingIterator().forEachRemaining(i->{
			reverseList.add(i);
		});
		
		return reverseList;
		
	}
	
}
