package Collection;

import java.util.ArrayList;

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
	}
}
