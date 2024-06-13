public class BubbleSortImpl {
    public static void main(String[] args) {
        int[] array = {2, 22, 6, -34, 45, -12, -1};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] arr) {
        for (int lastUnsorted = arr.length - 1; lastUnsorted > 0; lastUnsorted--) {
            boolean swapped = false;
            for (int i = 0; i < lastUnsorted; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        for (int ans : arr) {
            System.out.println(ans);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
