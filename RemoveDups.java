package practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDups {
	
	Boolean isUnique(String input)
	{
		Boolean value = false;
		char[] mycharArray = input.toCharArray();
		for(int i=0; i<input.length(); i++) {
			for(int j=input.length()-1; j>i; j--) {
				if(mycharArray[i]!=mycharArray[j]) {
					value = true;
				}
			}
		}
		
		return value;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word = "differ";
RemoveDups rem = new RemoveDups();
System.out.println(rem.isUnique(word));
	}

}
