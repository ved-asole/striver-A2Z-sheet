# Sum of all divisors from 1 to n

GFG - https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1


Given a positive integer `N`. The task is to find the value of `Σi from 1 to N F(i)` where function `F(i)` for the number `i` is defined as the sum of all divisors of `i`.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.

Example 1:

    Input: N = 4
    Output: 15
    Explanation: F(1) = 1
                 F(2) = 1 + 2 = 3
                 F(3) = 1 + 3 = 4
                 F(4) = 1 + 2 + 4 = 7
                 ans = F(1) + F(2) + F(3) + F(4)
                     = 1 + 3 + 4 + 7
                     = 15

Example 2:

    Input: N = 5
    Output: 21
    Explanation: F(1) = 1
                 F(2) = 1 + 2 = 3
                 F(3) = 1 + 3 = 4
                 F(4) = 1 + 2 + 4 = 7
                 F(5) = 1 + 5 = 6
                 ans = F(1) + F(2) + F(3) + F(4) + F(5)
                     = 1 + 3 + 4 + 7 + 6
                     = 21

### Your Task:

You don't need to read input or print anything. Your task is to complete the function `sumOfDivisors()` which takes an integer `N` as an input parameter and returns an integer.

Expected Time Complexity: O(N)

Expected Space Complexity: O(1)

Constraints:

-    `1 <= N <= 10^6`