package lecture5_basicRecursion.print1ToNWithoutLoop;

//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class GFG
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            Solution.printNos(N);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{

    static void printNos(int N)
    {
        if(N==1) System.out.print("1 ");
        else {
            printNos(N-1);
            System.out.print(N + " ");
        }
    }

}