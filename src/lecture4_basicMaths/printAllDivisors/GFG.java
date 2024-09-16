package lecture4_basicMaths.printAllDivisors;

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            long ans  = Solution.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{

    static long sumOfDivisors(int N){
        long sum = 0;
        for(int i=1; i <= N; i++) {
            System.out.println("i = " + i + " N/i = " + N/i + " N%i = " + N%i);
            sum+= (long) (N / i) * i;
            System.out.println("sum = " + sum);
        }
        return sum;
    }

    //    Using Double for loops :
    // Time Complexity = O(N^2) and Space Complexity = O(1)

    // static long sumOfDivisors(int N){
    //     long sum = 0;
    //     for(int i=1; i <= N; i++) {
    //         for(int j=1; j<=i; j++) {
    //             if(i%j == 0) sum +=j;
    //             else continue;
    //         }
    //     }
    //     return sum;
    // }


    //    Using Recursion :
    // Time Complexity = O(N^2) and Space Complexity = O(N)

    // static long sumOfDivisors(int N){
    //     return sumOfDivisor(0, N);
    // }

    // static long sumOfDivisor(long sum, int N) {
    //     if(N == 1) return sum+1;
    //     else if (N < 1) return 0;
    //     else {
    //         for(int j=1; j<=N; j++) {
    //             if(N%j == 0) {
    //                 sum +=j;
    //             }
    //             else continue;
    //         }
    //     }
    //     return sumOfDivisor(sum, N-1);
    // }

}