package constructor;

public class ClassA {
	
	int empId=1;
	String empName;
	
	ClassA(int a,String b){
		
		empId=a;
		empName=b;
		
		//System.out.println("Default constructor");
		//System.out.println("Emp Id = "+empId);
		//System.out.println("Emp name = "+empName);
		
	}
	
	public static void main(String[] args) {
		
		ClassA obj=new ClassA(10,"tushar");
		
		ClassA obj2=new ClassA(20,"vishal");
		
		System.out.println("Emp Id = "+obj.empId);
		System.out.println("Emp name = "+obj.empName);
		
		
	}

}
