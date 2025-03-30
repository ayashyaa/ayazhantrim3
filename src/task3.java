public class task3 {
    public static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;
        if (divisor == 1) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor - 1);
    }


    public static void main(String[] args) {
        int num1 = 7, num2 = 10;
        System.out.println(num1 + " is " + (isPrime(num1, num1 - 1) ? "Prime" : "Composite"));
        System.out.println(num2 + " is " + (isPrime(num2, num2 - 1) ? "Prime" : "Composite"));
    }

}

