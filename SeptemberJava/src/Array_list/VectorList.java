package Array_list;

import java.util.Vector;

public class VectorList {
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(20);
		v.add('a');
		v.add("Hiiiiii");
		v.add(null);
		v.add(20);
		v.add('a');


		System.out.println(v.size());
		System.out.println(v.get(5));
		System.out.println("");
		v.add(2,"bye");
		v.add(2,"piyush");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		
	}
}
