public class task1 {
    // Recursive function to find the minimum element in the array
    public static int findMin(int[] arr, int n) {
        if (n == 1) { // Base case, if there's only one element, return it
            return arr[0];
        }
        // Recursive case: compare the last element with the minimum of the rest of the array
        return Math.min(arr[n - 1], findMin(arr, n - 1));
    }
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        int n = arr.length; //getting the size of an array

        //calling the function findMin(arr, n), and printing it
        System.out.println("minimum is:  " + findMin(arr, n));
    }
}
