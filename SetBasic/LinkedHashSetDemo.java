package SetBasic;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	LinkedHashSet <String> lk=new LinkedHashSet<String>();
	lk.add("Shubham");
	lk.add("six");
	lk.add("seven");
	lk.add("eight");
	lk.add("nine");
	lk.add(null);

	lk.add("one");
	lk.add("two");
	System.out.println(lk);
	lk.add("one");
	lk.add("two");
	lk.add(null);
	lk.add(null);

	System.out.println(lk.remove("two"));          //boolean output
	System.out.println(lk);

	
}
}
