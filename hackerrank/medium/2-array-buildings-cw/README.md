# 2. Array - Buildings (CW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You have given a number n, representing the size of array arr.

You are required to print a building representing value of arr using *.

 **Input Format** 

First line consists of an integer n

Second line consists of n spaced integers, representing elements of arr

 **Constraints** 

1 <= n <= 1000

0 <= arr[i] <= 1000

 **Output Format** 

Output the height of the building represented by the values of array arr using *

Example 1

Input

7 9 3 7 6 2 0 4

Output

```
*
*
 ** 
 **        *
 **        *
 **         ** 
 **         **                        *
 **         **         ** 
 **         **         ** 

```

Explanation

Number of stars in each column represents the value of that index of array arr which are tab seprated

Example 2

Input

5

1 2 3 4 5

Output

```
                                *
                         ** 
                 **        *
         **         ** 
 **         **        *

```

Explanation

Number of stars in each column represent the value of that index of array arr which are tab seprated

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T07:09:08.572Z  

```java
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    buildings(arr, n);
  }

  public static void buildings(int[] arr, int n) {
    // your code here
    int max=0;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    for(int i=max;i>=1;i--){
        for(int j=0;j<n;j++){
            if(arr[j]>=i){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }   
  }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/2-array-buildings-cw/problem)