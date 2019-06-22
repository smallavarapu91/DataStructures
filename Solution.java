package practice;

import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) {
    	//Scanner scan = new Scanner(System.in);
    	for(int i = new Scanner(System.in).nextInt(); i > 0; i--) {
    		String myString = new Scanner(System.in).nextLine();
    		char[] myCharArray = myString.toCharArray();
    		 
    		
    	    String[] s = {new Scanner(System.in).nextLine(), "", ""};
    	    for(int j = 0; j < s[0].length(); j++) {
    	        if(j % 2 == 0) s[1] += s[0].charAt(j);
    	        else s[2] += s[0].charAt(j); }
    	    System.out.println(s[1] + " " + s[2]); }
    }
}

