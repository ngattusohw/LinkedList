package LinkedList;

public class myLinkedList {
	 
	private int counter;
	private Node head = null;
 
	// Default constructor
	public myLinkedList() {
		head = null;
	}
 
	// appends the specified element to the end of this list.
	public void add(Object data) {
		head.setData(data);
	}
 
	private int getCounter() {
		return counter;
	}
 
	private void incrementCounter() {
		counter++;
	}
 
	private void decrementCounter() {
		counter--;
	}
 
	//  Let's check for null current node before we iterate over it
	public void add(int index,Object data) {
		//add your code here
		Node currentNode = head;
		Node temp = new Node(data);
		
		for(int x=0;x<index && currentNode!=null;x++){
			currentNode = currentNode.getNext();
		}
		
		temp.setNext(currentNode.getNext());
		currentNode.setNext(temp);
		
		incrementCounter();
	}
 
	public Object get(int index){
 		if(index<1){
 			return null;
 		}
 		Node currentNode = null;
 		if(head!=null){
 			currentNode = head.getNext();
 			for(int x=0;x<index && currentNode!=null;x++){
 				currentNode = currentNode.getNext();
 			}
 			if(currentNode==null)
 				return null;
 			return currentNode.getData();
 		}
 		return currentNode;		
	}
 
	// removes the element at the specified position in this list.
	public void remove(int index) 
	{	
		//add your code here
	}
	
	//returns the index for the the data being searched
	public int indexOf(Object data)
	{
		//add your code here	
		return 0;
	}
	
	//replace an element in the given index
	public void set(int index,Object data)
	{
		//add your code here
	}
 
	// returns the number of elements in this list.
	public int size() {
		return getCounter();
	}
 
	public String toString() {
		String output = "";
 
		if (head != null) {
			Node nodeCurrent = head.getNext();
			while (nodeCurrent != null) {
				output += "[" + nodeCurrent.getData().toString() + "]";
				nodeCurrent = nodeCurrent.getNext();
			}
		}
		return output;
	}
 
	private class Node {
		// reference to the next node in the chain, or null if there isn't one.
		private Node next;
 
		// data carried by this node. could be of any type you need.
		private Object data;
 
		// Node constructor
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}
 
		// another Node constructor if we want to specify the node to point to.
		public Node(Object dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}
 
		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}
 
		public void setData(Object dataValue) {
			data = dataValue;
		}
 
		public Node getNext() {
			return next;
		}
 
		public void setNext(Node nextValue) {
			next = nextValue;
		}
		
		//you don't need this method but its nice to have one to compare Nodes
		public boolean equals(Node psNode)
		{
			if(data.equals(psNode.data))
			{
				return true;
			}
			return false;
		}
 
	}
}
