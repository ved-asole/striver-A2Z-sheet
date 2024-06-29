package lecture4.countDigits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function emplate for Java


class Solution{
    static int evenlyDivides(int N){
        int originalNum = N;
        int countOfDigits = 0;
        while(N>0){
            int currentDigit = N %10;
            if(currentDigit !=0 && originalNum % currentDigit == 0) countOfDigits++;
            N/=10;
        }
        return countOfDigits;
    }
}