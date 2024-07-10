### Notes :

- **Euclidean Algorithm :** The GCD of 2 numbers A and B is equal to GDC of (A-B) and B where A > B

Example - 

    gcd(15,10) = gcd(15-10, 10) = gcd(5,10)
               = gcd(10-5, 5) = gcd(5, 5)
               = gcd(5-5, 5) = gcd(0, 5)
               = 5

    So, gcd(15,10) = 5
    
    Here, the time complexity will be O(min(A,B))

- But same can be seen as the GCD of 2 numbers is equal to the GDC of (A%B) and B where A > B

Example -

    gcd(15,10) = gcd(15%10, 10) = gcd(5,10)
               = gcd(10%5, 5) = gcd(0, 5)
               = 5

    So, gcd(15,10) = 5

    Here, the time complexity will be O(log(min(A,B)))

- Whenever we divide the numbers in every iteration or the inputs becomes half after every 
  iteration then the time complexity becomes logirithmic i.e. ***O(log N)*** where N is inputs

- **The LCM(Lowest Common Multiple) = (A * B) / GCD (Greatest Common Divisor)**

**Sample Answer :**

```java
class Solution {

  // helper method to get gcd of 2 numbers.
  static Long gcd(Long a, Long b)
  {
    if(a == 0)
      return b;

    return gcd(b%a, a);
  }

  static Long[] lcmAndGcd(Long A , Long B) {

    Long[] arr = new Long[2];

    Long g = gcd(A,B);   // gcd of two numbers.
    Long l = (A*B)/g;    // product of 2 numbers divided by their gcd gives their lcm.

    arr[0] = l;
    arr[1] = g;

    return arr;
  }
  
}
```