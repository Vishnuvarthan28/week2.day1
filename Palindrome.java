package week2.day1;

public class Palindrome {
	
	
	public void isPalindrome()
	{
		String word = "madam";
		String word2 = "";
		for(int i=word.length()-1;i>=0;i--)
		{
			word2 = word2 + word.charAt(i);
		}
		System.out.println(word2);
		if(word.equals(word2)) 
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is a not Palindrome");
		}
	}

	public static void main(String[] args)
	{
		Palindrome obj = new Palindrome();
		obj.isPalindrome();
	}

}
