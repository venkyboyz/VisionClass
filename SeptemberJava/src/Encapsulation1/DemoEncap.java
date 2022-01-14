package Encapsulation1;

public class DemoEncap {
	

	private int emp=10;
	private String name ="abc";

	public int getid()
	{
		return emp;
	}
	
	public String getnm()
	{
		return name;
	}
	public void setnm(String name1)
	{
		name=name1;
		name="hiii";
	}
	public void setId(int id1)
	{
		emp=id1;
	}
	
	public static void main(String[] args) {
		
	}
}

