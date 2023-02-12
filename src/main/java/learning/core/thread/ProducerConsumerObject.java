package learning.core.thread;

import java.util.ArrayList;
import java.util.List;

import learning.core.thread.Producer.Item;

class Producer1 implements Runnable
{
	class Item
	{}
	
	Store1 s;
	
	public Producer1(Store1 s) {
		this.s=s;
	}



	public void run()
	{
		synchronized (s) {
		
			while(true) {
				try {
				if(s.objList.size()>2)
				{
					try {
						System.out.println("waiting for consumers"+s.objList.size());
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("producing");
				s.addToStore(this.new Item());
				s.notify();
				}
				catch(Exception e) {
					System.out.println("Producer Ex");
				}
			}

		}
	}
	
}


class Store1
{
	static List<Object> objList=new ArrayList();
	
	public void addToStore(Object obj)
	{
		objList.add(obj);
	}
	
	
	
}

class Consumer1 implements Runnable
{
	Store1 s;
	public Consumer1(Store1 s2) {
	this.s=s2;
	}
	public void run()
	{
		synchronized (s) {
			while(true) {
			try {
				if(s.objList.size()==0)
				{
					System.out.println("waiting for producer");
					s.wait();
				}
				System.out.println("consuming");
				Object remove = s.objList.remove(0);
				s.notify();
				System.out.println("removed"+remove);
				}
				catch (Exception e) {
					System.out.println("EX in "+e);
				}
			}

		}
	}
}



public class ProducerConsumerObject {

	public static void main(String[] args) {
		Store1 s1=new Store1();
		Producer1 p1=new Producer1(s1);
		Consumer1 c1=new Consumer1(s1);
		new Thread(p1).start();
		new Thread(c1).start();
		
	}


}
