package arrayList;

import java.util.ArrayList;

public class BasicDemo {
public static void main(String[] args) {
	//Common Declaration
ArrayList al=new ArrayList();
al.add(15);
al.add("Shubham");
al.add("AAA");
al.add(55);
al.add(100);
System.out.println(al);

al.add(0, "Added");
System.out.println(al);


System.out.println("First index of 15= "+al.indexOf(15));
System.out.println("Size of array= "+al.size());
al.add(5, 15);
System.out.println("Last index of 15= "+al.lastIndexOf(15));
System.out.println("is contain 15 in al= "+al.contains(15));
System.out.println("is contain 155 in al= "+al.contains(155));

System.out.println("Value at index 2= "+al.get(2));
al.set(3, "Shailesh");
al.remove(0);
System.out.println(al);

System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

for(int i=0;i<al.size();i++){
	System.out.print(al.get(i)+" ="+i+" || ");
}
System.out.println();

System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//Advance forLoop
for(Object i:al){
	System.out.println(i);
}

System.out.println(al.isEmpty());




}


}
