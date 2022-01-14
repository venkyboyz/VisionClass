package polymorphism;

public class demo {

	void add(int a) {
		System.out.println("a = "+a);
	}
	static int add(int a,int b)
	{
		int c=a+b;
		return(c);
	}
	
	public static void main(String[] args) {		
		overloading o=new overloading();
		o.add(10);
		
		add(10,2);
		System.out.println("add of 2 nos = "+demo.add(3, 5));
		
	}
}
