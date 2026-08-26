# 7. Basic - Area & Perimeter of Circle(CW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are required to take the radius of a circle as input from the user, and finally, print the area and perimeter of the circle.

Note: Take pi as 3

 **Input Format** 

One line contains an integer number which is the radius of a circle.

 **Constraints** 

0 <= radius <= 100000 pi = 3

 **Output Format** 

Print the area of the circle in the first line

Print the perimeter of the circle in the second line

 **Example 1** 

Input

```
4

```

Output

```
48
24

```

Explanation

pi  *r*  r = 48 and 2  *pi*  r = 24, where r is the radius.

 **Example 2** 

Input

```
7

```

Output

```
147
42

```

Explanation

pi  *r*  r = 147 and 2  *pi*  r = 42, where r is the radius

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T14:59:37.044Z  

```java
import java.util.*;

public class Solution {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        long r = sc.nextLong();
        long pi = 3;

        long area = pi * r * r;
        long perimeter = 2 * pi * r;

        System.out.println(area);
        System.out.println(perimeter);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/7-basic-area-perimeter-of-circlecw/problem)