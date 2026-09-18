# Common Divisors

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two positive integers  **a**  and  **b**, return the count of all positive integers that are divisors of both a and b.

 **Examples:** 

```
Input: a = 12, b = 24
Output: 6 
Explanation:The common divisors of 12 and 24 are 1, 2, 3, 4, 6, and 12. Hence, the answer is 6.

```

```
Input: a = 3, b = 17
Output: 1
Explanation: The only common divisor of 3 and 17 is 1. Hence, the answer is 1.
```

 **Constraints:** 

1 ≤ a, b ≤10^5

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T09:10:40.073Z  

```java
class Solution {
    int commDiv(int a, int b) {
        // code here
        int count=0;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/common-divisors4712/1)