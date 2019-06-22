package practice;

public class Span {

	int[] findSpan(int[] input, int n)
	{
		int[] output = new int[n];
		output[0] = 1;
		for(int i=0; i<n;i++) {
			int counter = 1;
			while((i-counter)>=0 && input[i]>input[i-counter])
			{
				counter = counter + output[i-counter];
			}
			output[i] = counter;
		}
		
		
		return output;
		
	}
	
	public static void main(String[] args) {
		
		int[] data = {20,10,30,50,10};
		Span span = new Span();
		System.out.println(span.findSpan(data, 4));
	}

}
