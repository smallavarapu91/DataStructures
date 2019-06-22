package practice;
class Prac3
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int generalizedGCD(int num, int[] arr)
    {
        // WRIstatic int findGCD(int arr[], int n) 
        int result = arr[0]; 
        for (int i = 1; i < num; i++) 
            result = gcd(arr[i], result); 
  
        return result; 
    }
    private static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
    public static void main(String[] args) 
    { 
        int arr[] = { 2, 4, 6, 8, 16 }; 
        int n = arr.length; 
        System.out.println(generalizedGCD(n, arr)); 
    } 

    // METHOD SIGNATURE ENDS
}
