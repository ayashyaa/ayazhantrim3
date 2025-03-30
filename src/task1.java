public class task1 {
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        int n = arr.length;

        System.out.println("minimum is:  " + findMin(arr, n));
    }
}
