

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
 
