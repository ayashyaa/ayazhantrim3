## Laboratory Work: Recursion and Time Complexity

This laboratory work focuses on implementing recursive functions and analyzing their time complexity. Below is the time complexity analysis for each task.

## Task 1: Finding Minimum in an Array  

```java
public static int findMin(int[] arr, int n) {
    if (n == 1) {
        return arr[0];
    }
    return Math.min(arr[n - 1], findMin(arr, n - 1));
}
```


## Task 2: Finding the Average of an Array
```java
public static double findAverage(int[] arr, int n) {
    if (n == 0) return 0;
    return findSum(arr, n) / n;
}
```

## Task 3: Checking if a Number is a Prime
```java

public static boolean isPrime(int n, int divisor) {
    if (n < 2) return false;
    if (divisor == 1) return true;
    if (n % divisor == 0) return false;
    return isPrime(n, divisor - 1);
}
```

## Task 4: Computing Factorial
```java

public static int factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    return n * factorial(n - 1);
}
```

## Task 5: Computing Fibonacci Number
```java

public static int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

## Task 6: Computing Power of a Number
```java

public static int power(int a, int n) {
    if (n == 0) return 1;
    return a * power(a, n - 1);
}
```

## Task 7: Reverse an Array
```java

public static void reverse(int[] arr, int index) {
    if (index < 0) {
        return;
    }
    System.out.print(arr[index] + " ");
    reverse(arr, index - 1);
}
```

## Task 8: Checking If a String Contains Only Digits

```java
public static boolean isDigitString(String s, int index) {
    if (index == s.length()) {
        return true;
    }
    if (!Character.isDigit(s.charAt(index))) {
        return false;
    }
    return isDigitString(s, index + 1);
}
```

## Task 9: Computing Binomial Coefficient
```java

public static int binomialCoefficient(int n, int k) {
    if (k == 0 || k == n) {
        return 1;
    }
    return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
}
```

## Task 10: Computing GCD
```java

public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}
```











