package LinkedList;
public class myLinkedListTest {
	public static myLinkedList myList;
 
	public static void main(String[] args) {

		// Default constructor - let's put "0" into head element.
		myList = new myLinkedList();
 
		// add more elements to LinkedList
		myList.add("Bashful");
		myList.add("Awful");
		myList.add("Jumpy");
		myList.add("Happy");
		
		System.out.println("Print: myList: \t\t" + myList);
		
		//Adding an element at the end
		
		myList.add(2,"Doc");
		System.out.println("Added Doc at index 2: \t\t" + myList);
		
		//Adding an element without index
		myList.add("Dopey");
		System.out.println("Added Doppey at the end: \t\t" + myList);

		//Removing an element given an index
		myList.remove(1);
		System.out.println("Remove Awful at index 1: \t\t" + myList);
		
		//Replacing an element
		myList.set(2, "Sneezy");
		System.out.println("Replace Jumpy at index 2: \t\t" + myList);
		
		//Accessing an element
		String dwarf = (String) myList.get(2);
		System.out.println(dwarf);
		
		//Searching an element
		int indexVal = myList.indexOf("Sneezy");
		System.out.println(indexVal);
		
		
	}
 
}
