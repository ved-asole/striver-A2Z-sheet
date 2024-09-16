package lecture4_basicMaths.checkPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            System.out.println(Solution.isPrime(N));
        }
    }
}
// } Driver Code Ends


//User function template for Java


class Solution {
    public static String isPrime(int num) {
        if(num < 2) return "NO";
        for(int i = 2; i<Math.sqrt(num); i++) if(num % i == 0)return "NO";
        return "YES";
    }
}