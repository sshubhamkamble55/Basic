package SetBasic;

import java.util.ArrayList;
import java.util.HashSet;

public class hashSetDemo {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add("Shubham");
	h.add("shailesh");
	h.add("one");
	h.add("two");
	h.add("five");
	h.add(null);
	h.add(null);
	h.add(null);
	System.out.println("Size=========== "+h.size());
	System.out.println(h+" ");
	
	h.add("one"); //Duplicate Add
	h.add("two");

	System.out.print(h+" ");
	System.out.println();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	ArrayList a=new ArrayList();
	a.add("six");
	a.add("seven");
	a.add("eight");
	
	a.add("nine");
	a.add("one");
	a.add("two");

	System.out.println(a);
	
	h.addAll(a);
	System.out.println(h);
	
	System.out.println("size= "+h.size());
	h.removeAll(a);
	System.out.println(h);
	h.addAll(a);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

	for(Object val:h){
		System.out.println(val);
	}
	
	System.out.println(h.removeAll(a)+" "+h);



}
}
