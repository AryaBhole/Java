
class Solution {
    // Function to merge two halves
    public static void merge(int[] arr, int low, int mid, int high) {
        // Using a primitive array avoids the overhead of List<Integer> and Autoboxing
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, k = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) temp[k++] = arr[left++];
        while (right <= high) temp[k++] = arr[right++];

        // Copy back to original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    // Recursive merge sort
    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        // Find mid index
        int mid = low + (high - low) / 2;

        // Sort left half
        mergeSort(arr, low, mid);

        // Sort right half
        mergeSort(arr, mid + 1, high);

        // Merge both halves
        merge(arr, low, mid, high);
    }
}

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1};
        Solution sol = new Solution();
        sol.mergeSort(arr, 0, arr.length - 1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
