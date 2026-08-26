# 5. Basic - Agent Binod(CW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are required to take input a string agentName, and finally print the line "Hi my name is Agent insert agentName".

 **Input Format** 

First line contains a string which is the name of the agent.

 **Constraints** 

1 <= agentName.size <= 100000

 **Output Format** 

One line output of format "Hi my name is Agent insert agentName"

 **Example 1** 

Input

```
Binod

```

Output

```
Hi my name is Agent Binod

```

 **Example 2** 

Input

```
Binod Bhushan

```

Output

```
Hi my name is Agent Binod Bhushan

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T14:47:14.596Z  

```java
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String agentname=sc.nextLine();
        System.out.println("Hi my name is Agent " + agentname);
        
        sc.close();
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/5-basic-agent-binodcw/problem)