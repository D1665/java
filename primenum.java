public class primenum {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false; // Found a divisor, not prime
        }
        return true; // No divisors found, it's prime
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i); // Print the prime number
            }
        }

        
    }
}
