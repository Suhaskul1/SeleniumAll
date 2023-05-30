package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayIntoArrayList {

	public static void main(String[] args) 
	{
	 int arr[]= {10,20,30,40,50};
	 ArrayList<Integer> al=new ArrayList(arr.length);
	 for(int s1:arr)
	 {
		 al.add(s1);
	 }
	 System.out.println(al);
	 
	 
	}
}
