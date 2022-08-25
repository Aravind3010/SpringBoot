package collectionList;

import java.util.LinkedList;

public class Llist {

	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<Integer>();
		num.add(10);
		num.add(15);
		num.add(20);
		num.add(25);
		for (int i : num) {
			System.out.println(i);
		}
		num.addFirst(5);      //addItem at first
		System.out.println(num);

		num.addLast(30);        //addItem at Last
		System.out.println(num);
		
		System.out.println(num.getFirst()); //getFirst
		
		System.out.println(num.getLast());  //getLast
		
		System.out.println(num.removeFirst());  //removeFirst
		
		System.out.println( num.removeLast());  //removeLast
	}
}
