package Methods;

public class m1 {
	
	public static void main(String[] args)
	{
		System.out.println("Starting of programme");

		add();
		
		m1 obj1= new m1();
		obj1.sub();
	}
	static void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println("addition of a+b="+c);
	}
	void sub()
	{
		int a=30,b=20;
		int c=a-b;
		System.out.println("subs of (a-b)="+c);
	}
}
