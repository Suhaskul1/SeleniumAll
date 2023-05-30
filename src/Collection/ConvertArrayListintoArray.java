package Collection;

import java.util.ArrayList;

public class ConvertArrayListintoArray {

	public static void main(String[] args)
	{
	  ArrayList<String> ar=new ArrayList<String>();
	  
	  ar.add("suhas");
	  ar.add("Akshay");
	  
	  ar.add("ssk");
	  System.out.println(ar);
	  
	  //To convert arraylist into string
	  String str1=ar.toString();
	  System.out.println(str1);
	  
	//convert arraylist to array
	  String strar[]=new String[ar.size()];
	  
	  ar.toArray(strar);
	  System.out.println();
	  
	  
	  for(String s1: strar)
	  {
		  System.out.println(s1);
	  }
	}
}
