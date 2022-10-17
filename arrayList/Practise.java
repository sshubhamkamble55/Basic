package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Practise {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(91);
		al.add(50);
		al.add(50);
		al.add(80);
		al.add(55);
		al.add(null);
		al.add(null);
		al.add(91);
		al.add(50);
		al.add(50);
		al.add(80);
		al.add(55);
		al.set(5, 5555);
		al.remove(6);
		
		System.out.println(al.get(0));
		
		System.out.println("11111111111111111111111111111111111111111111111111111");
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		for(int i:al){
			System.out.println(i);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(91);
		a.add(50);
		a.add(5);
		a.add(8);
		a.add(55);
		System.out.print("Original"+a);
		Collections.sort(a);
		System.out.println();
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
	}
}
