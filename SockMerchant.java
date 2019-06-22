package practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        Set<Integer> colors = new HashSet<>();
        int numPairs = 0;

        for (int i = 0; i < n; i++) {
            if (!colors.add(ar[i])) {
                numPairs++;
                colors.remove(ar[i]);
            }
        }
        return numPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = 9;
        int[] ar = {10,20,20,10,10,30,50,10,20};

      

        int result = sockMerchant(n, ar);
        System.out.println(result);

    }
}
