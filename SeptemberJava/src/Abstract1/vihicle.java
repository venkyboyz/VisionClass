package Abstract1;

abstract public class vihicle {
	
	int a=10;
	abstract void start();
	}

	class scooter extends vihicle
	{
		void start()
		{
			System.out.println("scooter start with kick");
		}
	}
	class car extends vihicle
	{
		void start()
		{
			System.out.println("car start with key");
		}
	}

