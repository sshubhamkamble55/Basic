import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class basicIterator {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(15);
	al.add("Shubham");
	al.add("AAA");
	al.add(55);
	al.add(100);
	
	Iterator it=al.iterator();
	
	while (it.hasNext()){
		System.out.print(it.next()+" ");
	}
	System.out.println();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	
	ListIterator ltr = al.listIterator();
	
	while(ltr.hasNext()){
		System.out.print(ltr.next()+" ");
	}
	System.out.println();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	Collections.reverse(al);
	Iterator i = al.iterator();
	while(i.hasNext()){
		System.out.print(i.next()+" ");
	}
}
}
