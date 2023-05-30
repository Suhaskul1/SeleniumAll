package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) 
	{
	  TreeSet tr=new TreeSet();
	  tr.add(100);
	  tr.add(200);
	  tr.add(300);
	  tr.add(400);
	  tr.add(500);
	  tr.add(700);
	  
	  System.out.println(tr);
	  tr.remove(400);
	  System.out.println(tr);
	  
	  System.out.println(tr.last());
	  System.out.println(tr.first());
	  System.out.println();
	  
	  tr.pollFirst();     //Remove element from 1st position
	  System.out.println(tr);
	  
	  tr.pollLast();     //remove element from last position
	  System.out.println(tr);
	  
	  System.out.println("using iterator");
	  Iterator itr=tr.iterator();
	  
	  for(Object s1:tr)
	  {
		  System.out.println(s1);
	  }
	}
}
