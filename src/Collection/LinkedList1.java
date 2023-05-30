package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedList1 {

	public static void main(String[] args)
	{
	  LinkedList ll=new LinkedList();	
	  
	  ll.add("suhas");
	  ll.add(200);
	  ll.add("suhas");
	  ll.add(null);
	  ll.add(60.60);
	  ll.add(null);
	  ll.add('B');
	  
	  System.out.println(ll);
	  ll.remove(2);
	  
	  System.out.println(ll);
	  System.out.println();
	  System.out.println("using iterator");
	  
	  Iterator itr=ll.iterator();
	  
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  System.out.println();
	  System.out.println("using list iterator");
	  
	  ListIterator litr=ll.listIterator();
	  
	  for(Object s1:ll)
	  {
		  System.out.println(s1);
	  }
	}
}
