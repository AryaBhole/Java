import java.util.*;

class Solution {
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

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) {
            /* CRITICAL FIX: Using (long) prevents the 2 * Integer.MAX_VALUE overflow.
               Without this, 2 * 2147483647 becomes -2, making the condition true incorrectly.
            */
            while (right <= high && (long) arr[i] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        if (low >= high) return 0;
        
        int mid = low + (high - low) / 2;
        int count = mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        
        count += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);
        
        return count;
    }
    
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return mergeSort(nums, 0, nums.length - 1);
    }
}