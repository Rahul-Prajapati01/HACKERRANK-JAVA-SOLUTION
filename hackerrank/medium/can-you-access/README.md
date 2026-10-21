# Java Strings Introduction

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a class *Solution* and an inner class *Inner.Private*. The main method of class *Solution* takes an integer $num$ as input. The *powerof2* in class *Inner.Private* checks whether a number is a power of $2$. You have to call the method *powerof2* of the class *Inner.Private* from the *main* method of the class *Solution*.

**Constraints**   
$ 1 \le num \le 2^{30}$

**Input Format**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T06:09:59.058Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+ B.length());
        if (A.compareTo(B) > 0){
                  System.out.println("Yes");
        
        }
        else{
            System.out.println("No");
            
        }
        String  capitalizedA = A.substring(0,1).toUpperCase() + A.substring(1);
        String  capitalizedB = B.substring(0,1).toUpperCase() + B.substring(1);;

        System.out.println(capitalizedA + " " + capitalizedB);
    }
}




```

---

[View on HackerRank](https://www.hackerrank.com/challenges/can-you-access/problem)