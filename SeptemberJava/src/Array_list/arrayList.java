package Array_list;

import java.util.ArrayList;

public class arrayList {

public static void main(String[] args) {
	
ArrayList a=new ArrayList();

a.add(20);
a.add('a');
a.add("Hiiiiii");
a.add(null);
a.add(20);
a.add('a');


System.out.println(a.size());
System.out.println(a.get(5));
System.out.println("");
a.add(2,"bye");
a.add(2,"piyush");
for(int i=0;i<a.size();i++)
{
	System.out.println(a.get(i));
}


}
}
