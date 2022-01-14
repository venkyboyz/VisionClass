package polymorphism;

public class overloading {

	void add(int a) {
		System.out.println("a = "+a);
	}
	void add(int a,int b)
	{
		System.out.println("a+b = "+(a+b));
	}
	void add(char c, int a)
	{
		System.out.println("c+a= "+(c+a));
	}
	void add(char a)		
	{
		System.out.println("char c= "+a);
	}	
	public static void main(String[] args) {		
		overloading o=new overloading();
		o.add(10);
		
		o.add(10,2);
		
		char z='a';
		o.add(z,5);
		
		o.add(z);
	}
}
