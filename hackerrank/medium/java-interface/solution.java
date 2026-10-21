


// 1. Create the MyCalculator class implementing the interface
class MyCalculator implements AdvancedArithmetic {
    
    // 2. Implement the divisor_sum method
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        
        // Loop from 1 to n to find all numbers that divide n perfectly
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
}


//Write your code here

