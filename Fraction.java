package practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Fraction {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
      
    	int positive = 0;
    	int negative = 0;
    int lenghtofarray = arr.length;
    	int num = 0;
    	int[] newarray = new int [2];
    	
    	
    	for (int i=0; i<lenghtofarray; i++) {
    		if(arr[i] > 0) {
    			positive++;
    		}
    		else if (arr[i] < 0) {
    			negative++;
    		}
    		else num++;
    			
    	}
    	newarray[0] = positive/lenghtofarray;
    	newarray[1] = negative/lenghtofarray;
    	newarray[2] = num/lenghtofarray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

