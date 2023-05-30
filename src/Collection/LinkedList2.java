package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args)
	{
	  LinkedList ll=new LinkedList();	
	  
	  ll.add("suhas");
	  ll.add(101);
	  ll.add("dhana");
	  ll.add('A');
	  ll.add(null);
	  ll.add(65.5f);
	  ll.add(null);
	  
	  System.out.println(ll.get(2));
	  System.out.println();
	  
	  System.out.println(ll.contains('A'));
	  System.out.println();
	  
	  ll.set(4, "not null");
	  System.out.println(ll);
	  System.out.println();
	  System.out.println("using iterator");
	  
	  Iterator itr = ll.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  System.out.println();
	  
	  ll.addFirst(200);
	  System.out.println(ll);
	  
	  ll.addLast("RCB");
	  System.out.println(ll);
	  
	  System.out.println(ll.getFirst());
	  System.out.println(ll.getLast());
	  
	  System.out.println();
	  System.out.println(ll.removeFirst());
	  System.out.println(ll.removeLast());
	  System.out.println(ll);
	  
	}
}
