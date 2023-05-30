package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset1 {

	public static void main(String[] args) 
	{
	  LinkedHashSet lhs=new LinkedHashSet();
	  
	  lhs.add(200);
	  lhs.add("suhas");
	  lhs.add(200);
	  lhs.add(null);
	  lhs.add('Y');
	  lhs.add(null);
	  lhs.add(50.5f);
	  
	  System.out.println(lhs);
	  System.out.println();
	  System.out.println("using iterator");
	  
	  Iterator itr=lhs.iterator();
	  
	  for(Object s1:lhs)
	  {
		  System.out.println(s1);
	  }
	}
}
