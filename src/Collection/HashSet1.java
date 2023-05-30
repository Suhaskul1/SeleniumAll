package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) 
	{
		//Arraylist, vector, linkedlist storage type is Index, but HashSet type is table
		HashSet hs=new HashSet();
		hs.add("suhas");
		hs.add(200);
		hs.add("suhas");
		hs.add(null);
		hs.add(60.60);
		hs.add(null);
		hs.add('B');
		  
		  System.out.println(hs);
		 HashSet1 hs1=new HashSet1();
		 
		 hs1.m1();
		  //Order is not maintain
		  
	}
	
	public void m1()
	{
		ArrayList al= new ArrayList();
		  al.add("suhas");
		  al.add(200);
		  al.add("suhas");
		  al.add(null);
		  al.add(60.60);
		  al.add(null);
		  al.add('B');
		  System.out.println();
		  System.out.println("method m1");
		  System.out.println(al);
		  HashSet hs=new HashSet(al);
		  System.out.println(hs);
	}
}
