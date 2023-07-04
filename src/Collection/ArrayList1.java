package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList(8);
		
		al.add(200);
		al.add("Suhas");
		al.add(65.5f);
		al.add('A');
		al.add(null);
		al.add(200);
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(3, 400);
		
		System.out.println(al);
		
		System.out.println(al.remove(2));
		
		System.out.println(al);
		System.out.println();
		System.out.println("Using iterator");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("using for loop");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println();
		System.out.println("Print data using list iterator");
		
		ListIterator litr = al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println();
		System.out.println("For each loop");
		
		for(Object s1: al)
		{
			System.out.println(s1);
		}
	}
}
