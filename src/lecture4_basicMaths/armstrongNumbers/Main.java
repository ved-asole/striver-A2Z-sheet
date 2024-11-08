package lecture4_basicMaths.armstrongNumbers;

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
            if (Solution.isArmstrongNumber(N)) {
                System.out.println(N + " is an Armstrong number.");
            } else {
                System.out.println(N + " is not an Armstrong number.");
            }
        }
    }
}
// } Driver Code Ends


//User function template for Java
class Solution {
    public static boolean isArmstrongNumber(int n) {
        int original = n;
        int length = Integer.toString(n).length();
        int sum=0;
        for (int i = 0; i < length; i++) {
            int digit = n%10;
            sum += (int) Math.pow(digit, length);
            n = n/10;
        }
        return original == sum;
    }
}