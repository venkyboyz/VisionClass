package Demo;

public class constructor1 {
	int a;
	String name;
	
	constructor1(){
		System.out.println("a ="+a);
		System.out.println("name ="+name);
	}
	
	constructor1(int c,String d)
	{
		a=c;
		name=d;
		
		System.out.println("============================");
		System.out.println(a+" "+name);
	}
		
	public static void main(String[] args) {
		
		System.out.println("Main class");
		
		
		constructor1 obj1=new constructor1();
		constructor1 obj2= new constructor1(1,"piyush");
		
	}
}
