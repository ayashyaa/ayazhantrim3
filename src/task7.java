public class task7 {
    public static void reverse(int[] arr, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        reverse(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2};  // Given input
        reverse(arr, arr.length - 1);
    }
}
