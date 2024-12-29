package lecture5_basicRecursion.sumOfFirstNNumbers;

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(Solution.sumOfSeries(n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{

    static long sumOfSeries(long n) {
        //sum of cubes of first n natural numbers is n^2 * (n+1)^2 /4
        return n*n*(n+1)*(n+1)/4;
    }

}