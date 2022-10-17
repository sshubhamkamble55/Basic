import java.util.*;

public class Basic {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	
	a.add(10);
	a.add(9);
	a.add(8);
	a.add(5);
	a.add(100);
	a.add(93);
	a.add(85);
	a.add(556);
	a.add(120);
	a.add(39);
	a.add(83);
	a.add(52);
	
	//System.out.println(a.size());
	
	Iterator i=a.iterator();
	int io=0;
	while(i.hasNext()){
		io++;
		//System.out.println(io);
		System.out.println(i.next()+" ="+io);
	}
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	Collections.reverse(a);
	Iterator a2=a.iterator();
	while(a2.hasNext()){
		System.out.print(a2.next()+" ");
	}
	System.out.println();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	ArrayList ar2=new ArrayList();
	ar2.add(1);
	ar2.add(2);
	ar2.add(3);
	ar2.add(4);
	ar2.add(5);
	System.out.print("Original= ");
	Iterator iu=ar2.iterator();
	while(iu.hasNext()){
		System.out.print(iu.next()+" ");
	}
System.out.println();
	Collections.reverse(ar2);
	System.out.print("Reverse= ");
	Iterator i1=ar2.iterator();
	while(i1.hasNext()){
		System.out.print(i1.next()+" ");
	}
}
}
