package lecture5_basicRecursion.printNto1WithoutLoop;

//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printNos(n);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{

    void printNos(int N) {
        if(N==1) System.out.print(1);
        else{
            System.out.print(N+" ");
            printNos(N-1);
        }
    }

}