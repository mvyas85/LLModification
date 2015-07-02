package removeDuplicatesLL;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDup {
	//I am not using custom LinkedList (LL)
	public static void main(String[] args) {
		LL ll = new LL();
		
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		
		Node newN = new Node(55);
		Node ithEle = ll.getNodeAt(3);
		ll.addFirst(newN);
		ll.printList();
		System.out.println(ll.remove(ithEle));
		//removeDupLL(ll);
		//System.out.println(ll);
		ll.printList();
	}
	public static void removeDupLL(LinkedList<Integer> ll){
	
		Set<Integer> set = new HashSet<Integer>();
		set.addAll((Collection<Integer>) ll);
		ll.clear();
		ll.addAll(set);
		
	}
	

}

