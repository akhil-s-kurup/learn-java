package learning.logical.test;

public class CustomLinkedList {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addFirst("1");
		linkedList.addFirst("2");
		linkedList.addFirst("3");
		linkedList.print();
	}
}

class LinkedList implements List {

	private Node node;
	private Node firstNode;

	class Node {
		private Object data;
		private Node node;

		public Node getNode() {
			return node;
		}

		public void setNode(Node node) {
			this.node = node;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}
	}

	@Override
	public void addFirst(Object obj) {
		Node node = new Node();
		node.setData(obj);
		if(this.firstNode==null)
		{
			this.firstNode=node;
			this.node=node;
			
		}
		else
		{
			this.node.setNode(node);
			this.node=node;
		}
		
		
	}

	@Override
	public void addLast(Object obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLast() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {

		Node node = this.firstNode;
		while (node!=null && node.getData() != null) {
			System.out.print(node.getData());
			node = node.getNode();
		}

	}

}

interface List {
	public void addFirst(Object obj);

	public void addLast(Object obj);

	public void removeFirst();

	public void removeLast();

	public void print();

}