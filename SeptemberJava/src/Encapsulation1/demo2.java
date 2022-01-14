package Encapsulation1;

public class demo2 {

	public static void main(String[] args) {
		
	
	DemoEncap obj1=new DemoEncap();
	
	int a=obj1.getid();
	System.out.println(obj1.getid());
	System.out.println(a);
	System.out.println(obj1.getnm());
	
	obj1.setId(20);
	obj1.setnm("xyz");
	
	System.out.println("Id ="+obj1.getid());
	System.out.println("emp ="+ obj1.getnm());

	}
}
