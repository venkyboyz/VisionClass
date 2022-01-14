package sting;

public class d1 {
	

		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
	String str="Hi am learning java";
	int count=0;
	
	String[] z=str.split("");

	for(int j=0;j<=z.length-1;j++)
	{
		System.out.print(z[j]);
		if(z[j]=="")
		{
			count++;
		}
	}
	System.out.println("");
	System.out.println("count="+count);

	}
}
