package practice;

public class prac2 {

	public static void main(String[] args) {
		System.out.println(repeatedString("a",1000000000000L));

	}

	static long repeatedString(String s, long n) {
		long numOccurrences = s.replaceAll("[^a]", "").length();
        if (numOccurrences == 0)
            return numOccurrences;

        long remainder = n % s.length();
        long numRepetitions = n / s.length();
        numOccurrences = numRepetitions * numOccurrences;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                numOccurrences++;
            }
        }
        return numOccurrences;
    }
}
