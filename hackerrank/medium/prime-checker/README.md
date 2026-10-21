# Prime Checker

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a class *Solution* and its *main* method in the editor. Your task is to create a class *Prime*. The class *Prime* should contain a single method *checkPrime*. 

The locked code in the editor will call the *checkPrime* method with one or more integer arguments. You should write the *checkPrime* method in such a way that the code prints only the [prime numbers](https://en.wikipedia.org/wiki/Prime_number).

Please read the code given in the editor carefully. Also please do not use method overloading!  

**Note:** 
You may get a compile time error in this problem due to the statement below:

      BufferedReader br=new BufferedReader(new InputStreamReader(in));
      
This was added intentionally, and you have to figure out a way to get rid of the error.      


**Input Format**

There are only five lines of input, each containing one integer.

**Constraints**

 

**Output Format**

 There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed to *checkPrime* in the *main* method of the class *Solution*. In case there is no prime number, then a blank line should be printed.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T07:01:36.473Z  

```java


import static java.lang.System.in;

// 2. Create the Prime class
class Prime {
    // Use Varargs (int...) to accept a variable number of arguments without overloading
    public void checkPrime(int... numbers) {
        StringBuilder sb = new StringBuilder();
        
        for (int num : numbers) {
            if (isPrime(num)) {
                sb.append(num).append(" ");
            }
        }
        
        // Print the result followed by a newline (prints a blank line if no primes found)
        System.out.println(sb.toString().trim());
    }
    
    // Helper method to check if a number is prime
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
 

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/prime-checker/problem)