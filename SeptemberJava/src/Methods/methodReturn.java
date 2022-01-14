package Methods;

public class methodReturn {

	public static void main(String[] args)
	{
		System.out.println("prog starts");
		
		int sum=0;
		System.out.println("sum="+sum);
		
		sum=add(20,30);
		System.out.println("addition ="+sum);
	
		String str= animal("Dog","cat");
		System.out.println(str);
	}
	
	static int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	static String animal(String n1, String n2)
	{
		return n1+" "+n2;
	}
}
