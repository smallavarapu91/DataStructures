package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Prac6 {
public List<List<Integer>> findOptimalMemory(final int capacity, final List<List<Integer>> foreground,
        final List<List<Integer>> background)
  {
     int i = 0;
     int j = background.size() - 1;
     final List<List<Integer>> result = new ArrayList<>();
     final List<List<Integer>>[] store = new ArrayList[capacity + 1];
     Collections.sort(foreground, new Comparator<List<Integer>>()
     {
        @Override
        public int compare(final List<Integer> f, final List<Integer> s)
        {

           return Integer.compare(f.get(1), s.get(1));
        }
     });

     Collections.sort(background, new Comparator<List<Integer>>()
     {
        @Override
        public int compare(final List<Integer> f, final List<Integer> s)
        {

           return Integer.compare(f.get(1), s.get(1));
        }
     });

     while (i < foreground.size() && j > -1)
     {
        final int current = foreground.get(i).get(1) + background.get(j).get(1);
        if (current <= capacity)
        {
           if (store[current] == null)
              store[current] = new ArrayList<>();
           store[current].add(Arrays.asList(new Integer[] { foreground.get(i).get(0), background.get(j).get(0) }));
        }

        if (current <= capacity)
        {
           ++i;
        }
        else if (current > capacity)
        {
           --j;
        }
     }

     while (i < foreground.size())
     {
        final int current = foreground.get(i).get(1) + background.get(0).get(1);
        if (current < capacity)
        {
           if (store[current] == null)
              store[current] = new ArrayList<>();
           store[current].add(Arrays.asList(new Integer[] { foreground.get(i).get(0), background.get(0).get(0) }));
        }
        ++i;
     }

     while (j > -1)
     {

        final int current = foreground.get(foreground.size() - 1).get(1) + background.get(j).get(1);
        if (current < capacity)
        {
           if (store[current] == null)
              store[current] = new ArrayList<>();
           store[current]
                 .add(Arrays.asList(new Integer[] { foreground.get(foreground.size() - 1).get(0), background.get(j).get(0) }));
        }

        --j;
     }

     for (int k = capacity; k > -1; --k)
     {
        if (store[k] != null)
        {
           result.addAll(store[k]);
           break;
        }
     }
     return result;
  }
public static void main(String[] args) {
	Prac6 sol = new Prac6();
	List<List<Integer>> solution = new LinkedList<List<Integer>>();
	solution = sol.findOptimalMemory(10000,Arrays.asList(Arrays.asList(1, 3000), Arrays.asList(2, 5000), Arrays.asList(3, 7000),Arrays.asList(4, 10000))
			,Arrays.asList(Arrays.asList(1, 2000), Arrays.asList(2, 9000), Arrays.asList(3, 4000), Arrays.asList(4, 5000)));
	
	System.out.println(solution);
}
}