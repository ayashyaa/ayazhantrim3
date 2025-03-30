public class task2 {

    // Recursive function to find the sum of array elements
    public static double findSum(int[] arr, int n) {
        if (n == 1) { //Base case
            return arr[0];
        }

        // adding the last element to the sum of the remaining array
        return arr[n - 1] + findSum(arr, n - 1);
    }

    // this function calculates the average of array elements
    public static double findAverage(int[] arr, int n) {
        if (n == 0) return 0; //edge case, to avoid division to 0
        return findSum(arr, n) / n; //using sum to compute the average
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        int n = arr.length;

        System.out.println("Average: " + findAverage(arr, n));
    }
}

