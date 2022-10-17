package linkedList;

import java.util.LinkedList;

public class Practise__ {
	public static void main(String[] args) {
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(91);
		a.add(50);
		a.add(5);
		a.add(8);
		a.add(55);
		a.add(9);
		a.add(504);
		a.add(15);
		a.add(18);
		a.add(55);
		a.add(null);
		a.add(null);
		
		
		a.addFirst(01);
		a.addLast(1000);
		System.out.println(a);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
	}

}
