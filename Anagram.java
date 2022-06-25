package week2.day1;

import java.util.Arrays;

public class Anagram {
	
	public boolean isAnagram()
	{
		String text1 = "stops";
		String text2 = "potss";
		
		if(text1.length()!= text2.length())
		{
		char[] String1 = text1.toCharArray();
		char[] String2 = text2.toCharArray();
		
		Arrays.sort(String1);
		Arrays.sort(String2);
		
		if(Arrays.equals(String1, String2))
		{
			System.out.println("The given text is Anagram");
		}
		else
		{
			System.out.println("The given text is not Anagram");
		}
		
		}
		return false;
	}
		
	public static void main(String[] args) {
		Anagram obj = new Anagram();
		obj.isAnagram();
	}

}
