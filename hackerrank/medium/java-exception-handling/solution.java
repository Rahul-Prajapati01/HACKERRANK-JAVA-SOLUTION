
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int n, int p) throws Exception {
        // If either n or p is negative, throw an exception
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        // If both n and p are zero, throw an exception
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        // Calculate and return n raised to the power of p
        return (long) Math.pow(n, p);
    }
    
}

