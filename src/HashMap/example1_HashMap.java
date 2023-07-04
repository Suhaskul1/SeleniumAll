package HashMap;

import java.util.HashMap;
import java.util.Set;

public class example1_HashMap {

	public static void main(String[] args) 
	{
	  HashMap<Integer, String> mp=new HashMap<>();
	  
	  mp.put(101, "Suresh");
	  mp.put(102, "Ramesh");
	  mp.put(103, "Mahesh");
	  
	  System.out.println(mp);
	  
	  //to update previous key
	  
	  mp.put(101, "SURESH");
	  System.out.println(mp);
	  
	  //to verify key is present or no
	  
	 System.out.println(mp.containsKey(103));
	 
	 //to get value of key
	 
	 System.out.println(mp.get(101));
	 
	 System.out.println();
	 //to get all keys
	 Set<Integer> allkeys = mp.keySet();
	 
	 for(Integer key: allkeys)
	 {
		 System.out.println(key);
	 }
	 
	 System.out.println();
	 //to get all keys and values
	 for(Integer key: allkeys)
	 {
		 System.out.println(key+"="+mp.get(key));
	 }
	}
}
