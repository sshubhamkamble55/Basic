package SetBasic;

import java.util.HashSet;

public class HashSet_ {
public static void main(String[] args) {
	//not allow duplicate, doesnt follow order of inssertion
	HashSet<Integer> a = new HashSet<Integer>();
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
	System.out.println(a);
}
}
