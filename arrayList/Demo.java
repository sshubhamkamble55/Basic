package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo {
public static void main(String[] args) {
	ArrayList <Integer> a=new ArrayList<>();
	a.add(5555);
	a.add(1);
	a.add(5);
	a.add(558);
	a.add(59);
	
	
	ArrayList <Integer> copy=new ArrayList<>(a);
	copy.add(0, 1000);
	System.out.println(a);
	System.out.println(copy);
	//Collections.sort(a,Collections.reverseOrder());
	
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	TreeSet<Integer> lk=new TreeSet<Integer>(a);
	System.out.println(lk);
	
	
}
}
