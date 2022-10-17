package linkedList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class BasicLinkedList {
public static void main(String[] args) {
	LinkedList<Integer> arr=new LinkedList<>();
	arr.add(10);
	arr.add(20);
	arr.add(30);
	arr.add(40);
	arr.add(50);
	System.out.println(arr);
	
	arr.addFirst(00);
	arr.addLast(60);
	System.out.println(arr);
	
	arr.add(3, 25);
	System.out.println(arr);
	System.out.println("**************************");
	
	ArrayList<Integer> list=new  ArrayList<>();
	list.add(111);
	list.add(112);
	list.add(113);
	list.add(114);
	list.add(115);
	LinkedList<Integer> con=new LinkedList<>(list);
	System.out.println(con);
	
	TreeSet<Integer> tr=new TreeSet<>();
	tr.add(191);
	tr.add(11);
	tr.add(151);
	tr.add(1);
	tr.add(21);
	
	System.out.println(tr);
	





	
}
}
