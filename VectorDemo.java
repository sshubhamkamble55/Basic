import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector v=new Vector();
	
	v.add(55);
	v.add("Shubham");
	v.add(8055);
	v.add(5);
	v.add(4);
	v.add(55);
	v.add(22);
	v.add(3);
	v.add("Swift");
	v.add("Scorpio");
	v.add("Wvgvnor");
	v.add("Unicorn");
	v.add("vctivv");
	
	System.out.println(v);
	v.set(1, "Number");
	
	System.out.println(v.capacity());
	System.out.println(v.size());
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	int i=1;
	for(Object o:v){
		System.out.println(o+" at position= "+(i++));
	}
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

	System.out.println("Enumeration");
	Enumeration e=v.elements();
	
	while(e.hasMoreElements()){
		System.out.println(e.nextElement());
	}
	
}
}
