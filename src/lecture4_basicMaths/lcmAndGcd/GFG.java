package lecture4_basicMaths.lcmAndGcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//{ Driver Code Starts
public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);

            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


//User function template for Java
class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        long lcm = A*B;
        long gcd;
        while(A > 0 && B > 0) {
            if (A > B) A = A%B;
            else B = B%A;
        }
        if (A == 0) gcd = B;
        else gcd = A;
        lcm /= gcd;
        Long[] result = {lcm, gcd};
        return result;
    }
};