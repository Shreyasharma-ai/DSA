# 6. Basic - Mathematical Operations(HW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two positive integers. You have to calculate the result by performing +,-,*,/,% operations on them.

 **Input Format** 

The first line of input contains two space-separated integers A and B.

 **Constraints** 

1 <= A <= 10^3

1 <= B <= 10^3

 **Output Format** 

The first line of the output should contain the sum of A and B.

The second line of the output should contain the difference of A and B.

The third line of the output should contain the product of A and B.

The fourth line of the output should contain the quotient of A divided by B.

The fifth line of the output should contain the remainder of A modulus by B.

 **Example 1** 

Input:

```
8 3

```

Output:

```
11
5
24
2
2

```

 **Example 2** 

Input:

```
10 2

```

Output:

```
12
8
20
5
0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T14:47:30.708Z  

```java
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
        sc.close();
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/6-basic-mathematical-operationshw/problem)