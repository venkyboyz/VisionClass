package inheritance;

public class singleLevel {
	
	public static void main(String[] args)
	{
		
		child obj1=new child();
		obj1.display();
		obj1.animal();
		
		
		System.out.println("child class, animal name = "+child.animalName);
		System.out.println("child class, animal Age = "+child.animalAge);
		
		
		parent obj2=new parent();
		System.out.println("parent class, name="+obj2.animalAge);
	}
}
