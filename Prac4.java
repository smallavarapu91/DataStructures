package practice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue; 
  
public class Prac4 { 
  
    // Function to find minimum computation 
    static int minComputation(int numOfSubFiles, List<Integer>files) 
    { 
  
        // create a min heap 
        PriorityQueue<Integer> pq 
            = new PriorityQueue<>(); 
  
  
            // add number of files to priorityQueue 
        		pq.addAll(files); 
  
        // variable to count total computations 
        int count = 0; 
  
        while (pq.size() > 1) { 
  
            // pop two smallest size element 
            // from the min heap 
            int temp = pq.poll() + pq.poll(); 
  
            // add the current computations 
            // with the previous one's 
            count += temp; 
  
            // add new combined file size 
            // to priority queue or min heap 
            pq.add(temp); 
        } 
  
        return count; 
    } 
  
    public static void main(String[] args) 
    { 
  
        // no of files 
        int size = 4; 
  
        // 6 files with their sizes 
        List<Integer> files = new ArrayList<>();
        files.add(8);
        files.add(4);
        files.add(6);
        files.add(12);
        System.out.println(minComputation(size, files)); 
    } 
} 
