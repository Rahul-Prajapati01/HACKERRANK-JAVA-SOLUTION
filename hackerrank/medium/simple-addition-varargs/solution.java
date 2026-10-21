

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
