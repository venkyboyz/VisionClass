package while_loop;

import java.nio.file.spi.FileSystemProvider;

public class WhileLoop 
{
	public static void main(String[] args)
	{
		int a=1;
		
		while(a<=10)
		{
			System.out.println(a);
			++a;
		}
		System.out.println("=====Reverse programee======");
		a=10;
		while(a>=1)
		{
			System.out.println(a);
			--a;
		}
	}
}
