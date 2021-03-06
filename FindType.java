package week2.day1;

public class FindType 
{

    public static void main(String[] args)
	{
		String test = "$$ Welcome to 2nd Class of Automation $$";
		int digitCount = 0;
		int letterCount = 0;
		int spaceCount = 0;
		int specialCharCount = 0;
		for(int i=0; i<test.length();i++)
		{            
				//to find digit count
				if(Character.isDigit(test.charAt(i)))
				{
					digitCount++;
				}
				//to find letter count
				else if(Character.isLetter(test.charAt(i)))
				{
					letterCount++;
				}
				//to find space count
				else if(Character.isSpaceChar(test.charAt(i)))
				{
					spaceCount++;
				}
				//to find special character count
				else
				{
					specialCharCount++;
				}				
		}
		
		
		System.out.println("Digit Count : "+ digitCount);
		System.out.println("Letter Count : "+ letterCount);
		System.out.println("Space Count : "+spaceCount);
		System.out.println("Special Characters Count : "+specialCharCount);
	}
	
}

