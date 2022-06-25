package week2.day1;

public class ReverseEvenWords 
{

	public static void main(String[] args) 
	{

		String test = "I am a software tester";	
		
		String[] sp=test.split(" "); 
		for(int i=0;i<sp.length;i++)
		{	
		if(i%2==1) 
		{					
			char[] ch=sp[i].toCharArray(); 
			for(int j=ch.length-1;j>=0;j--) 
			{ 
			System.out.print(ch[j]);	
		    }
			System.out.print(" ");	
		}
		else 
		{
			System.out.print(sp[i]+" "); //if i%2 not equal to odd value print this statement
		}
	
	   }
	}
}