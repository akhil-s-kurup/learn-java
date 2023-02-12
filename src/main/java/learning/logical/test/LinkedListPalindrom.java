package learning.logical.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPalindrom {

	public static void main(String[] args) {
		Integer[] li = new Integer[] { 7, 2, 7 };
		LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(li));
		Iterator<Integer> descendingIterator = linkedList1.descendingIterator();
		LinkedList<Integer> linkedList2 = new LinkedList<>();
		descendingIterator.forEachRemaining(linkedList2::add);
		System.out.println(linkedList1);
		System.out.println(linkedList2);
		System.out.println(findSum(linkedList1, linkedList2));
	}

	private static List findSum(LinkedList<Integer> linkedList1, LinkedList<Integer> linkedList2) {
		LinkedList<Integer> sum=new LinkedList<>();
		if (linkedList1.size() == 0 && linkedList2.size() != 0) {
			return new LinkedList(Arrays.asList(findSum(linkedList2)));
		} else if (linkedList1.size() != 0 && linkedList2.size() == 0) {
			return  new LinkedList(Arrays.asList(findSum(linkedList1)));
		} else if (linkedList1.size() == 0 && linkedList2.size() == 0) {
			return new LinkedList(Arrays.asList(0));
		} else {
			Iterator<Integer> linkedList1Itrator1 = linkedList1.descendingIterator();
			Iterator<Integer> linkedList1Itrator2 = linkedList2.descendingIterator();
			int bor=0;
			while(linkedList1Itrator1.hasNext()||linkedList1Itrator2.hasNext())
			{
				int firstOp=linkedList1Itrator1.hasNext()?linkedList1Itrator1.next():0;
				int secOp=linkedList1Itrator2.hasNext()?linkedList1Itrator2.next():0;
				sum.addFirst(((firstOp+secOp)%10+bor));
				bor=(firstOp+secOp)/10;
			}
			sum.addFirst(bor);
		}
		return sum;
	}

	private static int findSum(LinkedList list) {
		return 0;
	}

}
