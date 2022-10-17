package SetBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeDemo {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<>();
		t.add("b");
		t.add("c");
		t.add("a");
		t.add("d");
		t.add("e");
		t.add("e");
		//t.add(null);               not Allowed null Values

		System.out.println(t);
		System.out.println("First "+t.first());
		System.out.println("last "+t.last());
		//remove first last
		t.pollFirst();
		t.pollLast();
		
		System.out.println(t);
		
		//varifing immidiate upper and lowe value
		String val="c";
		System.out.println("higher= "+t.higher(val));
		System.out.println("lower= "+t.lower(val));
		
		Iterator it = t.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("~~~~~~~~~~~~~~");	
		
		for(String s:t){
			System.out.println(s);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
		
		TreeSet <Integer>ts=new TreeSet<>();
		ts.add(8055);
		ts.add(2);
		ts.add(8);
		ts.add(5);
		ts.add(4);
		ts.add(55);
		
		ts.remove(8055);
		System.out.println(ts);
		
		int i=1;
		
		Iterator<Integer> it1 = ts.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next()+" At Position "+(i));
			i++;
		}



		

	}

}
