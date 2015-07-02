package LLSum;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Given two numbers represented by two lists, 
 * write a function that returns sum list. 
 * The sum list is list representation of addition of two input numbers.
 *
 *Example 1
 *
 *Input:
 *  First List: 5->6->3  // represents number 365
 *  Second List: 8->4->2 //  represents number 248
 *Output
 *  Resultant list: 3->1->6  // represents number 613
 *
 *Example 2
 *
 *Input:
 *  First List: 7->5->9->4->6  // represents number 64957
 *  Second List: 8->4 //  represents number 48
 *Output
 *  Resultant list: 5->0->0->5->6  // represents number 65005
 *
 */
public class LLSum {
	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		
		ll1.add(7);
		ll1.add(5);
		ll1.add(9);
		ll1.add(4);
		ll1.add(6);
		
		ll2.add(8);
		ll2.add(4);
		
		System.out.println(addLists(ll1,ll2));
	}
	public static LinkedList<Integer> addLists(LinkedList<Integer> ll1, LinkedList<Integer> ll2){
		LinkedList<Integer> finalList = null;
		
		int num1 = makeNum(ll1);
		int num2 = makeNum(ll2);
		
		finalList = makeList(num1+num2);
		return finalList;
	}
	private static LinkedList<Integer> makeList(int num) {
		LinkedList<Integer> newList = new LinkedList<Integer>();
		
		int temp=1;
		while(num!=0){
			temp = num%10;
			newList.add(temp);
			num = num/10;
		}
		return newList;
	}
	private static int makeNum(LinkedList<Integer> ll) {
		int finalNum = 0;
		for(int i=0;i<ll.size();i++){
			finalNum += ll.get(i) * Math.pow(10,i);
		}
		return finalNum;
	}
}
