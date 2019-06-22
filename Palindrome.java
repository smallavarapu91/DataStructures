package practice;

import java.util.*;

public class Palindrome {
	
	public boolean isPalindromString(String input) {
		int m = 0;
		int k = input.length();
		for (int i = 0; i < input.length() / 2; i++) 
			if (input.charAt(i) != input.charAt(input.length() - i - 1))
				return false;
				return true;
					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String word = "malayalam";
        Palindrome pal = new Palindrome();
        System.out.println(pal.isPalindromString(word));
	}

}
