# Java If-Else

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.

Let's say you have an integer array and a string array. You have to write a **single** method *printArray* that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

You are given code in the editor. Complete the code so that it prints the following lines:

    1
    2
    3
    Hello
    World

Do not use method overloading because your answer will not be accepted.

**Input Format**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T07:49:16.351Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(n%2!=0){
            System.out.println("Weird");
        }
        else if(n>=2&&n<=5){
             System.out.println("Not Weird");
        }
        else if(n>=6&&n<=20){
            System.out.println("Weird");
            
        }
        else if(n>20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
        
    }

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-generics/problem)