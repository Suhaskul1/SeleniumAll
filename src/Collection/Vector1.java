package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) 
	{
	  Vector v=new Vector();
	  
	  v.add("suhas");
	  v.add(200);
	  v.add("suhas");
	  v.add(null);
	  v.add(60.60);
	  v.add(null);
	  v.add('B');
	  
	  System.out.println(v);
	  v.get(5);
	  v.add(2, "RCB");
	  System.out.println(v);
	  
	  v.remove(6);
	  System.out.println(v);
	  
	  System.out.println();
	  System.out.println("using iterator");
	  
	  Iterator itr=v.iterator();
	  
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  
	  System.out.println("using for loop");
	  for(int i=0; i<=v.size()-1; i++)
	  {
		  System.out.println(v.get(i));
	  }
	  
	  System.out.println();
	  System.out.println("List iterator");
	  ListIterator litr=v.listIterator();
	  
	  while(litr.hasNext())
	  {
		  System.out.println(litr.next());
	  }
	  
	  System.out.println();
	  System.out.println("for each loop");
	  for(Object s1:v)
	  {
		  System.out.println(s1);
	  }
	}
}
