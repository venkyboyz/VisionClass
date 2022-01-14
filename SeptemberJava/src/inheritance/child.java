package inheritance;

public class child extends parent{
	
	static int animalAge=5;
	static String animalName="cat";
	
	void display()
	{
		System.out.println("==== Child class +======");
		System.out.println("Animal age ="+animalAge);
		System.out.println("Animal Name ="+animalName);
	}

}
