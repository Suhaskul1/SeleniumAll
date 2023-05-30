package Collection;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertArrayIntoHashSet {

	public static void main(String[] args) 
	{
	  Object arr[]= {10,"suhas",10,"RCB",30,'A'};
	  
	  HashSet<Object> hs=new HashSet(Arrays.asList(arr));
	  
	  System.out.println(hs);
	  
	  
	}
}
