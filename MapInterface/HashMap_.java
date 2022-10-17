package MapInterface;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap_ {
public static void main(String[] args) {
	
	HashMap<Integer, String> m = new HashMap<Integer, String>();
	m.put(11, "a");
	m.put(2, "b");
	m.put(3, "x");
	m.put(5, "d");
	m.put(8, "t");
	m.put(4, "g");
	m.put(10, "h");
	System.out.println(m);
	
	HashMap<Integer, String> m2 = new HashMap<Integer, String>(m);
	
	for(Entry<Integer, String> a:m2.entrySet()){
		System.out.println(a);
	}
	
	int a=100;
	long l=a;
	System.out.println(l);
	

	
}
}
