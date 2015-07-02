package stackUsingLL;

import java.util.LinkedList;
import java.util.ListIterator;

public class StackUsingLL {

	public static void main(String[] args) {
		
		StackLL sll= new StackLL(10);
		sll.push(10);
		sll.push(11);
		sll.push(12);
		sll.push(13);
		
		System.out.println("Poping "+sll.pop());
		sll.pop();
		sll.printStack();
	}
	
	

}
class StackLL{
	
	LinkedList<Integer> ll;
	int size;
	StackLL(int size)
	{
		ll = new LinkedList<Integer>();
		this.size = size;
	}
	
	public void push (int value){
			ll.addFirst(value);
		
	}
	
	public int pop(){
		int ele;
		
		ele = ll.removeFirst();
		return ele;
	}
	public void printStack(){
		
		if(ll.size() == 0){
			System.out.println("Its empty !");
			return;
		}
		ListIterator<Integer> li = (ListIterator<Integer>) ll.iterator();
		Integer anInt;
		while (li.hasNext()){
			anInt = (Integer)li.next() ;
			System.out.println(anInt);
		}
	}
}
