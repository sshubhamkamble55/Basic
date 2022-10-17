package arrayList;

import java.util.ArrayList;
import java.util.Collections;

import javax.sound.midi.ControllerEventListener;

public class SortingArrayList {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
	a.add("Swift");
	a.add("Scorpio");
	a.add("Waganor");
	a.add("Unicorn");
	a.add("Activa");
	
	System.out.println("Befor Sorting");
	System.out.println(a);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	//Sorting in Accending Order
	System.out.println("After sorting");
	Collections.sort(a);
	System.out.println(a);

	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Reverse / Descending order");
	Collections.sort(a,Collections.reverseOrder());  //For reverse
	System.out.println(a);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	ArrayList <Integer>akk=new ArrayList<Integer>();
	akk.add(5);
	akk.add(4);
	akk.add(55);
	akk.add(22);
	akk.add(3);
	
	
	Collections.reverse(akk);
	System.out.println(akk);
	
	Collections.sort(akk);
	System.out.println(akk);
	
	Collections.sort(akk,Collections.reverseOrder());
	System.out.println(akk);
	
}
}
