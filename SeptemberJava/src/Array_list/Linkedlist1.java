package Array_list;

import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l=new LinkedList();
		
		l.add(20);
		l.add('a');
		l.add("Hiiiiii");
		l.add(null);
		l.add(20);
		l.add('a');


		System.out.println(l.size());
		System.out.println(l.get(5));
		System.out.println("");
		l.add(2,"bye");
		l.add(2,"piyush");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println(l.toString());

	}

}
