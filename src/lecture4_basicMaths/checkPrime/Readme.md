# Check Prime
#### Code360 624934 - [Problem link](https://www.naukri.com/code360/problems/check-prime_624934)


A prime number is a positive integer that is divisible by exactly 2 integers, 1 and the number itself.

You are given a number 'n'.

Find out whether 'n' is prime or not.


#### Example 1:

    Input: 'n' = 5

    Output: YES
    
    Explanation: 5 is only divisible by 1 and 5. 2, 3 and 4 do not divide 5.

#### Example 2:

    Input: 'n' = 6

    Output: NO
    
    Explanation: 
    6 is divisible by 1, 2, 3, and 6. 
    Therefore it is not a prime number.
    Numbers having more than two factors are known as composite numbers.

#### Example 3:

    Input: 'n' = 1

    Output: NO
    
    Explanation: 
    1 is divisible only by 1, having only one factor. Therefore it is not a prime number.
    1 is neither a prime nor a composite number.

#### Constraints:

-    `1 <= 'n' <= 10 ^ 9`

#### Expected time complexity : `O(sqrt('n'))`

#### Time limit: 1 second