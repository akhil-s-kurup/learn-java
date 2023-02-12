package learning.core.thread;

import java.util.ArrayList;
import java.util.List;

class Producer extends Thread
{
	class Item
	{}
	public void run()
	{
		synchronized (Store.class) {
		
			while(true) {
				try {
				Store s=new Store();
				if(s.objList.size()>2)
				{
					try {
						System.out.println("waiting for consumers"+s.objList.size());
						Store.class.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("producing");
				s.addToStore(this.new Item());
				Store.class.notify();
				}
				catch(Exception e) {
					System.out.println("Producer Ex");
				}
			}

		}
	}
	
}


class Store
{
	static List<Object> objList=new ArrayList();
	
	public void addToStore(Object obj)
	{
		objList.add(obj);
	}
	
	
	
}

class Consumer extends Thread
{
	Store s=new Store();
	public void run()
	{
		synchronized (Store.class) {
			while(true) {
			try {
				if(s.objList.size()==0)
				{
					System.out.println("waiting for producer");
					Store.class.wait();
				}
				System.out.println("consuming");
				Object remove = s.objList.remove(0);
				Store.class.notify();
				System.out.println("removed"+remove);
				}
				catch (Exception e) {
					System.out.println("EX in "+e);
				}
			}

		}
	}
}


public class ProducerConsumerClassLevel {

	public static void main(String[] args) {
		Producer p=new Producer();
		Consumer c=new Consumer();
		p.start();
		c.start();

	}

}
