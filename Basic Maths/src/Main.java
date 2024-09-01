public class Main {
    public static void main(String[] args) {
        // Print all the divisors of n
        int n = 36;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);  // Print the divisor
                if (n / i != i) {        // Avoid printing the square root twice
                    System.out.println(n / i);  // Print the corresponding divisor
                }
            }
        }
    }
}
