# Java Varargs - Simple Addition

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a class *Solution* and its *main* method in the editor. <br>Your task is to create the class *Add* and the required methods so that the code prints the *sum of the numbers* passed to the function *add*.  

**Note:** Your *add* method in the *Add* class must print the *sum* as given in the *Sample Output*


**Input Format**

There are six lines of input, each containing an integer.

**Output Format**

There will be only four lines of output. Each line contains the sum of the *integers* passed as the parameters to *add* in the *main* method.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T06:16:09.620Z  

```java


class Add {
    // Implement varargs method to accept any number of integers
    public void add(int... numbers) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            sb.append(numbers[i]);
            
            // Append '+' sign between integers
            if (i < numbers.length - 1) {
                sb.append("+");
            }
        }
        
        // Append the final sum
        sb.append("=").append(sum);
        System.out.println(sb.toString());
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/simple-addition-varargs/problem)