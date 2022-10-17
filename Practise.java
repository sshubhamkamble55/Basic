import java.util.Vector;

public class Practise {

	public static void main(String[] args) {
		Vector<Integer> a=new Vector<Integer>();
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
		
		System.out.println("size= "+a.size());
		System.out.println("capacity= "+a.capacity());
		System.out.println(a);
	}
}
