public class task2 {
    public static double findSum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return arr[n - 1] + findSum(arr, n - 1);
    }

    public static double findAverage(int[] arr, int n) {
        if (n == 0) return 0;
        return findSum(arr, n) / n;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        int n = arr.length;

        System.out.println("Average: " + findAverage(arr, n));
    }
}

