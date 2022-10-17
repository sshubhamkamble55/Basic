package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
public static void main(String[] args) {
	LinkedList<Integer> arr=new LinkedList<>();
	arr.add(10);
	arr.add(20);
	arr.add(30);
	arr.add(40);
	arr.add(50);
	System.out.println("By using for Loop");

	for(int i=0;i<arr.size();i++){
		System.out.print(arr.get(i)+" ");
	}System.out.println();
	
	arr.addFirst(9);
	arr.addLast(60);
	
	System.out.println("!~~~~~~~~~~~~~~~~~~~~~~~~~~~~`1");
	LinkedList<Integer> arr1=new LinkedList<>(arr);
	System.out.println("By using forEach Loop");
	for(int j:arr){
		System.out.println(j);
	}
	System.out.println("!~~~~~~~~~~~~~~~~~~~~~~~~~~~~`1");
	System.out.println("First element= "+arr1.getFirst());
	System.out.println("Last element= "+arr1.getLast());
	
	arr1.removeFirst();
	arr1.removeLast();
	System.out.println("!~~~~~~~~~~~~~~~~~~~~~~~~~~~~`1");
	
	System.out.println(arr);
	System.out.println(arr1);
	
	System.out.println("By using Iterator");
	Iterator<Integer> i = arr.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}
	
	System.out.println("!~~~~~~~~~~~~~~~~~~~~~~~~~~~~`1");
	System.out.println("By using ListIterator");
	ListIterator<Integer> i1 = arr1.listIterator();
	while(i1.hasNext()){
		System.out.println(i1.next());
	}


}
}
