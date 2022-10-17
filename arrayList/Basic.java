package arrayList;

import java.util.ArrayList;

public class Basic {
public static void main(String[] args) {
	ArrayList<String> march=new ArrayList<String>();

	march.add("Shubham");
	march.add("Shubham1");
	march.add("Shubham2");
	march.add("Shubham3");
	march.add("Shubham4");
	System.out.println(march);
	
	ArrayList<String> nov=new ArrayList<String>();

	nov.add("Shubham");
	nov.add("Shubham1");
	nov.add("Rohit2");
	nov.add("Rohit3");
	nov.add("Rohit4");
	System.out.println(nov);
	System.out.println("************************");
	
	System.out.println(nov.isEmpty());
	System.out.println(nov.contains("Shubham"));
	System.out.println(nov.get(3));
	System.out.println(nov.size());
	System.out.println(nov.addAll(march));
	System.out.println(nov);
	System.out.println("************************");
	System.out.println(nov.remove(5));
	
	System.out.println("************************");

	Object ar[]=march.toArray();
	for(int i=0;i<ar.length;i++){
		System.out.print(ar[i]);
	}
	
	/*march.retainAll(nov);
	System.out.println(march);
	System.out.println(nov);
	System.out.println("************************");
	
	nov.retainAll(march);
	System.out.println(nov);
	System.out.println(march);
	
	System.out.println("************************");
	
	System.out.println(nov);
	System.out.println(march);*/
	
	
}
}



