public class MedianFinder {
    public static double findMedian(int[] arr) {
        int n = arr.length;
        int k = n / 2; // The position of the median

        int median = findKthSmallest(arr, 0, n - 1, k);

        // If the array has an even number of elements, find the next smallest element
        if (n % 2 == 0) {
            int nextSmallest = findKthSmallest(arr, 0, n - 1, k - 1);
            return (median + nextSmallest) / 2.0;
        }

        return median;
    }

    public static int findKthSmallest(int[] arr, int left, int right, int k) {
        if (left == right) {
            return arr[left];
        }

        int pivotIndex = partition(arr, left, right);
        if (k == pivotIndex) {
            return arr[k];
        } else if (k < pivotIndex) {
            return findKthSmallest(arr, left, pivotIndex - 1, k);
        } else {
            return findKthSmallest(arr, pivotIndex + 1, right, k);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        double median = findMedian(arr);
        System.out.println("Median: " + median);
    }
}
