package MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashMapBasic {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	hm.put(11, "Shubham");
	
	hm.put(4, "Sandy");
	hm.put(5, "Sandy");
	//System.out.println(hm);
	hm.put(5, "Guddu");     //overrided
	hm.put(6, null);          
	hm.put(null, "NullKey");
	hm.put(8, null);
	hm.remove(null);
	hm.put(20, "Akshay");
	hm.put(2, "Shailesh");
	hm.put(3, "Katty");
	
	
	//System.out.println(hm);
	
	for(Map.Entry m:hm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	System.out.println(hm.get(20));
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>(hm);
	System.out.println(lhm);

}
}
