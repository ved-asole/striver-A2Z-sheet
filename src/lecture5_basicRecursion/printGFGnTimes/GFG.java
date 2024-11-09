package lecture5_basicRecursion.printGFGnTimes;

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
            Solution obj = new Solution();
            obj.printGfg(n);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{

    void printGfg(int n) {
        if(n !=1) printGfg(n -1);
        System.out.print("GFG ");
    }

}