package overriding;

public class overridingFunc {
	
	public static void main(String[] args) {
		
		parent p = new parent();
		System.out.println("parent age = "+p.age);
		p.home();
		p.add();
		p.money();
		
		child c = new child();
		System.out.println();
		System.out.println("child age = "+c.age);
		c.home();
		c.add();
		c.bike();
	
		c.money();
		
		System.out.println("age ="+c.age);
	}

}
