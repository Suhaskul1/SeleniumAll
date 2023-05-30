package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) 
	{
	  ArrayList al=new ArrayList();	
	  
	    al.add(200);
		al.add("Suhas");
		al.add(65.5f);
		al.add('A');
		al.add(null);
		al.add(200);
		
		System.out.println("Print data using Iterator");
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("using for loop");
		
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println();
		System.out.println("using list iterator");
		
		ListIterator ltr=al.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println();
		System.out.println("using for each loop");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
	}
}
