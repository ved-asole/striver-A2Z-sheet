package lecture4_basicMaths.reverseANumber;

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
            Solution ob = new Solution();
            System.out.println( ob.isPalindrome(N));
        }
    }
}
// } Driver Code Ends


//User function template for Java


class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0))return false;
        int rev=0;
        while(x>rev) {
            rev = rev*10+(x%10);
            x/=10;
        }
        return (x==rev) || (x==rev/10);
    }
}